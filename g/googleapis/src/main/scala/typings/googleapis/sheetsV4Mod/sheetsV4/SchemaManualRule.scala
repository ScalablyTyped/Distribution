package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows you to manually organize the values in a source data column into
  * buckets with names of your choosing. For example, a pivot table that
  * aggregates population by state:      +-------+-------------------+     |
  * State | SUM of Population |     +-------+-------------------+     | AK    |
  * 0.7 |     | AL    |               4.8 |     | AR    |               2.9 |
  * ...     +-------+-------------------+ could be turned into a pivot table
  * that aggregates population by time zone by providing a list of groups (for
  * example, groupName = &#39;Central&#39;, items = [&#39;AL&#39;,
  * &#39;AR&#39;, &#39;IA&#39;, ...]) to a manual group rule. Note that a
  * similar effect could be achieved by adding a time zone column to the source
  * data and adjusting the pivot table.      +-----------+-------------------+
  * | Time Zone | SUM of Population |     +-----------+-------------------+ |
  * Central   |             106.3 |     | Eastern   |             151.9 |     |
  * Mountain  |              17.4 |     ... +-----------+-------------------+
  */
@js.native
trait SchemaManualRule extends js.Object {
  /**
    * The list of group names and the corresponding items from the source data
    * that map to each group name.
    */
  var groups: js.UndefOr[js.Array[SchemaManualRuleGroup]] = js.native
}

object SchemaManualRule {
  @scala.inline
  def apply(groups: js.Array[SchemaManualRuleGroup] = null): SchemaManualRule = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManualRule]
  }
}

