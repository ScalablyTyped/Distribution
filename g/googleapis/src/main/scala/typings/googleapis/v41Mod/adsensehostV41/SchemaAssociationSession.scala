package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAssociationSession extends StObject {
  
  /**
    * Hosted account id of the associated publisher after association. Present
    * if status is ACCEPTED.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of this association session.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsensehost#associationSession.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The products to associate with the user. Options: AFC, AFG, AFV, AFS
    * (deprecated), AFMC (deprecated)
    */
  var productCodes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Redirect URL of this association session. Used to redirect users into the
    * AdSense association flow.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  
  /**
    * Status of the completed association, available once the association
    * callback token has been verified. One of ACCEPTED, REJECTED, or ERROR.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The preferred locale of the user themselves when going through the
    * AdSense association flow.
    */
  var userLocale: js.UndefOr[String] = js.native
  
  /**
    * The locale of the user&#39;s hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.native
  
  /**
    * The URL of the user&#39;s hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object SchemaAssociationSession {
  
  @scala.inline
  def apply(): SchemaAssociationSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssociationSession]
  }
  
  @scala.inline
  implicit class SchemaAssociationSessionMutableBuilder[Self <: SchemaAssociationSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProductCodes(value: js.Array[String]): Self = StObject.set(x, "productCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "productCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: String*): Self = StObject.set(x, "productCodes", js.Array(value :_*))
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    @scala.inline
    def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
