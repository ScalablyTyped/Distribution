package typings.instabugReactnative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentId extends js.Object {
  
  var componentId: js.Any = js.native
  
  var componentName: js.Any = js.native
  
  var passProps: js.Any = js.native
}
object ComponentId {
  
  @scala.inline
  def apply(componentId: js.Any, componentName: js.Any, passProps: js.Any): ComponentId = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], passProps = passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentId]
  }
  
  @scala.inline
  implicit class ComponentIdOps[Self <: ComponentId] (val x: Self) extends AnyVal {
    
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
    def setComponentId(value: js.Any): Self = this.set("componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentName(value: js.Any): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassProps(value: js.Any): Self = this.set("passProps", value.asInstanceOf[js.Any])
  }
}
