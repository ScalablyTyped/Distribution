package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ungroups objects, such as groups.
  */
@js.native
trait SchemaUngroupObjectsRequest extends js.Object {
  /**
    * The object IDs of the objects to ungroup.  Only groups that are not
    * inside other groups can be ungrouped. All the groups should be on the
    * same page. The group itself is deleted. The visual sizes and positions of
    * all the children are preserved.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUngroupObjectsRequest {
  @scala.inline
  def apply(): SchemaUngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUngroupObjectsRequest]
  }
  @scala.inline
  implicit class SchemaUngroupObjectsRequestOps[Self <: SchemaUngroupObjectsRequest] (val x: Self) extends AnyVal {
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
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
  }
  
}

