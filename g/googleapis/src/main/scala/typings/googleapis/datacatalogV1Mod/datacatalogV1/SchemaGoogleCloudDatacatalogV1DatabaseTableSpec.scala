package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DatabaseTableSpec extends StObject {
  
  /**
    * Output only. Fields specific to a Dataplex table and present only in the Dataplex table entries.
    */
  var dataplexTable: js.UndefOr[SchemaGoogleCloudDatacatalogV1DataplexTableSpec] = js.undefined
  
  /**
    * Type of this table.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DatabaseTableSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DatabaseTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DatabaseTableSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DatabaseTableSpec](x: Self) {
    
    inline def setDataplexTable(value: SchemaGoogleCloudDatacatalogV1DataplexTableSpec): Self = StObject.set(x, "dataplexTable", value.asInstanceOf[js.Any])
    
    inline def setDataplexTableUndefined: Self = StObject.set(x, "dataplexTable", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
