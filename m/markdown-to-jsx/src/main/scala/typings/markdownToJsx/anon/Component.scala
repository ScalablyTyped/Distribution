package typings.markdownToJsx.anon

import typings.react.mod.ComponentClass
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[P, S] extends js.Object {
  
  var component: String | (ComponentClass[P, S]) | SFC[P] = js.native
  
  var props: js.UndefOr[js.Any] = js.native
}
object Component {
  
  @scala.inline
  def apply[P, S](component: String | (ComponentClass[P, S]) | SFC[P]): Component[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[P, S]]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component[_, _], P, S] (val x: Self with (Component[P, S])) extends AnyVal {
    
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
    def setComponent(value: String | (ComponentClass[P, S]) | SFC[P]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
