package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceAxisOptions extends js.Object {
  var expand: js.UndefOr[Boolean] = js.undefined
  var name: String
}

object PivotDataSourceAxisOptions {
  @scala.inline
  def apply(name: String, expand: js.UndefOr[Boolean] = js.undefined): PivotDataSourceAxisOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[PivotDataSourceAxisOptions]
  }
}

