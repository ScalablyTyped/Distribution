package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec extends StObject {
  
  /** Looker specific column type of this column. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
