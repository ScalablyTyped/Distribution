package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats extends StObject {
  
  /**
    * The count of data items within the referenced resource.
    */
  var dataItems: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of stored data bytes within the referenced resource.
    */
  var dataSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of fileset entities within the referenced resource.
    */
  var filesets: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of table entities within the referenced resource.
    */
  var tables: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats {
  
  inline def apply(): SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1AssetDiscoveryStatusStats](x: Self) {
    
    inline def setDataItems(value: String): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsNull: Self = StObject.set(x, "dataItems", null)
    
    inline def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    inline def setDataSize(value: String): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setDataSizeNull: Self = StObject.set(x, "dataSize", null)
    
    inline def setDataSizeUndefined: Self = StObject.set(x, "dataSize", js.undefined)
    
    inline def setFilesets(value: String): Self = StObject.set(x, "filesets", value.asInstanceOf[js.Any])
    
    inline def setFilesetsNull: Self = StObject.set(x, "filesets", null)
    
    inline def setFilesetsUndefined: Self = StObject.set(x, "filesets", js.undefined)
    
    inline def setTables(value: String): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesNull: Self = StObject.set(x, "tables", null)
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
  }
}
