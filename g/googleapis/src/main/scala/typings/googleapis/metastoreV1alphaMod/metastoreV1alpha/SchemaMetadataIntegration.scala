package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataIntegration extends StObject {
  
  /**
    * The integration config for the Data Catalog service.
    */
  var dataCatalogConfig: js.UndefOr[SchemaDataCatalogConfig] = js.undefined
  
  /**
    * The integration config for the Dataplex service.
    */
  var dataplexConfig: js.UndefOr[SchemaDataplexConfig] = js.undefined
}
object SchemaMetadataIntegration {
  
  inline def apply(): SchemaMetadataIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataIntegration]
  }
  
  extension [Self <: SchemaMetadataIntegration](x: Self) {
    
    inline def setDataCatalogConfig(value: SchemaDataCatalogConfig): Self = StObject.set(x, "dataCatalogConfig", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogConfigUndefined: Self = StObject.set(x, "dataCatalogConfig", js.undefined)
    
    inline def setDataplexConfig(value: SchemaDataplexConfig): Self = StObject.set(x, "dataplexConfig", value.asInstanceOf[js.Any])
    
    inline def setDataplexConfigUndefined: Self = StObject.set(x, "dataplexConfig", js.undefined)
  }
}
