package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue extends StObject {
  
  /** Required. The display name of the enum value. Must not be an empty string. */
  var displayName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValueMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
