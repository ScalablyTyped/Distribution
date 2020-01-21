package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single grouping (either row or column) in a pivot table.
  */
@js.native
trait SchemaPivotGroup extends js.Object {
  /**
    * The group rule to apply to this row/column group.
    */
  var groupRule: js.UndefOr[SchemaPivotGroupRule] = js.native
  /**
    * The labels to use for the row/column groups which can be customized. For
    * example, in the following pivot table, the row label is `Region` (which
    * could be renamed to `State`) and the column label is `Product` (which
    * could be renamed `Item`). Pivot tables created before December 2017 do
    * not have header labels. If you&#39;d like to add header labels to an
    * existing pivot table, please delete the existing pivot table and then
    * create a new pivot table with same parameters.
    * +--------------+---------+-------+     | SUM of Units | Product |       |
    * | Region       | Pen     | Paper |     +--------------+---------+-------+
    * | New York     |     345 |    98 |     | Oregon       |     234 |   123 |
    * | Tennessee    |     531 |   415 |     +--------------+---------+-------+
    * | Grand Total  |    1110 |   636 |     +--------------+---------+-------+
    */
  var label: js.UndefOr[String] = js.native
  /**
    * True if the headings in this pivot group should be repeated. This is only
    * valid for row groupings and is ignored by columns.  By default, we
    * minimize repitition of headings by not showing higher level headings
    * where they are the same. For example, even though the third row below
    * corresponds to &quot;Q1 Mar&quot;, &quot;Q1&quot; is not shown because it
    * is redundant with previous rows. Setting repeat_headings to true would
    * cause &quot;Q1&quot; to be repeated for &quot;Feb&quot; and
    * &quot;Mar&quot;.      +--------------+     | Q1     | Jan |     | | Feb |
    * |        | Mar |     +--------+-----+     | Q1 Total     |
    * +--------------+
    */
  var repeatHeadings: js.UndefOr[Boolean] = js.native
  /**
    * True if the pivot table should include the totals for this grouping.
    */
  var showTotals: js.UndefOr[Boolean] = js.native
  /**
    * The order the values in this group should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * The column offset of the source range that this grouping is based on. For
    * example, if the source was `C10:E15`, a `sourceColumnOffset` of `0` means
    * this group refers to column `C`, whereas the offset `1` would refer to
    * column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  /**
    * The bucket of the opposite pivot group to sort by. If not specified,
    * sorting is alphabetical by this group&#39;s values.
    */
  var valueBucket: js.UndefOr[SchemaPivotGroupSortValueBucket] = js.native
  /**
    * Metadata about values in the grouping.
    */
  var valueMetadata: js.UndefOr[js.Array[SchemaPivotGroupValueMetadata]] = js.native
}

object SchemaPivotGroup {
  @scala.inline
  def apply(
    groupRule: SchemaPivotGroupRule = null,
    label: String = null,
    repeatHeadings: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    sortOrder: String = null,
    sourceColumnOffset: Int | Double = null,
    valueBucket: SchemaPivotGroupSortValueBucket = null,
    valueMetadata: js.Array[SchemaPivotGroupValueMetadata] = null
  ): SchemaPivotGroup = {
    val __obj = js.Dynamic.literal()
    if (groupRule != null) __obj.updateDynamic("groupRule")(groupRule.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatHeadings)) __obj.updateDynamic("repeatHeadings")(repeatHeadings.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (valueBucket != null) __obj.updateDynamic("valueBucket")(valueBucket.asInstanceOf[js.Any])
    if (valueMetadata != null) __obj.updateDynamic("valueMetadata")(valueMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotGroup]
  }
}

