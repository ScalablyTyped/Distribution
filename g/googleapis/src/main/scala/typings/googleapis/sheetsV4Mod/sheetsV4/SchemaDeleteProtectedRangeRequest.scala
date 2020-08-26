package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the protected range with the given ID.
  */
@js.native
trait SchemaDeleteProtectedRangeRequest extends js.Object {
  /**
    * The ID of the protected range to delete.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
}

object SchemaDeleteProtectedRangeRequest {
  @scala.inline
  def apply(): SchemaDeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteProtectedRangeRequest]
  }
  @scala.inline
  implicit class SchemaDeleteProtectedRangeRequestOps[Self <: SchemaDeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
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
    def setProtectedRangeId(value: Double): Self = this.set("protectedRangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedRangeId: Self = this.set("protectedRangeId", js.undefined)
  }
  
}

