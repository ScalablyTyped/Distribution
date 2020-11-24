package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsQuickFixEngineeringPackage extends js.Object {
  
  /** A short textual description of the QFE update. */
  var caption: js.UndefOr[String] = js.native
  
  /** A textual description of the QFE update. */
  var description: js.UndefOr[String] = js.native
  
  /** Unique identifier associated with a particular QFE update. */
  var hotFixId: js.UndefOr[String] = js.native
  
  /** Date that the QFE update was installed. Mapped from installed_on field. */
  var installTime: js.UndefOr[String] = js.native
}
object WindowsQuickFixEngineeringPackage {
  
  @scala.inline
  def apply(): WindowsQuickFixEngineeringPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsQuickFixEngineeringPackage]
  }
  
  @scala.inline
  implicit class WindowsQuickFixEngineeringPackageOps[Self <: WindowsQuickFixEngineeringPackage] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHotFixId(value: String): Self = this.set("hotFixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotFixId: Self = this.set("hotFixId", js.undefined)
    
    @scala.inline
    def setInstallTime(value: String): Self = this.set("installTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallTime: Self = this.set("installTime", js.undefined)
  }
}
