package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema extends StObject {
  
  /** JSON source of the Avro schema. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema {
  
  inline def apply(): GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1PhysicalSchemaAvroSchema] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
