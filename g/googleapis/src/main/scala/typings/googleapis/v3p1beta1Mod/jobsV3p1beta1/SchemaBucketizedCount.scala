package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents count of jobs within one bucket.
  */
@js.native
trait SchemaBucketizedCount extends StObject {
  
  /**
    * Number of jobs whose numeric field value fall into `range`.
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Bucket range on which histogram was performed for the numeric field, that
    * is, the count represents number of jobs in this range.
    */
  var range: js.UndefOr[SchemaBucketRange] = js.native
}
object SchemaBucketizedCount {
  
  @scala.inline
  def apply(): SchemaBucketizedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketizedCount]
  }
  
  @scala.inline
  implicit class SchemaBucketizedCountMutableBuilder[Self <: SchemaBucketizedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaBucketRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
