package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A renderer for use with a tab bar.
  */
@js.native
trait IRenderer[T] extends js.Object {
  
  /**
    * A selector which matches the close icon node in a tab.
    */
  val closeIconSelector: String = js.native
  
  /**
    * Render the virtual element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab.
    */
  def renderTab(data: IRenderData[T]): VirtualElement = js.native
}
object IRenderer {
  
  @scala.inline
  def apply[T](closeIconSelector: String, renderTab: IRenderData[T] => VirtualElement): IRenderer[T] = {
    val __obj = js.Dynamic.literal(closeIconSelector = closeIconSelector.asInstanceOf[js.Any], renderTab = js.Any.fromFunction1(renderTab))
    __obj.asInstanceOf[IRenderer[T]]
  }
  
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer[_], T] (val x: Self with IRenderer[T]) extends AnyVal {
    
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
    def setCloseIconSelector(value: String): Self = this.set("closeIconSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTab(value: IRenderData[T] => VirtualElement): Self = this.set("renderTab", js.Any.fromFunction1(value))
  }
}
