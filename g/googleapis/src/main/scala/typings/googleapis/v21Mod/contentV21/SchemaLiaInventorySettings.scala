package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaInventorySettings extends StObject {
  
  /**
    * The email of the contact for the inventory verification process.
    */
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the contact for the inventory verification process.
    */
  var inventoryVerificationContactName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the verification contact.
    */
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the inventory verification process.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaLiaInventorySettings {
  
  @scala.inline
  def apply(): SchemaLiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaInventorySettings]
  }
  
  @scala.inline
  implicit class SchemaLiaInventorySettingsMutableBuilder[Self <: SchemaLiaInventorySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventoryVerificationContactEmail(value: String): Self = StObject.set(x, "inventoryVerificationContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryVerificationContactEmailUndefined: Self = StObject.set(x, "inventoryVerificationContactEmail", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactName(value: String): Self = StObject.set(x, "inventoryVerificationContactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryVerificationContactNameUndefined: Self = StObject.set(x, "inventoryVerificationContactName", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactStatus(value: String): Self = StObject.set(x, "inventoryVerificationContactStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryVerificationContactStatusUndefined: Self = StObject.set(x, "inventoryVerificationContactStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
