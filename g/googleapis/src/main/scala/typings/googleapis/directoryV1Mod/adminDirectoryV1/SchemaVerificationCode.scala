package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerificationCode extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the resource. This is always `admin#directory#verificationCode`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The obfuscated unique ID of the user.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A current verification code for the user. Invalidated or used verification codes are not returned as part of the result.
    */
  var verificationCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerificationCode {
  
  inline def apply(): SchemaVerificationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerificationCode]
  }
  
  extension [Self <: SchemaVerificationCode](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationCodeNull: Self = StObject.set(x, "verificationCode", null)
    
    inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
  }
}
