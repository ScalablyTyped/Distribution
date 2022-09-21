package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataplexTableSpec extends StObject {
  
  /**
    * Common Dataplex fields.
    */
  var dataplexSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1DataplexSpec] = js.undefined
  
  /**
    * List of external tables registered by Dataplex in other systems based on the same underlying data. External tables allow to query this data in those systems.
    */
  var externalTables: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1DataplexExternalTable]] = js.undefined
  
  /**
    * Indicates if the table schema is managed by the user or not.
    */
  var userManaged: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataplexTableSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataplexTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataplexTableSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataplexTableSpec](x: Self) {
    
    inline def setDataplexSpec(value: SchemaGoogleCloudDatacatalogV1DataplexSpec): Self = StObject.set(x, "dataplexSpec", value.asInstanceOf[js.Any])
    
    inline def setDataplexSpecUndefined: Self = StObject.set(x, "dataplexSpec", js.undefined)
    
    inline def setExternalTables(value: js.Array[SchemaGoogleCloudDatacatalogV1DataplexExternalTable]): Self = StObject.set(x, "externalTables", value.asInstanceOf[js.Any])
    
    inline def setExternalTablesUndefined: Self = StObject.set(x, "externalTables", js.undefined)
    
    inline def setExternalTablesVarargs(value: SchemaGoogleCloudDatacatalogV1DataplexExternalTable*): Self = StObject.set(x, "externalTables", js.Array(value*))
    
    inline def setUserManaged(value: Boolean): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedNull: Self = StObject.set(x, "userManaged", null)
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
