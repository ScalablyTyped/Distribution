package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema extends StObject {
  
  /**
    * Thrift IDL source of the schema.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1PhysicalSchemaThriftSchema](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
