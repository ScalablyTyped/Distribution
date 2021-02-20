package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents starting and ending value of a range in double.
  */
@js.native
trait SchemaBucketRange extends StObject {
  
  /**
    * Starting value of the bucket range.
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * Ending value of the bucket range.
    */
  var to: js.UndefOr[Double] = js.native
}
object SchemaBucketRange {
  
  @scala.inline
  def apply(): SchemaBucketRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketRange]
  }
  
  @scala.inline
  implicit class SchemaBucketRangeMutableBuilder[Self <: SchemaBucketRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
