package typings.jqueryValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidation {
  type ErrorDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RulesDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ShouldValidatePredicate = scala.Boolean | typings.jqueryValidation.JQueryValidation.ValidatePredicate
  type ValidatePredicate = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* event */ typings.jquery.JQueryEventObject, 
    scala.Unit
  ]
}
