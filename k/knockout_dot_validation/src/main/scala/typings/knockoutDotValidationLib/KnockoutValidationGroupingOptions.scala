package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationGroupingOptions extends js.Object {
  /**
    * indicates whether to walk the ViewModel (or object)
    * recursively, or only walk first-level properties.
    */
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * indicates whether changes to observableArrays inside
    * the model should cause the validator to re-run
    */
  var live: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * indicates whether the returned errors object
    * is a ko.computed or a simple function
    */
  var observable: js.UndefOr[scala.Boolean] = js.undefined
}

