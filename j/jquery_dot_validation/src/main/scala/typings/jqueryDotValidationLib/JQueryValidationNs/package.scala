package typings
package jqueryDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidationNs {
  type ShouldValidatePredicate = scala.Boolean | ValidatePredicate
  type ValidatePredicate = js.Function2[
    /* element */ stdLib.HTMLElement, 
    /* event */ jqueryLib.JQueryEventObject, 
    scala.Unit
  ]
}
