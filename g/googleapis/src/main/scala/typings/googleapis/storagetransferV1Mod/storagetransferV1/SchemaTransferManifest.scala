package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferManifest extends StObject {
  
  /**
    * Specifies the path to the manifest in Cloud Storage. The Google-managed service account for the transfer must have `storage.objects.get` permission for this object. An example path is `gs://bucket_name/path/manifest.csv`.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransferManifest {
  
  inline def apply(): SchemaTransferManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferManifest]
  }
  
  extension [Self <: SchemaTransferManifest](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
