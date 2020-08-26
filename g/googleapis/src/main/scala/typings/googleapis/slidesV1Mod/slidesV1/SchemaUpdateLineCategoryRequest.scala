package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the category of a line.
  */
@js.native
trait SchemaUpdateLineCategoryRequest extends js.Object {
  /**
    * The line category to update to.  The exact line type is determined based
    * on the category to update to and how it&#39;s routed to connect to other
    * page elements.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The object ID of the line the update is applied to.  Only a line with a
    * category indicating it is a &quot;connector&quot; can be updated.  The
    * line may be rerouted after updating its category.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaUpdateLineCategoryRequest {
  @scala.inline
  def apply(): SchemaUpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateLineCategoryRequest]
  }
  @scala.inline
  implicit class SchemaUpdateLineCategoryRequestOps[Self <: SchemaUpdateLineCategoryRequest] (val x: Self) extends AnyVal {
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
    def setLineCategory(value: String): Self = this.set("lineCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCategory: Self = this.set("lineCategory", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

