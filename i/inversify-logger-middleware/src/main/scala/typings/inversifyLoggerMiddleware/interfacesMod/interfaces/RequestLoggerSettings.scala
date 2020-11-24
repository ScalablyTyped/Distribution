package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLoggerSettings extends js.Object {
  
  var bindings: js.UndefOr[BindingLoggerSettings] = js.native
  
  var serviceIdentifier: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[TargetLoggerSettings] = js.native
}
object RequestLoggerSettings {
  
  @scala.inline
  def apply(): RequestLoggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerSettings]
  }
  
  @scala.inline
  implicit class RequestLoggerSettingsOps[Self <: RequestLoggerSettings] (val x: Self) extends AnyVal {
    
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
    def setBindings(value: BindingLoggerSettings): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setServiceIdentifier(value: Boolean): Self = this.set("serviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIdentifier: Self = this.set("serviceIdentifier", js.undefined)
    
    @scala.inline
    def setTarget(value: TargetLoggerSettings): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
