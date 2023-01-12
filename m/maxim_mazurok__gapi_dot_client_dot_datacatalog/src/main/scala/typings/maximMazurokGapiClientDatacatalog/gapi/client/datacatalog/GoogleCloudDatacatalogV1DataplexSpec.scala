package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataplexSpec extends StObject {
  
  /** Fully qualified resource name of an asset in Dataplex, to which the underlying data source (Cloud Storage bucket or BigQuery dataset) of the entity is attached. */
  var asset: js.UndefOr[String] = js.undefined
  
  /** Compression format of the data, e.g., zip, gzip etc. */
  var compressionFormat: js.UndefOr[String] = js.undefined
  
  /** Format of the data. */
  var dataFormat: js.UndefOr[GoogleCloudDatacatalogV1PhysicalSchema] = js.undefined
  
  /** Project ID of the underlying Cloud Storage or BigQuery data. Note that this may not be the same project as the correspondingly Dataplex lake / zone / asset. */
  var projectId: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1DataplexSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1DataplexSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataplexSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1DataplexSpec] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    inline def setDataFormat(value: GoogleCloudDatacatalogV1PhysicalSchema): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
