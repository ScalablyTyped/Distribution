package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalApplicationPolicy extends js.Object {
  
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.native
  
  /** The package name of the application. */
  var packageName: js.UndefOr[String] = js.native
}
object PersonalApplicationPolicy {
  
  @scala.inline
  def apply(): PersonalApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonalApplicationPolicy]
  }
  
  @scala.inline
  implicit class PersonalApplicationPolicyOps[Self <: PersonalApplicationPolicy] (val x: Self) extends AnyVal {
    
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
    def setInstallType(value: String): Self = this.set("installType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallType: Self = this.set("installType", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
}
