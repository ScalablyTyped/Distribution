package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about which values in a pivot group should be used for sorting.
  */
@js.native
trait SchemaPivotGroupSortValueBucket extends StObject {
  
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
  implicit class SchemaPivotGroupSortValueBucketMutableBuilder[Self <: SchemaPivotGroupSortValueBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaExtendedValue]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: SchemaExtendedValue*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setValuesIndex(value: Double): Self = StObject.set(x, "valuesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesIndexUndefined: Self = StObject.set(x, "valuesIndex", js.undefined)
  }
}
