package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeProperty extends StObject {
  
  /**
    * The name of the property. Follows the same guidelines as the EntityType name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Occurrence type limits the number of instances an entity type appears in the document.
    */
  var occurrenceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reference to the value type of the property. This type is subject to the same conventions as the `Entity.base_types` field.
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeProperty {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeProperty]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaEntityTypeProperty](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOccurrenceType(value: String): Self = StObject.set(x, "occurrenceType", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTypeNull: Self = StObject.set(x, "occurrenceType", null)
    
    inline def setOccurrenceTypeUndefined: Self = StObject.set(x, "occurrenceType", js.undefined)
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
