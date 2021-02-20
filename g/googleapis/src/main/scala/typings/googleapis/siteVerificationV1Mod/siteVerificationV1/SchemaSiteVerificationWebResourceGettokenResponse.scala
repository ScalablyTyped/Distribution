package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSiteVerificationWebResourceGettokenResponse extends StObject {
  
  /**
    * The verification method to use in conjunction with this token. For FILE,
    * the token should be placed in the top-level directory of the site, stored
    * inside a file of the same name. For META, the token should be placed in
    * the HEAD tag of the default page that is loaded for the site. For DNS,
    * the token should be placed in a TXT record of the domain.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The verification token. The token must be placed appropriately in order
    * for verification to succeed.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaSiteVerificationWebResourceGettokenResponse {
  
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceGettokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenResponse]
  }
  
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceGettokenResponseMutableBuilder[Self <: SchemaSiteVerificationWebResourceGettokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
