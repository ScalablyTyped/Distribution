package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1FieldTypeEnumType extends StObject {
  
  var allowedValues: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]] = js.native
}
object GoogleCloudDatacatalogV1beta1FieldTypeEnumType {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldTypeEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldTypeEnumType]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1FieldTypeEnumType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: js.Array[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    @scala.inline
    def setAllowedValuesVarargs(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
  }
}
