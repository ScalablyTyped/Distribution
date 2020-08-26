package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsFlagsFlagSquarepinOptions extends js.Object {
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.native
}

object StockToolsGuiDefinitionsFlagsFlagSquarepinOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsFlagsFlagSquarepinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFlagsFlagSquarepinOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsFlagsFlagSquarepinOptionsOps[Self <: StockToolsGuiDefinitionsFlagsFlagSquarepinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
  
}

