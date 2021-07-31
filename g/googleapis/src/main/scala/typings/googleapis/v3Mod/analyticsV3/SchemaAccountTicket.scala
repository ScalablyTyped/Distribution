package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics account ticket. The account ticket consists
  * of the ticket ID and the basic information for the account, property and
  * profile.
  */
trait SchemaAccountTicket extends StObject {
  
  /**
    * Account for this ticket.
    */
  var account: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * Account ticket ID used to access the account ticket.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.undefined
  
  /**
    * Redirect URI where the user will be sent after accepting Terms of
    * Service. Must be configured in APIs console as a callback URL.
    */
  var redirectUri: js.UndefOr[String] = js.undefined
  
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.undefined
}
object SchemaAccountTicket {
  
  @scala.inline
  def apply(): SchemaAccountTicket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTicket]
  }
  
  @scala.inline
  implicit class SchemaAccountTicketMutableBuilder[Self <: SchemaAccountTicket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfile(value: SchemaProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    @scala.inline
    def setWebproperty(value: SchemaWebproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
