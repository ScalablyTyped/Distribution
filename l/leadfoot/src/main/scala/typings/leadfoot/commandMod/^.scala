package typings.leadfoot.commandMod

import typings.dojo.thenableMod.Thenable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	* The Command class is a chainable, subclassable object type that can be used to execute commands serially against a
	* remote WebDriver environment. The standard Command class includes methods from the {@link module:leadfoot/Session}
	* and {@link module:leadfoot/Element} classes, so you can perform all standard session and element operations that
	* come with Leadfoot without being forced to author long promise chains.
	*
	* In order to use the Command class, you first need to pass it a {@link module:leadfoot/Session} instance for it to
	* use:
	*
	* ```js
	* var command = new Command(session);
	* ```
	*
	* Once you have created the Command, you can then start chaining methods, and they will execute in order one after
	* another:
	*
	* ```js
	* command.get('http://example.com')
	*   .findByTagName('h1')
	*   .getVisibleText()
	*   .then(function (text) {
	*       assert.strictEqual(text, 'Example Domain');
	*   });
	* ```
	*
	* Because these operations are asynchronous, you need to use a `then` callback in order to retrieve the value from the
	* last method. Command objects are Thenables, which means that they can be used with any Promises/A+ or ES6-confirmant
	* Promises implementation, though there are some specific differences in the arguments and context that are provided
	* to callbacks; see {@link module:leadfoot/Command#then} for more details.
	*
	* ---
	*
	* Each call on a Command generates a new Command object, which means that certain operations can be parallelised:
	*
	* ```js
	* command = command.get('http://example.com');
	* Promise.all([
	*   command.getPageTitle(),
	*   command.findByTagName('h1').getVisibleText()
	* ]).then(function (results) {
	*   assert.strictEqual(results[0], results[1]);
	* });
	* ```
	*
	* In this example, the commands on line 3 and 4 both depend upon the `get` call completing successfully but are
	* otherwise independent of each other and so execute here in parallel. This is different from commands in Intern 1
	* which were always chained onto the last called method within a given test.
	*
	* ---
	*
	* Command objects actually encapsulate two different types of interaction: *session* interactions, which operate
	* against the entire browser session, and *element* interactions, which operate against specific elements taken from
	* the currently loaded page. Things like navigating the browser, moving the mouse cursor, and executing scripts are
	* session interactions; things like getting text displayed on the page, typing into form fields, and getting element
	* attributes are element interactions.
	*
	* Session interactions can be performed at any time, from any Command. On the other hand, to perform element
	* interactions, you first need to retrieve one or more elements to interact with. This can be done using any of the
	* `find` or `findAll` methods, by the `getActiveElement` method, or by returning elements from `execute` or
	* `executeAsync` calls. The retrieved elements are stored internally as the *element context* of all chained
	* Commands. When an element method is called on a chained Command with a single element context, the result will be
	* returned as-is:
	*
	* ```js
	* command = command.get('http://example.com')
	*   // finds one element -> single element context
	*   .findByTagName('h1')
	*   .getVisibleText()
	*   .then(function (text) {
	*     // `text` is the text from the element context
	*     assert.strictEqual(text, 'Example Domain');
	*   });
	* ```
	*
	* When an element method is called on a chained Command with a multiple element context, the result will be returned
	* as an array:
	*
	* ```js
	* command = command.get('http://example.com')
	*   // finds multiple elements -> multiple element context
	*   .findAllByTagName('p')
	*   .getVisibleText()
	*   .then(function (texts) {
	*     // `texts` is an array of text from each of the `p` elements
	*     assert.deepEqual(texts, [
	*       'This domain is established to be used for […]',
	*       'More information...'
	*     ]);
	*   });
	* ```
	*
	* The `find` and `findAll` methods are special and change their behaviour based on the current element filtering state
	* of a given command. If a command has been filtered by element, the `find` and `findAll` commands will only find
	* elements *within* the currently filtered set of elements. Otherwise, they will find elements throughout the page.
	*
	* Some method names, like `click`, are identical for both Session and Element APIs; in this case, the element APIs
	* are suffixed with the word `Element` in order to identify them uniquely.
	*
	* ---
	*
	* Commands can be subclassed in order to add additional functionality without making direct modifications to the
	* default Command prototype that might break other parts of the system:
	*
	* ```js
	* function CustomCommand() {
	*   Command.apply(this, arguments);
	* }
	* CustomCommand.prototype = Object.create(Command.prototype);
	* CustomCommand.prototype.constructor = CustomCommand;
	* CustomCommand.prototype.login = function (username, password) {
	*   return new this.constructor(this, function () {
	*     return this.parent
	*       .findById('username')
	*         .click()
	*         .type(username)
	*         .end()
	*       .findById('password')
	*         .click()
	*         .type(password)
	*         .end()
	*       .findById('login')
	*         .click()
	*         .end();
	*   });
	* };
	* ```
	*
	* Note that returning `this`, or a command chain starting from `this`, from a callback or command initialiser will
	* deadlock the Command, as it waits for itself to settle before settling.
	*/
@JSImport("leadfoot/Command", JSImport.Namespace)
@js.native
class ^[T] protected () extends Command[T] {
  /**
  		 * @constructor module:leadfoot/Command
  		 * @param {module:leadfoot/Command|module:leadfoot/Session} parent
  		 * The parent command that this command is chained to, or a {@link module:leadfoot/Session} object if this is the
  		 * first command in a command chain.
  		 *
  		 * @param {function(setContext:Function, value:any): (any|Promise)} initialiser
  		 * A function that will be executed when all parent commands have completed execution. This function can create a
  		 * new context for this command by calling the passed `setContext` function any time prior to resolving the Promise
  		 * that it returns. If no context is explicitly provided, the context from the parent command will be used.
  		 *
  		 * @param {(function(setContext:Function, error:Error): (any|Promise))=} errback
  		 * A function that will be executed if any parent commands failed to complete successfully. This function can create
  		 * a new context for the current command by calling the passed `setContext` function any time prior to resolving the
  		 * Promise that it returns. If no context is explicitly provided, the context from the parent command will be used.
  		 */
  def this(parent: Command[_]) = this()
  def this(parent: typings.leadfoot.sessionMod.^) = this()
  def this(
    parent: Command[_],
    initialiser: js.Function2[/* setContext */ ContextSetter, /* value */ js.Any, Thenable[T] | T]
  ) = this()
  def this(
    parent: typings.leadfoot.sessionMod.^,
    initialiser: js.Function2[/* setContext */ ContextSetter, /* value */ js.Any, Thenable[T] | T]
  ) = this()
  def this(
    parent: Command[_],
    initialiser: js.Function2[/* setContext */ ContextSetter, /* value */ js.Any, Thenable[T] | T],
    errback: js.Function2[/* setContext */ ContextSetter, /* error */ Error, Thenable[T] | T]
  ) = this()
  def this(
    parent: typings.leadfoot.sessionMod.^,
    initialiser: js.Function2[/* setContext */ ContextSetter, /* value */ js.Any, Thenable[T] | T],
    errback: js.Function2[/* setContext */ ContextSetter, /* error */ Error, Thenable[T] | T]
  ) = this()
}

@JSImport("leadfoot/Command", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  		 * Augments `target` with a method that will call `key` on all context elements stored within `target`.
  		 * This can be used to easily add new methods from any custom object that implements the Element API to any target
  		 * object that implements the Command API.
  		 *
  		 * Functions that are copied may have the following extra properties in order to change the way that Command works
  		 * with these functions:
  		 *
  		 * - `createsContext` (boolean): If this property is specified, the return value from the function will be used as
  		 *   the new context for the returned Command.
  		 */
  def addElementMethod(target: Command[_], key: String): Unit = js.native
  /**
  		 * Augments `target` with a conversion of the `originalFn` method that enables its use with a Command object.
  		 * This can be used to easily add new methods from any custom object that implements the Session API to any target
  		 * object that implements the Command API.
  		 *
  		 * Functions that are copied may have the following extra properties in order to change the way that Command works
  		 * with these functions:
  		 *
  		 * - `createsContext` (boolean): If this property is specified, the return value from the function will be used as
  		 *   the new context for the returned Command.
  		 * - `usesElement` (boolean): If this property is specified, element(s) from the current context will be used as
  		 *   the first argument to the function, if the explicitly specified first argument is not already an element.
  		 */
  def addSessionMethod(target: Command[_], key: String, originalFn: js.Function): Unit = js.native
}

