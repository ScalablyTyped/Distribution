package typings.jquery.JQueryNs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:ban-types
@js.native
trait Callbacks[T /* <: js.Function */] extends js.Object {
  /**
    * Add a callback or a collection of callbacks to a callback list.
    * @param callback A function, or array of functions, that are to be added to the callback list.
    * @param callbacks A function, or array of functions, that are to be added to the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.add/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.add() to add new callbacks to a callback list:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo: " + value );
  };
  ​
  // Another function to also be added to the list
  var bar = function( value ) {
    console.log( "bar: " + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the function "foo" to the list
  callbacks.add( foo );
  ​
  // Fire the items on the list
  callbacks.fire( "hello" );
  // Outputs: "foo: hello"
  ​
  // Add the function "bar" to the list
  callbacks.add( bar );
  ​
  // Fire the items on the list again
  callbacks.fire( "world" );
  ​
  // Outputs:
  // "foo: world"
  // "bar: world"
  ```
    */
  def add(callback: TypeOrArray[T], callbacks: TypeOrArray[T]*): this.type = js.native
  /**
    * Disable a callback list from doing anything more.
    * @see \`{@link https://api.jquery.com/callbacks.disable/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.disable() to disable further calls to a callback list:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the above function to the list
  callbacks.add( foo );
  ​
  // Fire the items on the list
  callbacks.fire( "foo" );
  // Outputs: foo
  ​
  // Disable further calls being possible
  callbacks.disable();
  ​
  // Attempt to fire with "foobar" as an argument
  callbacks.fire( "foobar" );
  // foobar isn't output
  ```
    */
  def disable(): this.type = js.native
  /**
    * Determine if the callbacks list has been disabled.
    * @see \`{@link https://api.jquery.com/callbacks.disabled/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.disabled() to determine if the callbacks list has been disabled:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo:" + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the logging function to the callback list
  callbacks.add( foo );
  ​
  // Fire the items on the list, passing an argument
  callbacks.fire( "hello" );
  // Outputs "foo: hello"
  ​
  // Disable the callbacks list
  callbacks.disable();
  ​
  // Test the disabled state of the list
  console.log ( callbacks.disabled() );
  // Outputs: true
  ```
    */
  def disabled(): Boolean = js.native
  /**
    * Remove all of the callbacks from a list.
    * @see \`{@link https://api.jquery.com/callbacks.empty/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.empty() to empty a list of callbacks:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value1, value2 ) {
    console.log( "foo: " + value1 + "," + value2 );
  };
  ​
  // Another function to also be added to the list
  var bar = function( value1, value2 ) {
    console.log( "bar: " + value1 + "," + value2 );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the two functions
  callbacks.add( foo );
  callbacks.add( bar );
  ​
  // Empty the callbacks list
  callbacks.empty();
  ​
  // Check to ensure all callbacks have been removed
  console.log( callbacks.has( foo ) );
  // false
  console.log( callbacks.has( bar ) );
  // false
  ```
    */
  def empty(): this.type = js.native
  /**
    * Call all of the callbacks with the given arguments.
    * @param args The argument or list of arguments to pass back to the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.fire/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.fire() to invoke the callbacks in a list with any arguments that have been passed:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo:" + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the function "foo" to the list
  callbacks.add( foo );
  ​
  // Fire the items on the list
  callbacks.fire( "hello" ); // Outputs: "foo: hello"
  callbacks.fire( "world" ); // Outputs: "foo: world"
  ​
  // Add another function to the list
  var bar = function( value ){
    console.log( "bar:" + value );
  };
  ​
  // Add this function to the list
  callbacks.add( bar );
  ​
  // Fire the items on the list again
  callbacks.fire( "hello again" );
  // Outputs:
  // "foo: hello again"
  // "bar: hello again"
  ```
    */
  def fire(args: js.Any*): this.type = js.native
  /**
    * Call all callbacks in a list with the given context and arguments.
    * @param context A reference to the context in which the callbacks in the list should be fired.
    * @param args An argument, or array of arguments, to pass to the callbacks in the list.
    * @see \`{@link https://api.jquery.com/callbacks.fireWith/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.fireWith() to fire a list of callbacks with a specific context and an array of arguments:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var log = function( value1, value2 ) {
    console.log( "Received: " + value1 + "," + value2 );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the log method to the callbacks list
  callbacks.add( log );
  ​
  // Fire the callbacks on the list using the context "window"
  // and an arguments array
  ​
  callbacks.fireWith( window, [ "foo","bar" ] );
  // Outputs: "Received: foo, bar"
  ```
    */
  def fireWith(context: js.Object): this.type = js.native
  def fireWith(context: js.Object, args: ArrayLike[_]): this.type = js.native
  /**
    * Determine if the callbacks have already been called at least once.
    * @see \`{@link https://api.jquery.com/callbacks.fired/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.fired() to determine if the callbacks in a list have been called at least once:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo:" + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the function "foo" to the list
  callbacks.add( foo );
  ​
  // Fire the items on the list
  callbacks.fire( "hello" ); // Outputs: "foo: hello"
  callbacks.fire( "world" ); // Outputs: "foo: world"
  ​
  // Test to establish if the callbacks have been called
  console.log( callbacks.fired() );
  ```
    */
  def fired(): Boolean = js.native
  /**
    * Determine whether or not the list has any callbacks attached. If a callback is provided as an argument, determine whether it is in a list.
    * @param callback The callback to search for.
    * @see \`{@link https://api.jquery.com/callbacks.has/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.has() to check if a callback list contains a specific callback:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value1, value2 ) {
    console.log( "Received: " + value1 + "," + value2 );
  };
  ​
  // A second function which will not be added to the list
  var bar = function( value1, value2 ) {
    console.log( "foobar" );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the log method to the callbacks list
  callbacks.add( foo );
  ​
  // Determine which callbacks are in the list
  console.log( callbacks.has( foo ) );
  // true
  console.log( callbacks.has( bar ) );
  // false
  ```
    */
  def has(): Boolean = js.native
  def has(callback: T): Boolean = js.native
  /**
    * Lock a callback list in its current state.
    * @see \`{@link https://api.jquery.com/callbacks.lock/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.lock() to lock a callback list to avoid further changes being made to the list state:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo:" + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the logging function to the callback list
  callbacks.add( foo );
  ​
  // Fire the items on the list, passing an argument
  callbacks.fire( "hello" );
  // Outputs "foo: hello"
  ​
  // Lock the callbacks list
  callbacks.lock();
  ​
  // Try firing the items again
  callbacks.fire( "world" );
  ​
  // As the list was locked, no items were called,
  // so "world" isn't logged
  ```
    * @example ​ ````Use callbacks.lock() to lock a callback list with &quot;memory,&quot; and then resume using the list:
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>callbacks.lock demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  // Simple function for logging results
  var log = function( value ) {
    $( "#log" ).append( "<p>" + value + "</p>" );
  };
  ​
  // Two sample functions to be added to a callbacks list
  var foo = function( value ) {
    log( "foo: " + value );
  };
  var bar = function( value ) {
    log( "bar: " + value );
  };
  ​
  // Create the callbacks object with the "memory" flag
  var callbacks = $.Callbacks( "memory" );
  ​
  // Add the foo logging function to the callback list
  callbacks.add( foo );
  ​
  // Fire the items on the list, passing an argument
  callbacks.fire( "hello" );
  // Outputs "foo: hello"
  ​
  // Lock the callbacks list
  callbacks.lock();
  ​
  // Try firing the items again
  callbacks.fire( "world" );
  // As the list was locked, no items were called,
  // so "foo: world" isn't logged
  ​
  // Add the foo function to the callback list again
  callbacks.add( foo );
  ​
  // Try firing the items again
  callbacks.fire( "silentArgument" );
  // Outputs "foo: hello" because the argument value was stored in memory
  ​
  // Add the bar function to the callback list
  callbacks.add( bar );
  ​
  callbacks.fire( "youHadMeAtHello" );
  // Outputs "bar: hello" because the list is still locked,
  // and the argument value is still stored in memory
  </script>
  ​
  </body>
  </html>
  ```
    */
  def lock(): this.type = js.native
  /**
    * Determine if the callbacks list has been locked.
    * @see \`{@link https://api.jquery.com/callbacks.locked/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.locked() to determine the lock-state of a callback list:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo: " + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the logging function to the callback list
  callbacks.add( foo );
  ​
  // Fire the items on the list, passing an argument
  callbacks.fire( "hello" );
  // Outputs "foo: hello"
  ​
  // Lock the callbacks list
  callbacks.lock();
  ​
  // Test the lock-state of the list
  console.log ( callbacks.locked() );
  // true
  ```
    */
  def locked(): Boolean = js.native
  /**
    * Remove a callback or a collection of callbacks from a callback list.
    * @param callbacks A function, or array of functions, that are to be removed from the callback list.
    * @see \`{@link https://api.jquery.com/callbacks.remove/ }\`
    * @since 1.7
    * @example ​ ````Use callbacks.remove() to remove callbacks from a callback list:
  ```javascript
  // A sample logging function to be added to a callbacks list
  var foo = function( value ) {
    console.log( "foo: " + value );
  };
  ​
  var callbacks = $.Callbacks();
  ​
  // Add the function "foo" to the list
  callbacks.add( foo );
  ​
  // Fire the items on the list
  callbacks.fire( "hello" );
  // Outputs: "foo: hello"
  ​
  // Remove "foo" from the callback list
  callbacks.remove( foo );
  ​
  // Fire the items on the list again
  callbacks.fire( "world" );
  ​
  // Nothing output as "foo" is no longer in the list
  ```
    */
  def remove(callbacks: T*): this.type = js.native
}

