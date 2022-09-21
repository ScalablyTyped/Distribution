package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataSource extends StObject {
  
  /** Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}` */
  var resource: js.UndefOr[String] = js.undefined
  
  /** Service that physically stores the data. */
  var service: js.UndefOr[String] = js.undefined
  
  /** Output only. Data Catalog entry name, if applicable. */
  var sourceEntry: js.UndefOr[String] = js.undefined
  
  /** Detailed properties of the underlying storage. */
  var storageProperties: js.UndefOr[GoogleCloudDatacatalogV1StorageProperties] = js.undefined
}
object GoogleCloudDatacatalogV1DataSource {
  
  inline def apply(): GoogleCloudDatacatalogV1DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataSource]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1DataSource](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setSourceEntry(value: String): Self = StObject.set(x, "sourceEntry", value.asInstanceOf[js.Any])
    
    inline def setSourceEntryUndefined: Self = StObject.set(x, "sourceEntry", js.undefined)
    
    inline def setStorageProperties(value: GoogleCloudDatacatalogV1StorageProperties): Self = StObject.set(x, "storageProperties", value.asInstanceOf[js.Any])
    
    inline def setStoragePropertiesUndefined: Self = StObject.set(x, "storageProperties", js.undefined)
  }
}
