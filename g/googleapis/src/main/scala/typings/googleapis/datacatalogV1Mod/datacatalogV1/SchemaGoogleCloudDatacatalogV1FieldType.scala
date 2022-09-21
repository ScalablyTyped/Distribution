package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1FieldType extends StObject {
  
  /**
    * An enum type.
    */
  var enumType: js.UndefOr[SchemaGoogleCloudDatacatalogV1FieldTypeEnumType] = js.undefined
  
  /**
    * Primitive types, such as string, boolean, etc.
    */
  var primitiveType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1FieldType {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1FieldType]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1FieldType](x: Self) {
    
    inline def setEnumType(value: SchemaGoogleCloudDatacatalogV1FieldTypeEnumType): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveTypeNull: Self = StObject.set(x, "primitiveType", null)
    
    inline def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
