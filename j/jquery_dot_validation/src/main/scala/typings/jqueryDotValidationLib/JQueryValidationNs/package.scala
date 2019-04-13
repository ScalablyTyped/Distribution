package typings
package jqueryDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidationNs {
  type ErrorDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RulesDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ShouldValidatePredicate = scala.Boolean | ValidatePredicate
  type ValidatePredicate = js.Function2[
    /* element */ stdLib.HTMLElement, 
    /* event */ jqueryLib.JQueryEventObject, 
    scala.Unit
  ]
}
