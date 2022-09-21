package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssociationSession extends StObject {
  
  /**
    * Hosted account id of the associated publisher after association. Present if status is ACCEPTED.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of this association session.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsensehost#associationSession.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The products to associate with the user. Options: AFC, AFG, AFV, AFS (deprecated), AFMC (deprecated)
    */
  var productCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Redirect URL of this association session. Used to redirect users into the AdSense association flow.
    */
  var redirectUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the completed association, available once the association callback token has been verified. One of ACCEPTED, REJECTED, or ERROR.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The preferred locale of the user themselves when going through the AdSense association flow.
    */
  var userLocale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The locale of the user's hosted website.
    */
  var websiteLocale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the user's hosted website.
    */
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssociationSession {
  
  inline def apply(): SchemaAssociationSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssociationSession]
  }
  
  extension [Self <: SchemaAssociationSession](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProductCodes(value: js.Array[String]): Self = StObject.set(x, "productCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesNull: Self = StObject.set(x, "productCodes", null)
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "productCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: String*): Self = StObject.set(x, "productCodes", js.Array(value*))
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlNull: Self = StObject.set(x, "redirectUrl", null)
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleNull: Self = StObject.set(x, "userLocale", null)
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    inline def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    inline def setWebsiteLocaleNull: Self = StObject.set(x, "websiteLocale", null)
    
    inline def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
