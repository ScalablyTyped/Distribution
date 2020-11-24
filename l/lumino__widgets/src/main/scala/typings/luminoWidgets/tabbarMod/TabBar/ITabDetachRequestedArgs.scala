package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments object for the `tabDetachRequested` signal.
  */
@js.native
trait ITabDetachRequestedArgs[T] extends js.Object {
  
  /**
    * The current client X position of the mouse.
    */
  val clientX: Double = js.native
  
  /**
    * The current client Y position of the mouse.
    */
  val clientY: Double = js.native
  
  /**
    * The index of the tab to detach.
    */
  val index: Double = js.native
  
  /**
    * The node representing the tab.
    */
  val tab: HTMLElement = js.native
  
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
}
object ITabDetachRequestedArgs {
  
  @scala.inline
  def apply[T](clientX: Double, clientY: Double, index: Double, tab: HTMLElement, title: Title[T]): ITabDetachRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabDetachRequestedArgs[T]]
  }
  
  @scala.inline
  implicit class ITabDetachRequestedArgsOps[Self <: ITabDetachRequestedArgs[_], T] (val x: Self with ITabDetachRequestedArgs[T]) extends AnyVal {
    
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
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: HTMLElement): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Title[T]): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
