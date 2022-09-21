package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues extends StObject {
  
  /**
    * The individual values that this enum values type can include.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
