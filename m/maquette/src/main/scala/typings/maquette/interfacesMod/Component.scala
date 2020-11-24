package typings.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  def renderMaquette(): js.UndefOr[VNode | Null] = js.native
}
object Component {
  
  @scala.inline
  def apply(renderMaquette: () => js.UndefOr[VNode | Null]): Component = {
    val __obj = js.Dynamic.literal(renderMaquette = js.Any.fromFunction0(renderMaquette))
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
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
    def setRenderMaquette(value: () => js.UndefOr[VNode | Null]): Self = this.set("renderMaquette", js.Any.fromFunction0(value))
  }
}
