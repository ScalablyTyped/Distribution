package typings.jqueryDotValidation.JQueryValidation

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic extends js.Object {
  var messages: StringDictionary[String] = js.native
  var methods: StringDictionary[js.Function] = js.native
  /**
    * Add a compound class method - useful to refactor common combinations of rules into a single class.
    *
    * @param name The name of the class rule to add
    * @param rules The compound rules
    */
  def addClassRules(name: String, rules: RulesDictionary): Unit = js.native
  /**
    * Add a compound class method - useful to refactor common combinations of rules into a single class.
    *
    * @param rules A map of className-rules pairs
    */
  def addClassRules(rules: RulesDictionary): Unit = js.native
  /**
    * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
    *
    * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
    * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
    * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
    */
  def addMethod(
    name: String,
    method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean]
  ): Unit = js.native
  def addMethod(
    name: String,
    method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean],
    message: String
  ): Unit = js.native
  def addMethod(
    name: String,
    method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean],
    message: js.Function2[/* params */ js.Any, /* element */ HTMLElement, String]
  ): Unit = js.native
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String): js.Function1[/* repeated */ js.Any, String] = js.native
  def format(template: String, args: js.Any*): String = js.native
  /**
    * Modify default settings for validation.
    *
    * @param options Options to set as default.
    */
  def setDefaults(defaults: ValidationOptions): Unit = js.native
}

