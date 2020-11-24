package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the transform of a page element.  Updating the transform of a group
  * will change the absolute transform of the page elements in that group,
  * which can change their visual appearance. See the documentation for
  * PageElement.transform for more details.
  */
@js.native
trait SchemaUpdatePageElementTransformRequest extends js.Object {
  
  /**
    * The apply mode of the transform update.
    */
  var applyMode: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the page element to update.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The input transform matrix used to update the page element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}
object SchemaUpdatePageElementTransformRequest {
  
  @scala.inline
  def apply(): SchemaUpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementTransformRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdatePageElementTransformRequestOps[Self <: SchemaUpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    
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
    def setApplyMode(value: String): Self = this.set("applyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyMode: Self = this.set("applyMode", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaAffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
