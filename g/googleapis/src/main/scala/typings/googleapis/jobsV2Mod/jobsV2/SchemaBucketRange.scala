package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketRange extends StObject {
  
  /**
    * Starting value of the bucket range.
    */
  var from: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Ending value of the bucket range.
    */
  var to: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBucketRange {
  
  inline def apply(): SchemaBucketRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketRange]
  }
  
  extension [Self <: SchemaBucketRange](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
