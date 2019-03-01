package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceAxisOptions extends js.Object {
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
}

object PivotDataSourceAxisOptions {
  @scala.inline
  def apply(name: java.lang.String, expand: js.UndefOr[scala.Boolean] = js.undefined): PivotDataSourceAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[PivotDataSourceAxisOptions]
  }
}

