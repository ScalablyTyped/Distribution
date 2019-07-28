package typings.jqueryDotValidation

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidationNs {
  type ErrorDictionary = StringDictionary[String]
  type RulesDictionary = StringDictionary[js.Any]
  type ShouldValidatePredicate = Boolean | ValidatePredicate
  type ValidatePredicate = js.Function2[/* element */ HTMLElement, /* event */ JQueryEventObject, Unit]
}
