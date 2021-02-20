package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCounts extends StObject {
  
  var errorCount: Double = js.native
  
  var errorPercentage: Double = js.native
  
  var totalCount: Double = js.native
}
object HealthCounts {
  
  @scala.inline
  def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): HealthCounts = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCounts]
  }
  
  @scala.inline
  implicit class HealthCountsMutableBuilder[Self <: HealthCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPercentage(value: Double): Self = StObject.set(x, "errorPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
