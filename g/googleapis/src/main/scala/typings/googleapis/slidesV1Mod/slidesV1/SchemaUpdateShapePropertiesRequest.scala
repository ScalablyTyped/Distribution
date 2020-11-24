package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the properties of a Shape.
  */
@js.native
trait SchemaUpdateShapePropertiesRequest extends js.Object {
  
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
  implicit class SchemaUpdateShapePropertiesRequestOps[Self <: SchemaUpdateShapePropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: SchemaShapeProperties): Self = this.set("shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeProperties: Self = this.set("shapeProperties", js.undefined)
  }
}
