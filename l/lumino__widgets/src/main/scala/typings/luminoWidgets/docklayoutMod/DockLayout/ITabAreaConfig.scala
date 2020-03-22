package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.luminoWidgetsStrings.`tab-area`
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a tab area.
  */
trait ITabAreaConfig extends AreaConfig {
  /**
    * The index of the selected tab.
    */
  var currentIndex: Double
  /**
    * The discriminated type of the config object.
    */
  var `type`: `tab-area`
  /**
    * The widgets contained in the tab area.
    */
  var widgets: js.Array[Widget]
}

object ITabAreaConfig {
  @scala.inline
  def apply(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): ITabAreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabAreaConfig]
  }
}

