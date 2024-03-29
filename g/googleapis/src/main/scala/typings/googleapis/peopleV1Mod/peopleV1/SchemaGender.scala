package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGender extends StObject {
  
  /**
    * Free form text field for pronouns that should be used to address the person. Common values are: * `he`/`him` * `she`/`her` * `they`/`them`
    */
  var addressMeAs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The value of the gender translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. Unspecified or custom value are not localized.
    */
  var formattedValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the gender.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The gender for the person. The gender can be custom or one of these predefined values: * `male` * `female` * `unspecified`
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGender {
  
  inline def apply(): SchemaGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGender]
  }
  
  extension [Self <: SchemaGender](x: Self) {
    
    inline def setAddressMeAs(value: String): Self = StObject.set(x, "addressMeAs", value.asInstanceOf[js.Any])
    
    inline def setAddressMeAsNull: Self = StObject.set(x, "addressMeAs", null)
    
    inline def setAddressMeAsUndefined: Self = StObject.set(x, "addressMeAs", js.undefined)
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueNull: Self = StObject.set(x, "formattedValue", null)
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
