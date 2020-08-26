package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a NamedRange.
  */
@js.native
trait SchemaDeleteNamedRangeRequest extends js.Object {
  /**
    * The name of the range(s) to delete. All named ranges with the given name
    * will be deleted.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaDeleteNamedRangeRequest {
  @scala.inline
  def apply(): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
  @scala.inline
  implicit class SchemaDeleteNamedRangeRequestOps[Self <: SchemaDeleteNamedRangeRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
  }
  
}

