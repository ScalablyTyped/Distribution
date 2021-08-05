package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1FieldType extends StObject {
  
  /** Represents an enum type. */
  var enumType: js.UndefOr[GoogleCloudDatacatalogV1beta1FieldTypeEnumType] = js.undefined
  
  /** Represents primitive types - string, bool etc. */
  var primitiveType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1FieldType {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldType]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1FieldType](x: Self) {
    
    inline def setEnumType(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumType): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
