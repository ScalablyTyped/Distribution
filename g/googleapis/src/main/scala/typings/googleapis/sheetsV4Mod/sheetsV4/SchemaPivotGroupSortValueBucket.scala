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
  def apply(): SchemaPivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupSortValueBucket]
  }
  @scala.inline
  implicit class SchemaPivotGroupSortValueBucketOps[Self <: SchemaPivotGroupSortValueBucket] (val x: Self) extends AnyVal {
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
    def setBucketsVarargs(value: SchemaExtendedValue*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[SchemaExtendedValue]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    @scala.inline
    def setValuesIndex(value: Double): Self = this.set("valuesIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuesIndex: Self = this.set("valuesIndex", js.undefined)
  }
  
}

