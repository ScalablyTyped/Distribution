package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApiDimensionFilterGroup extends js.Object {
  var filters: js.UndefOr[js.Array[SchemaApiDimensionFilter]] = js.native
  var groupType: js.UndefOr[String] = js.native
}

object SchemaApiDimensionFilterGroup {
  @scala.inline
  def apply(): SchemaApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDimensionFilterGroup]
  }
  @scala.inline
  implicit class SchemaApiDimensionFilterGroupOps[Self <: SchemaApiDimensionFilterGroup] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: SchemaApiDimensionFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[SchemaApiDimensionFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
  }
  
}

