package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a group.
  */
@js.native
trait SchemaAddDimensionGroupResponse extends js.Object {
  /**
    * All groups of a dimension after adding a group to that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaAddDimensionGroupResponse {
  @scala.inline
  def apply(dimensionGroups: js.Array[SchemaDimensionGroup] = null): SchemaAddDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionGroups != null) __obj.updateDynamic("dimensionGroups")(dimensionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddDimensionGroupResponse]
  }
}

