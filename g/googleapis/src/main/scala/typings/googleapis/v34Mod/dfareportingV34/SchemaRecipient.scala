package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecipient extends StObject {
  
  /**
    * The delivery type for the recipient.
    */
  var deliveryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the recipient.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#recipient.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaRecipient {
  
  inline def apply(): SchemaRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecipient]
  }
  
  extension [Self <: SchemaRecipient](x: Self) {
    
    inline def setDeliveryType(value: String): Self = StObject.set(x, "deliveryType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTypeNull: Self = StObject.set(x, "deliveryType", null)
    
    inline def setDeliveryTypeUndefined: Self = StObject.set(x, "deliveryType", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
