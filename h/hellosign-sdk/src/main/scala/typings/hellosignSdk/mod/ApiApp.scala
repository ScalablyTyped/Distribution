package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.AccountidEmailaddress
import typings.hellosignSdk.anon.Caninserteverywhere
import typings.hellosignSdk.anon.Chargesusers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiApp extends StObject {
  
  var callback_url: String
  
  var client_id: String
  
  var created_at: Double
  
  var domain: String
  
  var is_approved: Boolean
  
  var name: String
  
  var oauth: Null | Chargesusers
  
  var options: Caninserteverywhere
  
  var owner_account: AccountidEmailaddress
  
  var white_labeling_options: StringDictionary[Any]
}
object ApiApp {
  
  inline def apply(
    callback_url: String,
    client_id: String,
    created_at: Double,
    domain: String,
    is_approved: Boolean,
    name: String,
    options: Caninserteverywhere,
    owner_account: AccountidEmailaddress,
    white_labeling_options: StringDictionary[Any]
  ): ApiApp = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], is_approved = is_approved.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], owner_account = owner_account.asInstanceOf[js.Any], white_labeling_options = white_labeling_options.asInstanceOf[js.Any], oauth = null)
    __obj.asInstanceOf[ApiApp]
  }
  
  extension [Self <: ApiApp](x: Self) {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setIs_approved(value: Boolean): Self = StObject.set(x, "is_approved", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOauth(value: Chargesusers): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setOauthNull: Self = StObject.set(x, "oauth", null)
    
    inline def setOptions(value: Caninserteverywhere): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOwner_account(value: AccountidEmailaddress): Self = StObject.set(x, "owner_account", value.asInstanceOf[js.Any])
    
    inline def setWhite_labeling_options(value: StringDictionary[Any]): Self = StObject.set(x, "white_labeling_options", value.asInstanceOf[js.Any])
  }
}
