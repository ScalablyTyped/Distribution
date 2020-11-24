package typings.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var config: js.UndefOr[IConfigstore] = js.native
  
  var packageName: js.UndefOr[String] = js.native
  
  var packageVersion: js.UndefOr[String] = js.native
  
  var pkg: js.UndefOr[IPackage] = js.native
  
  var trackingCode: String = js.native
  
  var trackingProvider: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(trackingCode: String): IOptions = {
    val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setTrackingCode(value: String): Self = this.set("trackingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: IConfigstore): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: String): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersion: Self = this.set("packageVersion", js.undefined)
    
    @scala.inline
    def setPkg(value: IPackage): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setTrackingProvider(value: String): Self = this.set("trackingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingProvider: Self = this.set("trackingProvider", js.undefined)
  }
}
