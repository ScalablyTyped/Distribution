package typings.luminoWidgets.menubarMod.MenuBar

import typings.luminoWidgets.titleMod.Title
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a menu bar item.
  */
trait IRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean
  /**
    * The title to be rendered.
    */
  val title: Title[Widget]
}

object IRenderData {
  @scala.inline
  def apply(active: Boolean, title: Title[Widget]): IRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRenderData]
  }
}

