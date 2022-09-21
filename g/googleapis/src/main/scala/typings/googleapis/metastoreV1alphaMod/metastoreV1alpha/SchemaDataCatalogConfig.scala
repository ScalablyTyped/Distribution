package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataCatalogConfig extends StObject {
  
  /**
    * Defines whether the metastore metadata should be synced to Data Catalog. The default value is to disable syncing metastore metadata to Data Catalog.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDataCatalogConfig {
  
  inline def apply(): SchemaDataCatalogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataCatalogConfig]
  }
  
  extension [Self <: SchemaDataCatalogConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
