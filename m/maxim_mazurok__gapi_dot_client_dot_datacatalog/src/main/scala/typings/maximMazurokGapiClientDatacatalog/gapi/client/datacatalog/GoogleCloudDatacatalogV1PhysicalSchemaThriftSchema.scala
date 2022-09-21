package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema extends StObject {
  
  /** Thrift IDL source of the schema. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema {
  
  inline def apply(): GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1PhysicalSchemaThriftSchema](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
