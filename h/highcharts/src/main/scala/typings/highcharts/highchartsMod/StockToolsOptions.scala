package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsOptions extends js.Object {
  /**
    * (Highstock) Definitions of buttons in Stock Tools GUI.
    */
  var gui: js.UndefOr[StockToolsGuiOptions] = js.undefined
}

object StockToolsOptions {
  @scala.inline
  def apply(gui: StockToolsGuiOptions = null): StockToolsOptions = {
    val __obj = js.Dynamic.literal()
    if (gui != null) __obj.updateDynamic("gui")(gui.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsOptions]
  }
}

