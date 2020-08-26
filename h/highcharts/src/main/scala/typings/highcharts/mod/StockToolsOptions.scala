package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsOptions extends js.Object {
  /**
    * (Highstock) Definitions of buttons in Stock Tools GUI.
    */
  var gui: js.UndefOr[StockToolsGuiOptions] = js.native
}

object StockToolsOptions {
  @scala.inline
  def apply(): StockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsOptions]
  }
  @scala.inline
  implicit class StockToolsOptionsOps[Self <: StockToolsOptions] (val x: Self) extends AnyVal {
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
    def setGui(value: StockToolsGuiOptions): Self = this.set("gui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGui: Self = this.set("gui", js.undefined)
  }
  
}

