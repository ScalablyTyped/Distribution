package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsFlagsFlagCirclepinOptions extends js.Object {
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsFlagsFlagCirclepinOptions {
  @scala.inline
  def apply(symbol: String = null): StockToolsGuiDefinitionsFlagsFlagCirclepinOptions = {
    val __obj = js.Dynamic.literal()
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsFlagCirclepinOptions]
  }
}

