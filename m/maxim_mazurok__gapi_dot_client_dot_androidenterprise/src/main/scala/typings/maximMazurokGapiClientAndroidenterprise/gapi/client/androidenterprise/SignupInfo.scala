package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignupInfo extends StObject {
  
  /** An opaque token that will be required, along with the Enterprise Token, for obtaining the enterprise resource from CompleteSignup. */
  var completionToken: js.UndefOr[String] = js.undefined
  
  /** Deprecated. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A URL under which the Admin can sign up for an enterprise. The page pointed to cannot be rendered in an iframe. */
  var url: js.UndefOr[String] = js.undefined
}
object SignupInfo {
  
  inline def apply(): SignupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignupInfo]
  }
  
  extension [Self <: SignupInfo](x: Self) {
    
    inline def setCompletionToken(value: String): Self = StObject.set(x, "completionToken", value.asInstanceOf[js.Any])
    
    inline def setCompletionTokenUndefined: Self = StObject.set(x, "completionToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
