package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangStockToolsOptions extends js.Object {
  var gui: js.UndefOr[LangStockToolsGuiOptions] = js.undefined
}

object LangStockToolsOptions {
  @scala.inline
  def apply(gui: LangStockToolsGuiOptions = null): LangStockToolsOptions = {
    val __obj = js.Dynamic.literal()
    if (gui != null) __obj.updateDynamic("gui")(gui)
    __obj.asInstanceOf[LangStockToolsOptions]
  }
}

