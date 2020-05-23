package typings.luminoWidgets.docklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dock layout configuration object.
  */
trait ILayoutConfig extends js.Object {
  /**
    * The layout config for the main dock area.
    */
  var main: AreaConfig | Null
}

object ILayoutConfig {
  @scala.inline
  def apply(main: AreaConfig = null): ILayoutConfig = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayoutConfig]
  }
}

