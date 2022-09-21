package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmbAccountsGmbAccount extends StObject {
  
  /** The email which identifies the Business Profile. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Number of listings under this account. */
  var listingCount: js.UndefOr[String] = js.undefined
  
  /** The name of the Business Profile. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of the Business Profile (User or Business). */
  var `type`: js.UndefOr[String] = js.undefined
}
object GmbAccountsGmbAccount {
  
  inline def apply(): GmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmbAccountsGmbAccount]
  }
  
  extension [Self <: GmbAccountsGmbAccount](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setListingCount(value: String): Self = StObject.set(x, "listingCount", value.asInstanceOf[js.Any])
    
    inline def setListingCountUndefined: Self = StObject.set(x, "listingCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
