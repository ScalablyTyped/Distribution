package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataplexTableSpec extends StObject {
  
  /** Common Dataplex fields. */
  var dataplexSpec: js.UndefOr[GoogleCloudDatacatalogV1DataplexSpec] = js.undefined
  
  /** List of external tables registered by Dataplex in other systems based on the same underlying data. External tables allow to query this data in those systems. */
  var externalTables: js.UndefOr[js.Array[GoogleCloudDatacatalogV1DataplexExternalTable]] = js.undefined
  
  /** Indicates if the table schema is managed by the user or not. */
  var userManaged: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatacatalogV1DataplexTableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1DataplexTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataplexTableSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1DataplexTableSpec] (val x: Self) extends AnyVal {
    
    inline def setDataplexSpec(value: GoogleCloudDatacatalogV1DataplexSpec): Self = StObject.set(x, "dataplexSpec", value.asInstanceOf[js.Any])
    
    inline def setDataplexSpecUndefined: Self = StObject.set(x, "dataplexSpec", js.undefined)
    
    inline def setExternalTables(value: js.Array[GoogleCloudDatacatalogV1DataplexExternalTable]): Self = StObject.set(x, "externalTables", value.asInstanceOf[js.Any])
    
    inline def setExternalTablesUndefined: Self = StObject.set(x, "externalTables", js.undefined)
    
    inline def setExternalTablesVarargs(value: GoogleCloudDatacatalogV1DataplexExternalTable*): Self = StObject.set(x, "externalTables", js.Array(value*))
    
    inline def setUserManaged(value: Boolean): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
