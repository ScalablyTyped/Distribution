package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the properties of a Video.
  */
@js.native
trait SchemaUpdateVideoPropertiesRequest extends js.Object {
  
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
  implicit class SchemaUpdateVideoPropertiesRequestOps[Self <: SchemaUpdateVideoPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setVideoProperties(value: SchemaVideoProperties): Self = this.set("videoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoProperties: Self = this.set("videoProperties", js.undefined)
  }
}
