package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2MetadataLocation extends StObject {
  
  /**
    * Storage metadata.
    */
  var storageLabel: js.UndefOr[SchemaGooglePrivacyDlpV2StorageMetadataLabel] = js.undefined
  
  /**
    * Type of metadata containing the finding.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2MetadataLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2MetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2MetadataLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2MetadataLocation](x: Self) {
    
    inline def setStorageLabel(value: SchemaGooglePrivacyDlpV2StorageMetadataLabel): Self = StObject.set(x, "storageLabel", value.asInstanceOf[js.Any])
    
    inline def setStorageLabelUndefined: Self = StObject.set(x, "storageLabel", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
