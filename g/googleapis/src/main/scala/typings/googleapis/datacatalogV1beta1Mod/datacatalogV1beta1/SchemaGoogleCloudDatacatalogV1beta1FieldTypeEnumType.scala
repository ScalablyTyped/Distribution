package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType extends StObject {
  
  var allowedValues: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumType](x: Self) {
    
    inline def setAllowedValues(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue*): Self = StObject.set(x, "allowedValues", js.Array(value*))
  }
}
