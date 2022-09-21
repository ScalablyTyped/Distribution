package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationSession extends StObject {
  
  /** Hosted account id of the associated publisher after association. Present if status is ACCEPTED. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Unique identifier of this association session. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsensehost#associationSession. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The products to associate with the user. Options: AFC, AFG, AFV, AFS (deprecated), AFMC (deprecated) */
  var productCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Redirect URL of this association session. Used to redirect users into the AdSense association flow. */
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  /** Status of the completed association, available once the association callback token has been verified. One of ACCEPTED, REJECTED, or ERROR. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The preferred locale of the user themselves when going through the AdSense association flow. */
  var userLocale: js.UndefOr[String] = js.undefined
  
  /** The locale of the user's hosted website. */
  var websiteLocale: js.UndefOr[String] = js.undefined
  
  /** The URL of the user's hosted website. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object AssociationSession {
  
  inline def apply(): AssociationSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationSession]
  }
  
  extension [Self <: AssociationSession](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProductCodes(value: js.Array[String]): Self = StObject.set(x, "productCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "productCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: String*): Self = StObject.set(x, "productCodes", js.Array(value*))
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    inline def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    inline def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
