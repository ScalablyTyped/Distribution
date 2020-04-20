package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabMoved` signal.
  */
trait ITabMovedArgs[T] extends js.Object {
  /**
    * The previous index of the tab.
    */
  val fromIndex: Double
  /**
    * The title for the tab.
    */
  val title: Title[T]
  /**
    * The current index of the tab.
    */
  val toIndex: Double
}

object ITabMovedArgs {
  @scala.inline
  def apply[T](fromIndex: Double, title: Title[T], toIndex: Double): ITabMovedArgs[T] = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabMovedArgs[T]]
  }
}

