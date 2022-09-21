package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataplexSpec extends StObject {
  
  /**
    * Fully qualified resource name of an asset in Dataplex, to which the underlying data source (Cloud Storage bucket or BigQuery dataset) of the entity is attached.
    */
  var asset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compression format of the data, e.g., zip, gzip etc.
    */
  var compressionFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format of the data.
    */
  var dataFormat: js.UndefOr[SchemaGoogleCloudDatacatalogV1PhysicalSchema] = js.undefined
  
  /**
    * Project ID of the underlying Cloud Storage or BigQuery data. Note that this may not be the same project as the correspondingly Dataplex lake / zone / asset.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataplexSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataplexSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataplexSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataplexSpec](x: Self) {
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetNull: Self = StObject.set(x, "asset", null)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatNull: Self = StObject.set(x, "compressionFormat", null)
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    inline def setDataFormat(value: SchemaGoogleCloudDatacatalogV1PhysicalSchema): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
