package typings.jupyterlabApplication.shellMod.ILabShell

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The restorable description of a sidebar in the user interface.
  */
@js.native
trait ISideArea extends js.Object {
  
  /**
    * A flag denoting whether the sidebar has been collapsed.
    */
  val collapsed: Boolean = js.native
  
  /**
    * The current widget that has side area focus.
    */
  val currentWidget: Widget | Null = js.native
  
  /**
    * The collection of widgets held by the sidebar.
    */
  val widgets: js.Array[Widget] | Null = js.native
}
object ISideArea {
  
  @scala.inline
  def apply(collapsed: Boolean): ISideArea = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISideArea]
  }
  
  @scala.inline
  implicit class ISideAreaOps[Self <: ISideArea] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidget(value: Widget): Self = this.set("currentWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidgetNull: Self = this.set("currentWidget", null)
    
    @scala.inline
    def setWidgetsVarargs(value: Widget*): Self = this.set("widgets", js.Array(value :_*))
    
    @scala.inline
    def setWidgets(value: js.Array[Widget]): Self = this.set("widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsNull: Self = this.set("widgets", null)
  }
}
