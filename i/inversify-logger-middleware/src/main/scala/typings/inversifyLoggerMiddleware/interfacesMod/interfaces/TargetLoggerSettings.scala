package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetLoggerSettings extends js.Object {
  
  var metadata: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[Boolean] = js.native
  
  var serviceIdentifier: js.UndefOr[Boolean] = js.native
}
object TargetLoggerSettings {
  
  @scala.inline
  def apply(): TargetLoggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetLoggerSettings]
  }
  
  @scala.inline
  implicit class TargetLoggerSettingsOps[Self <: TargetLoggerSettings] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: Boolean): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServiceIdentifier(value: Boolean): Self = this.set("serviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIdentifier: Self = this.set("serviceIdentifier", js.undefined)
  }
}
