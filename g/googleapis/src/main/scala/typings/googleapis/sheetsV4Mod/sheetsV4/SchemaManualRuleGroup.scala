package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group name and a list of items from the source data that should be placed
  * in the group with this name.
  */
@js.native
trait SchemaManualRuleGroup extends js.Object {
  /**
    * The group name, which must be a string. Each group in a given ManualRule
    * must have a unique group name.
    */
  var groupName: js.UndefOr[SchemaExtendedValue] = js.native
  /**
    * The items in the source data that should be placed into this group. Each
    * item may be a string, number, or boolean. Items may appear in at most one
    * group within a given ManualRule. Items that do not appear in any group
    * will appear on their own.
    */
  var items: js.UndefOr[js.Array[SchemaExtendedValue]] = js.native
}

object SchemaManualRuleGroup {
  @scala.inline
  def apply(groupName: SchemaExtendedValue = null, items: js.Array[SchemaExtendedValue] = null): SchemaManualRuleGroup = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManualRuleGroup]
  }
}

