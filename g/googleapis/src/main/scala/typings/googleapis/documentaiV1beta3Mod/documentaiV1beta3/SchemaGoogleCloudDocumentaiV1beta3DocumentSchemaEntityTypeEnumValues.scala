package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeEnumValues extends StObject {
  
  /**
    * The individual values that this enum values type can include.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeEnumValues {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeEnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeEnumValues]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeEnumValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
