package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiaInventorySettings extends js.Object {
  
  /**
    * The email of the contact for the inventory verification process.
    */
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.native
  
  /**
    * The name of the contact for the inventory verification process.
    */
  var inventoryVerificationContactName: js.UndefOr[String] = js.native
  
  /**
    * The status of the verification contact.
    */
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.native
  
  /**
    * The status of the inventory verification process.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaLiaInventorySettings {
  
  @scala.inline
  def apply(): SchemaLiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaInventorySettings]
  }
  
  @scala.inline
  implicit class SchemaLiaInventorySettingsOps[Self <: SchemaLiaInventorySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInventoryVerificationContactEmail(value: String): Self = this.set("inventoryVerificationContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactEmail: Self = this.set("inventoryVerificationContactEmail", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactName(value: String): Self = this.set("inventoryVerificationContactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactName: Self = this.set("inventoryVerificationContactName", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactStatus(value: String): Self = this.set("inventoryVerificationContactStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactStatus: Self = this.set("inventoryVerificationContactStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
