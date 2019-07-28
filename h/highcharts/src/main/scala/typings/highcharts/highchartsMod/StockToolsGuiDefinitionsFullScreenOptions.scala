package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsFullScreenOptions extends js.Object {
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsFullScreenOptions {
  @scala.inline
  def apply(symbol: String = null): StockToolsGuiDefinitionsFullScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[StockToolsGuiDefinitionsFullScreenOptions]
  }
}

