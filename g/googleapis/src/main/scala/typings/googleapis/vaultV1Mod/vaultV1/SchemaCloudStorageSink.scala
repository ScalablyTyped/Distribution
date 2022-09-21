package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudStorageSink extends StObject {
  
  /**
    * Output only. The exported files in Cloud Storage.
    */
  var files: js.UndefOr[js.Array[SchemaCloudStorageFile]] = js.undefined
}
object SchemaCloudStorageSink {
  
  inline def apply(): SchemaCloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageSink]
  }
  
  extension [Self <: SchemaCloudStorageSink](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaCloudStorageFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaCloudStorageFile*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
