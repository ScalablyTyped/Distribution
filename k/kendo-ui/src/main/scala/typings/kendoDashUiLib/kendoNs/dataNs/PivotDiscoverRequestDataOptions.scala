package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestDataOptions extends js.Object {
  var command: java.lang.String
  var restrictions: PivotDiscoverRequestRestrictionOptions
}

object PivotDiscoverRequestDataOptions {
  @scala.inline
  def apply(command: java.lang.String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("restrictions")(restrictions)
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
}

