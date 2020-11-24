package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostureDetail extends js.Object {
  
  /** Corresponding admin-facing advice to mitigate this security risk and improve the security posture of the device. */
  var advice: js.UndefOr[js.Array[UserFacingMessage]] = js.native
  
  /** A specific security risk that negatively affects the security posture of the device. */
  var securityRisk: js.UndefOr[String] = js.native
}
object PostureDetail {
  
  @scala.inline
  def apply(): PostureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostureDetail]
  }
  
  @scala.inline
  implicit class PostureDetailOps[Self <: PostureDetail] (val x: Self) extends AnyVal {
    
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
    def setAdviceVarargs(value: UserFacingMessage*): Self = this.set("advice", js.Array(value :_*))
    
    @scala.inline
    def setAdvice(value: js.Array[UserFacingMessage]): Self = this.set("advice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvice: Self = this.set("advice", js.undefined)
    
    @scala.inline
    def setSecurityRisk(value: String): Self = this.set("securityRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityRisk: Self = this.set("securityRisk", js.undefined)
  }
}
