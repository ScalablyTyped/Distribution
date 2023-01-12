package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DatabaseTableSpec extends StObject {
  
  /** Output only. Fields specific to a Dataplex table and present only in the Dataplex table entries. */
  var dataplexTable: js.UndefOr[GoogleCloudDatacatalogV1DataplexTableSpec] = js.undefined
  
  /** Type of this table. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1DatabaseTableSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1DatabaseTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DatabaseTableSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1DatabaseTableSpec] (val x: Self) extends AnyVal {
    
    inline def setDataplexTable(value: GoogleCloudDatacatalogV1DataplexTableSpec): Self = StObject.set(x, "dataplexTable", value.asInstanceOf[js.Any])
    
    inline def setDataplexTableUndefined: Self = StObject.set(x, "dataplexTable", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
