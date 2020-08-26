package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the embedded object with the given ID.
  */
@js.native
trait SchemaDeleteEmbeddedObjectRequest extends js.Object {
  /**
    * The ID of the embedded object to delete.
    */
  var objectId: js.UndefOr[Double] = js.native
}

object SchemaDeleteEmbeddedObjectRequest {
  @scala.inline
  def apply(): SchemaDeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteEmbeddedObjectRequest]
  }
  @scala.inline
  implicit class SchemaDeleteEmbeddedObjectRequestOps[Self <: SchemaDeleteEmbeddedObjectRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: Double): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

