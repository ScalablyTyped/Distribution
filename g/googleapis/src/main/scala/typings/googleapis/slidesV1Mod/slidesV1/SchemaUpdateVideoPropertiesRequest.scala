package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateVideoPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `videoProperties` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field. For example to update the video outline color, set `fields` to `"outline.outlineFill.solidFill.color"`. To reset a property to its default value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the video the updates are applied to.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video properties to update.
    */
  var videoProperties: js.UndefOr[SchemaVideoProperties] = js.undefined
}
object SchemaUpdateVideoPropertiesRequest {
  
  inline def apply(): SchemaUpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateVideoPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateVideoPropertiesRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setVideoProperties(value: SchemaVideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    
    inline def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
  }
}
