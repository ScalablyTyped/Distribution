package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of grouping objects.
  */
@js.native
trait SchemaGroupObjectsResponse extends js.Object {
  /**
    * The object ID of the created group.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaGroupObjectsResponse {
  @scala.inline
  def apply(): SchemaGroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupObjectsResponse]
  }
  @scala.inline
  implicit class SchemaGroupObjectsResponseOps[Self <: SchemaGroupObjectsResponse] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

