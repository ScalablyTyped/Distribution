package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the properties of a Video.
  */
@js.native
trait SchemaUpdateVideoPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `videoProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the video outline color, set `fields` to
    * `&quot;outline.outlineFill.solidFill.color&quot;`.  To reset a property
    * to its default value, include its field name in the field mask but leave
    * the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the video the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The video properties to update.
    */
  var videoProperties: js.UndefOr[SchemaVideoProperties] = js.native
}
object SchemaUpdateVideoPropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateVideoPropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateVideoPropertiesRequestMutableBuilder[Self <: SchemaUpdateVideoPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setVideoProperties(value: SchemaVideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
  }
}
