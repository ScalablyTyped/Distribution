package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for Identitytoolkit-SendVerificationCode
  */
trait SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse extends StObject {
  
  /**
    * Encrypted session information
    */
  var sessionInfo: js.UndefOr[String] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponseMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
