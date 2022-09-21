package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountTreeResponse extends StObject {
  
  /**
    * The account created.
    */
  var account: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.undefined
  
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.undefined
}
object SchemaAccountTreeResponse {
  
  inline def apply(): SchemaAccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeResponse]
  }
  
  extension [Self <: SchemaAccountTreeResponse](x: Self) {
    
    inline def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfile(value: SchemaProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setWebproperty(value: SchemaWebproperty): Self = StObject.set(x, "webproperty", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyUndefined: Self = StObject.set(x, "webproperty", js.undefined)
  }
}
