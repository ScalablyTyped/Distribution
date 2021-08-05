package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import typings.googleapis.anon.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteVerificationWebResourceGettokenRequest extends StObject {
  
  /**
    * The site for which a verification token will be generated.
    */
  var site: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The verification method that will be used to verify this site. For sites,
    * &#39;FILE&#39; or &#39;META&#39; methods may be used. For domains, only
    * &#39;DNS&#39; may be used.
    */
  var verificationMethod: js.UndefOr[String] = js.undefined
}
object SchemaSiteVerificationWebResourceGettokenRequest {
  
  inline def apply(): SchemaSiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenRequest]
  }
  
  extension [Self <: SchemaSiteVerificationWebResourceGettokenRequest](x: Self) {
    
    inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
    
    inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
  }
}
