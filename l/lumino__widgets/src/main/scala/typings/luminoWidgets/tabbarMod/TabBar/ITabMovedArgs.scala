package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments object for the `tabMoved` signal.
  */
@js.native
trait ITabMovedArgs[T] extends js.Object {
  
  /**
    * The previous index of the tab.
    */
  val fromIndex: Double = js.native
  
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
  
  /**
    * The current index of the tab.
    */
  val toIndex: Double = js.native
}
object ITabMovedArgs {
  
  @scala.inline
  def apply[T](fromIndex: Double, title: Title[T], toIndex: Double): ITabMovedArgs[T] = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabMovedArgs[T]]
  }
  
  @scala.inline
  implicit class ITabMovedArgsOps[Self <: ITabMovedArgs[_], T] (val x: Self with ITabMovedArgs[T]) extends AnyVal {
    
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
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Title[T]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndex(value: Double): Self = this.set("toIndex", value.asInstanceOf[js.Any])
  }
}
