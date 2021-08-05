package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents count of jobs within one bucket.
  */
trait SchemaBucketizedCount extends StObject {
  
  /**
    * Number of jobs whose numeric field value fall into `range`.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Bucket range on which histogram was performed for the numeric field, that
    * is, the count represents number of jobs in this range.
    */
  var range: js.UndefOr[SchemaBucketRange] = js.undefined
}
object SchemaBucketizedCount {
  
  inline def apply(): SchemaBucketizedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketizedCount]
  }
  
  extension [Self <: SchemaBucketizedCount](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setRange(value: SchemaBucketRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
