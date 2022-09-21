package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema extends StObject {
  
  /** Protocol buffer source of the schema. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema {
  
  inline def apply(): GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1PhysicalSchemaProtobufSchema](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
