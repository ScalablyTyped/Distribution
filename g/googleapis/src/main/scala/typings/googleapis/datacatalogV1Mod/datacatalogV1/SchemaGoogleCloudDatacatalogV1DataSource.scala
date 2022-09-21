package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataSource extends StObject {
  
  /**
    * Full name of a resource as defined by the service. For example: `//bigquery.googleapis.com/projects/{PROJECT_ID\}/locations/{LOCATION\}/datasets/{DATASET_ID\}/tables/{TABLE_ID\}`
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Service that physically stores the data.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Data Catalog entry name, if applicable.
    */
  var sourceEntry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed properties of the underlying storage.
    */
  var storageProperties: js.UndefOr[SchemaGoogleCloudDatacatalogV1StorageProperties] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataSource {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataSource]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataSource](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setSourceEntry(value: String): Self = StObject.set(x, "sourceEntry", value.asInstanceOf[js.Any])
    
    inline def setSourceEntryNull: Self = StObject.set(x, "sourceEntry", null)
    
    inline def setSourceEntryUndefined: Self = StObject.set(x, "sourceEntry", js.undefined)
    
    inline def setStorageProperties(value: SchemaGoogleCloudDatacatalogV1StorageProperties): Self = StObject.set(x, "storageProperties", value.asInstanceOf[js.Any])
    
    inline def setStoragePropertiesUndefined: Self = StObject.set(x, "storageProperties", js.undefined)
  }
}
