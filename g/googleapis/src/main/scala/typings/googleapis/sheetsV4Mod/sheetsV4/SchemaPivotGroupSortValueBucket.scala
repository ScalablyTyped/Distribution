package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotGroupSortValueBucket extends StObject {
  
  /**
    * Determines the bucket from which values are chosen to sort. For example, in a pivot table with one row group & two column groups, the row group can list up to two values. The first value corresponds to a value within the first column group, and the second value corresponds to a value in the second column group. If no values are listed, this would indicate that the row should be sorted according to the "Grand Total" over the column groups. If a single value is listed, this would correspond to using the "Total" of that bucket.
    */
  var buckets: js.UndefOr[js.Array[SchemaExtendedValue]] = js.undefined
  
  /**
    * The offset in the PivotTable.values list which the values in this grouping should be sorted by.
    */
  var valuesIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPivotGroupSortValueBucket {
  
  inline def apply(): SchemaPivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupSortValueBucket]
  }
  
  extension [Self <: SchemaPivotGroupSortValueBucket](x: Self) {
    
    inline def setBuckets(value: js.Array[SchemaExtendedValue]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: SchemaExtendedValue*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setValuesIndex(value: Double): Self = StObject.set(x, "valuesIndex", value.asInstanceOf[js.Any])
    
    inline def setValuesIndexNull: Self = StObject.set(x, "valuesIndex", null)
    
    inline def setValuesIndexUndefined: Self = StObject.set(x, "valuesIndex", js.undefined)
  }
}
