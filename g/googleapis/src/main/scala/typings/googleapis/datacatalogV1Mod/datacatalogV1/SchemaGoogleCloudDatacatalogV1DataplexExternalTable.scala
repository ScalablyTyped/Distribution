package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataplexExternalTable extends StObject {
  
  /**
    * Name of the Data Catalog entry representing the external table.
    */
  var dataCatalogEntry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fully qualified name (FQN) of the external table.
    */
  var fullyQualifiedName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud resource name of the external table.
    */
  var googleCloudResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Service in which the external table is registered.
    */
  var system: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataplexExternalTable {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataplexExternalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataplexExternalTable]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataplexExternalTable](x: Self) {
    
    inline def setDataCatalogEntry(value: String): Self = StObject.set(x, "dataCatalogEntry", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogEntryNull: Self = StObject.set(x, "dataCatalogEntry", null)
    
    inline def setDataCatalogEntryUndefined: Self = StObject.set(x, "dataCatalogEntry", js.undefined)
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameNull: Self = StObject.set(x, "fullyQualifiedName", null)
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setGoogleCloudResource(value: String): Self = StObject.set(x, "googleCloudResource", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudResourceNull: Self = StObject.set(x, "googleCloudResource", null)
    
    inline def setGoogleCloudResourceUndefined: Self = StObject.set(x, "googleCloudResource", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemNull: Self = StObject.set(x, "system", null)
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
