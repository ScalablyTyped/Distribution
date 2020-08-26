package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch delete of one or more Photos.
  */
@js.native
trait SchemaBatchDeletePhotosResponse extends js.Object {
  /**
    * The status for the operation to delete a single Photo in the batch
    * request.
    */
  var status: js.UndefOr[js.Array[SchemaStatus]] = js.native
}

object SchemaBatchDeletePhotosResponse {
  @scala.inline
  def apply(): SchemaBatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosResponse]
  }
  @scala.inline
  implicit class SchemaBatchDeletePhotosResponseOps[Self <: SchemaBatchDeletePhotosResponse] (val x: Self) extends AnyVal {
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
    def setStatusVarargs(value: SchemaStatus*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[SchemaStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

