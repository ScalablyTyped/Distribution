package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1FieldType extends StObject {
  
  /** An enum type. */
  var enumType: js.UndefOr[GoogleCloudDatacatalogV1FieldTypeEnumType] = js.undefined
  
  /** Primitive types, such as string, boolean, etc. */
  var primitiveType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1FieldType {
  
  inline def apply(): GoogleCloudDatacatalogV1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1FieldType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1FieldType] (val x: Self) extends AnyVal {
    
    inline def setEnumType(value: GoogleCloudDatacatalogV1FieldTypeEnumType): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
