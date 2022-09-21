package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedAccount extends StObject {
  
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of provided services.
    */
  var services: js.UndefOr[js.Array[SchemaLinkService]] = js.undefined
}
object SchemaLinkedAccount {
  
  inline def apply(): SchemaLinkedAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedAccount]
  }
  
  extension [Self <: SchemaLinkedAccount](x: Self) {
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdNull: Self = StObject.set(x, "linkedAccountId", null)
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    inline def setServices(value: js.Array[SchemaLinkService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaLinkService*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
