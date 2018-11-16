package typings
package jqueryDotValidationLib.JQueryValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic extends js.Object {
  var messages: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  var methods: ScalablyTyped.runtime.StringDictionary[js.Function] = js.native
  /**
           * Add a compound class method - useful to refactor common combinations of rules into a single class.
           *
           * @param name The name of the class rule to add
           * @param rules The compound rules
           */
  def addClassRules(name: java.lang.String, rules: RulesDictionary): scala.Unit = js.native
  /**
           * Add a compound class method - useful to refactor common combinations of rules into a single class.
           *
           * @param rules A map of className-rules pairs
           */
  def addClassRules(rules: RulesDictionary): scala.Unit = js.native
  /**
           * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
           *
           * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
           * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
           * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
           */
  def addMethod(
    name: java.lang.String,
    method: js.Function3[
      /* value */ js.Any, 
      /* element */ stdLib.HTMLElement, 
      /* params */ js.Any, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  /**
           * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
           *
           * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
           * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
           * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
           */
  def addMethod(
    name: java.lang.String,
    method: js.Function3[
      /* value */ js.Any, 
      /* element */ stdLib.HTMLElement, 
      /* params */ js.Any, 
      scala.Boolean
    ],
    message: java.lang.String
  ): scala.Unit = js.native
  /**
           * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
           *
           * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
           * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
           * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
           */
  def addMethod(
    name: java.lang.String,
    method: js.Function3[
      /* value */ js.Any, 
      /* element */ stdLib.HTMLElement, 
      /* params */ js.Any, 
      scala.Boolean
    ],
    message: js.Function2[/* params */ js.Any, /* element */ stdLib.HTMLElement, java.lang.String]
  ): scala.Unit = js.native
  /**
           * Replaces {n} placeholders with arguments.
           *
           * @param template The string to format.
           */
  def format(template: java.lang.String): js.Function1[/* repeated */js.Any, java.lang.String] = js.native
  def format(template: java.lang.String, args: js.Any*): java.lang.String = js.native
  /**
           * Modify default settings for validation.
           *
           * @param options Options to set as default.
           */
  def setDefaults(defaults: ValidationOptions): scala.Unit = js.native
}

