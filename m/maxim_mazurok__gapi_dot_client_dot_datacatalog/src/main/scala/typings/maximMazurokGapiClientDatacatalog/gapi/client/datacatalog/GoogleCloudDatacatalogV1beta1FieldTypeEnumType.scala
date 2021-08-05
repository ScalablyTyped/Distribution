package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1FieldTypeEnumType extends StObject {
  
  var allowedValues: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1FieldTypeEnumType {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1FieldTypeEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldTypeEnumType]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1FieldTypeEnumType](x: Self) {
    
    inline def setAllowedValues(value: js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
  }
}
