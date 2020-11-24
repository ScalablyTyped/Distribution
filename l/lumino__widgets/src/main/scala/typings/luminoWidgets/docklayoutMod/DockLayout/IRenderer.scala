package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.tabbarMod.TabBar
import typings.luminoWidgets.widgetMod.Widget
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A renderer for use with a dock layout.
  */
@js.native
trait IRenderer extends js.Object {
  
  /**
    * Create a new handle node for use with a dock layout.
    *
    * @returns A new handle node for a dock layout.
    */
  def createHandle(): HTMLDivElement = js.native
  
  /**
    * Create a new tab bar for use with a dock layout.
    *
    * @returns A new tab bar for a dock layout.
    */
  def createTabBar(): TabBar[Widget] = js.native
}
object IRenderer {
  
  @scala.inline
  def apply(createHandle: () => HTMLDivElement, createTabBar: () => TabBar[Widget]): IRenderer = {
    val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle), createTabBar = js.Any.fromFunction0(createTabBar))
    __obj.asInstanceOf[IRenderer]
  }
  
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer] (val x: Self) extends AnyVal {
    
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
    def setCreateHandle(value: () => HTMLDivElement): Self = this.set("createHandle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateTabBar(value: () => TabBar[Widget]): Self = this.set("createTabBar", js.Any.fromFunction0(value))
  }
}
