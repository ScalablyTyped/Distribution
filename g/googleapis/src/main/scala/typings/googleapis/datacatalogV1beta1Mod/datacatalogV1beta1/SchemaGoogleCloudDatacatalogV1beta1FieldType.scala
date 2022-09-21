package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1FieldType extends StObject {
  
  /**
    * Represents an enum type.
    */
  var enumType: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType] = js.undefined
  
  /**
    * Represents primitive types - string, bool etc.
    */
  var primitiveType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1FieldType {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1FieldType]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1FieldType](x: Self) {
    
    inline def setEnumType(value: SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveTypeNull: Self = StObject.set(x, "primitiveType", null)
    
    inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
