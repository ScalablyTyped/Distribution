package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSlidePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root 'slideProperties' is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field. For example to update whether a slide is skipped, set `fields` to `"isSkipped"`. To reset a property to its default value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the slide the update is applied to.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The slide properties to update.
    */
  var slideProperties: js.UndefOr[SchemaSlideProperties] = js.undefined
}
object SchemaUpdateSlidePropertiesRequest {
  
  inline def apply(): SchemaUpdateSlidePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSlidePropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateSlidePropertiesRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSlideProperties(value: SchemaSlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
    
    inline def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
  }
}
