package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostureDetail extends StObject {
  
  /** Corresponding admin-facing advice to mitigate this security risk and improve the security posture of the device. */
  var advice: js.UndefOr[js.Array[UserFacingMessage]] = js.undefined
  
  /** A specific security risk that negatively affects the security posture of the device. */
  var securityRisk: js.UndefOr[String] = js.undefined
}
object PostureDetail {
  
  @scala.inline
  def apply(): PostureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostureDetail]
  }
  
  @scala.inline
  implicit class PostureDetailMutableBuilder[Self <: PostureDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvice(value: js.Array[UserFacingMessage]): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdviceUndefined: Self = StObject.set(x, "advice", js.undefined)
    
    @scala.inline
    def setAdviceVarargs(value: UserFacingMessage*): Self = StObject.set(x, "advice", js.Array(value :_*))
    
    @scala.inline
    def setSecurityRisk(value: String): Self = StObject.set(x, "securityRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRiskUndefined: Self = StObject.set(x, "securityRisk", js.undefined)
  }
}
