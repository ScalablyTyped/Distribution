package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2StorageMetadataLabel extends StObject {
  
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2StorageMetadataLabel {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StorageMetadataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StorageMetadataLabel]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StorageMetadataLabel](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
