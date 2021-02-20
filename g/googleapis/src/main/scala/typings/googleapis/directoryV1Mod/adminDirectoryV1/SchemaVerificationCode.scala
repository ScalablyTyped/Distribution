package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for verification codes in Directory API.
  */
@js.native
trait SchemaVerificationCode extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource. This is always
    * admin#directory#verificationCode.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The obfuscated unique ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * A current verification code for the user. Invalidated or used
    * verification codes are not returned as part of the result.
    */
  var verificationCode: js.UndefOr[String] = js.native
}
object SchemaVerificationCode {
  
  @scala.inline
  def apply(): SchemaVerificationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerificationCode]
  }
  
  @scala.inline
  implicit class SchemaVerificationCodeMutableBuilder[Self <: SchemaVerificationCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
  }
}
