package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * toolbar items. Each name refers to unique key from definitions object.
    */
  var buttons: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) A CSS class name to apply to the stocktools' div, allowing
    * unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) An options object of the buttons definitions. Each name
    * refers to unique key from buttons array.
    */
  var definitions: js.UndefOr[StockToolsGuiDefinitionsOptions] = js.undefined
  /**
    * (Highstock) Enable or disable the stockTools gui.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) A CSS class name to apply to the container of buttons,
    * allowing unique CSS styling for each chart.
    */
  var toolbarClassName: js.UndefOr[String] = js.undefined
}

object StockToolsGuiOptions {
  @scala.inline
  def apply(
    buttons: String = null,
    className: String = null,
    definitions: StockToolsGuiDefinitionsOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    toolbarClassName: String = null
  ): StockToolsGuiOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiOptions]
  }
}

