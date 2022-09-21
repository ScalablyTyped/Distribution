package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue extends StObject {
  
  /**
    * Required. The display name of the enum value. Must not be an empty string.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
