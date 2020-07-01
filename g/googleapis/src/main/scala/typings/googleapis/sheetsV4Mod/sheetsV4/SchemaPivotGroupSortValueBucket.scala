package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about which values in a pivot group should be used for sorting.
  */
@js.native
trait SchemaPivotGroupSortValueBucket extends js.Object {
  /**
    * Determines the bucket from which values are chosen to sort.  For example,
    * in a pivot table with one row group &amp; two column groups, the row
    * group can list up to two values. The first value corresponds to a value
    * within the first column group, and the second value corresponds to a
    * value in the second column group.  If no values are listed, this would
    * indicate that the row should be sorted according to the &quot;Grand
    * Total&quot; over the column groups. If a single value is listed, this
    * would correspond to using the &quot;Total&quot; of that bucket.
    */
  var buckets: js.UndefOr[js.Array[SchemaExtendedValue]] = js.native
  /**
    * The offset in the PivotTable.values list which the values in this
    * grouping should be sorted by.
    */
  var valuesIndex: js.UndefOr[Double] = js.native
}

object SchemaPivotGroupSortValueBucket {
  @scala.inline
  def apply(buckets: js.Array[SchemaExtendedValue] = null, valuesIndex: js.UndefOr[Double] = js.undefined): SchemaPivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (!js.isUndefined(valuesIndex)) __obj.updateDynamic("valuesIndex")(valuesIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotGroupSortValueBucket]
  }
}

