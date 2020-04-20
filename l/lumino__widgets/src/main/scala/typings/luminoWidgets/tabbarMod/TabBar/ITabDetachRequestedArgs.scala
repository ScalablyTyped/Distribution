package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabDetachRequested` signal.
  */
trait ITabDetachRequestedArgs[T] extends js.Object {
  /**
    * The current client X position of the mouse.
    */
  val clientX: Double
  /**
    * The current client Y position of the mouse.
    */
  val clientY: Double
  /**
    * The index of the tab to detach.
    */
  val index: Double
  /**
    * The node representing the tab.
    */
  val tab: HTMLElement
  /**
    * The title for the tab.
    */
  val title: Title[T]
}

object ITabDetachRequestedArgs {
  @scala.inline
  def apply[T](clientX: Double, clientY: Double, index: Double, tab: HTMLElement, title: Title[T]): ITabDetachRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabDetachRequestedArgs[T]]
  }
}

