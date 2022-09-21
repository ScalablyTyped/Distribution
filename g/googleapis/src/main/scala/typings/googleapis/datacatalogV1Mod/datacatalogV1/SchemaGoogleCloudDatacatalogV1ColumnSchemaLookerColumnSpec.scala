package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec extends StObject {
  
  /**
    * Looker specific column type of this column.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpec](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
