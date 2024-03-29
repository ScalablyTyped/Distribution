package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaInventorySettings extends StObject {
  
  /**
    * The email of the contact for the inventory verification process.
    */
  var inventoryVerificationContactEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the contact for the inventory verification process.
    */
  var inventoryVerificationContactName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the verification contact. Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var inventoryVerificationContactStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the inventory verification process. Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiaInventorySettings {
  
  inline def apply(): SchemaLiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaInventorySettings]
  }
  
  extension [Self <: SchemaLiaInventorySettings](x: Self) {
    
    inline def setInventoryVerificationContactEmail(value: String): Self = StObject.set(x, "inventoryVerificationContactEmail", value.asInstanceOf[js.Any])
    
    inline def setInventoryVerificationContactEmailNull: Self = StObject.set(x, "inventoryVerificationContactEmail", null)
    
    inline def setInventoryVerificationContactEmailUndefined: Self = StObject.set(x, "inventoryVerificationContactEmail", js.undefined)
    
    inline def setInventoryVerificationContactName(value: String): Self = StObject.set(x, "inventoryVerificationContactName", value.asInstanceOf[js.Any])
    
    inline def setInventoryVerificationContactNameNull: Self = StObject.set(x, "inventoryVerificationContactName", null)
    
    inline def setInventoryVerificationContactNameUndefined: Self = StObject.set(x, "inventoryVerificationContactName", js.undefined)
    
    inline def setInventoryVerificationContactStatus(value: String): Self = StObject.set(x, "inventoryVerificationContactStatus", value.asInstanceOf[js.Any])
    
    inline def setInventoryVerificationContactStatusNull: Self = StObject.set(x, "inventoryVerificationContactStatus", null)
    
    inline def setInventoryVerificationContactStatusUndefined: Self = StObject.set(x, "inventoryVerificationContactStatus", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
