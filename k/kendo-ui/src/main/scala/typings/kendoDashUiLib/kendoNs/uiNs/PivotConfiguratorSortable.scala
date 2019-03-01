package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorSortable extends js.Object {
  var allowUnsort: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotConfiguratorSortable {
  @scala.inline
  def apply(allowUnsort: js.UndefOr[scala.Boolean] = js.undefined): PivotConfiguratorSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    __obj.asInstanceOf[PivotConfiguratorSortable]
  }
}

