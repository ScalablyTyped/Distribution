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
  def apply(filters: js.Array[SchemaApiDimensionFilter] = null, groupType: String = null): SchemaApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApiDimensionFilterGroup]
  }
}

