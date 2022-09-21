package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestOsFeature extends StObject {
  
  /**
    * The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuestOsFeature {
  
  inline def apply(): SchemaGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestOsFeature]
  }
  
  extension [Self <: SchemaGuestOsFeature](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
