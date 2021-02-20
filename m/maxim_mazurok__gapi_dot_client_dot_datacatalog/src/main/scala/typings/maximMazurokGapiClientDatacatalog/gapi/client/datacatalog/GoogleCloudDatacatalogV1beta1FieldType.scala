package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1FieldType extends StObject {
  
  /** Represents an enum type. */
  var enumType: js.UndefOr[GoogleCloudDatacatalogV1beta1FieldTypeEnumType] = js.native
  
  /** Represents primitive types - string, bool etc. */
  var primitiveType: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1FieldType {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldType]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1FieldType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumType(value: GoogleCloudDatacatalogV1beta1FieldTypeEnumType): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    @scala.inline
    def setPrimitiveType(value: String): Self = StObject.set(x, "primitiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTypeUndefined: Self = StObject.set(x, "primitiveType", js.undefined)
  }
}
