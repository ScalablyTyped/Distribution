package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the properties of a Shape.
  */
@js.native
trait SchemaUpdateShapePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `shapeProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the shape background solid fill color, set `fields`
    * to `&quot;shapeBackgroundFill.solidFill.color&quot;`.  To reset a
    * property to its default value, include its field name in the field mask
    * but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the shape the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The shape properties to update.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
}
object SchemaUpdateShapePropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateShapePropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateShapePropertiesRequestMutableBuilder[Self <: SchemaUpdateShapePropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: SchemaShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
  }
}
