package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * toolbar items. Each name refers to unique key from definitions object.
    */
  var buttons: js.UndefOr[String] = js.native
  /**
    * (Highstock) A CSS class name to apply to the stocktools' div, allowing
    * unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highstock) An options object of the buttons definitions. Each name
    * refers to unique key from buttons array.
    */
  var definitions: js.UndefOr[StockToolsGuiDefinitionsOptions] = js.native
  /**
    * (Highstock) Enable or disable the stockTools gui.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) A CSS class name to apply to the container of buttons,
    * allowing unique CSS styling for each chart.
    */
  var toolbarClassName: js.UndefOr[String] = js.native
}

object StockToolsGuiOptions {
  @scala.inline
  def apply(): StockToolsGuiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiOptions]
  }
  @scala.inline
  implicit class StockToolsGuiOptionsOps[Self <: StockToolsGuiOptions] (val x: Self) extends AnyVal {
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
    def setButtons(value: String): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefinitions(value: StockToolsGuiDefinitionsOptions): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setToolbarClassName(value: String): Self = this.set("toolbarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarClassName: Self = this.set("toolbarClassName", js.undefined)
  }
  
}

