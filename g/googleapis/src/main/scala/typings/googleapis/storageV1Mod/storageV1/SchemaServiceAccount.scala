package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccount extends StObject {
  
  /**
    * The ID of the notification.
    */
  var email_address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of item this is. For notifications, this is always storage#notification.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAccount {
  
  inline def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  
  extension [Self <: SchemaServiceAccount](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressNull: Self = StObject.set(x, "email_address", null)
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
