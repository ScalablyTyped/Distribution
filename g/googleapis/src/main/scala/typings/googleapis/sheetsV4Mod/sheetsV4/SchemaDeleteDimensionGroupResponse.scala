package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a group.
  */
@js.native
trait SchemaDeleteDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaDeleteDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[SchemaDimensionGroup] = null): SchemaDeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteDimensionGroupResponse]
  }
}

