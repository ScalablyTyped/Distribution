package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyId extends StObject {
  
  var accessKeyId: String
  
  var authorizationIdentity: String
  
  var secretAccessKey: String
  
  var sessionToken: js.UndefOr[String] = js.undefined
}
object AccessKeyId {
  
  inline def apply(accessKeyId: String, authorizationIdentity: String, secretAccessKey: String): AccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], authorizationIdentity = authorizationIdentity.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessKeyId] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationIdentity(value: String): Self = StObject.set(x, "authorizationIdentity", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
