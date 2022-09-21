package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema extends StObject {
  
  /**
    * JSON source of the Avro schema.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1PhysicalSchemaAvroSchema](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
