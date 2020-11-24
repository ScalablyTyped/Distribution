package typings.licenseKeyGen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait licenseData extends js.Object {
  
  var appVersion: String = js.native
  
  var info: userInfo = js.native
  
  var osType: String = js.native
  
  var prodCode: String = js.native
}
object licenseData {
  
  @scala.inline
  def apply(appVersion: String, info: userInfo, osType: String, prodCode: String): licenseData = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any], prodCode = prodCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[licenseData]
  }
  
  @scala.inline
  implicit class licenseDataOps[Self <: licenseData] (val x: Self) extends AnyVal {
    
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
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: userInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsType(value: String): Self = this.set("osType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProdCode(value: String): Self = this.set("prodCode", value.asInstanceOf[js.Any])
  }
}
