package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGmbAccountsGmbAccount extends StObject {
  
  /**
    * The email which identifies the GMB account.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of listings under this account.
    */
  var listingCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the GMB account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the GMB account (User or Business).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGmbAccountsGmbAccount {
  
  inline def apply(): SchemaGmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccountsGmbAccount]
  }
  
  extension [Self <: SchemaGmbAccountsGmbAccount](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setListingCount(value: String): Self = StObject.set(x, "listingCount", value.asInstanceOf[js.Any])
    
    inline def setListingCountNull: Self = StObject.set(x, "listingCount", null)
    
    inline def setListingCountUndefined: Self = StObject.set(x, "listingCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
