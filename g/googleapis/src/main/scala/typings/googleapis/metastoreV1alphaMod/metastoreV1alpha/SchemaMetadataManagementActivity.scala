package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataManagementActivity extends StObject {
  
  /**
    * Output only. The latest metadata exports of the metastore service.
    */
  var metadataExports: js.UndefOr[js.Array[SchemaMetadataExport]] = js.undefined
  
  /**
    * Output only. The latest restores of the metastore service.
    */
  var restores: js.UndefOr[js.Array[SchemaRestore]] = js.undefined
}
object SchemaMetadataManagementActivity {
  
  inline def apply(): SchemaMetadataManagementActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataManagementActivity]
  }
  
  extension [Self <: SchemaMetadataManagementActivity](x: Self) {
    
    inline def setMetadataExports(value: js.Array[SchemaMetadataExport]): Self = StObject.set(x, "metadataExports", value.asInstanceOf[js.Any])
    
    inline def setMetadataExportsUndefined: Self = StObject.set(x, "metadataExports", js.undefined)
    
    inline def setMetadataExportsVarargs(value: SchemaMetadataExport*): Self = StObject.set(x, "metadataExports", js.Array(value*))
    
    inline def setRestores(value: js.Array[SchemaRestore]): Self = StObject.set(x, "restores", value.asInstanceOf[js.Any])
    
    inline def setRestoresUndefined: Self = StObject.set(x, "restores", js.undefined)
    
    inline def setRestoresVarargs(value: SchemaRestore*): Self = StObject.set(x, "restores", js.Array(value*))
  }
}
