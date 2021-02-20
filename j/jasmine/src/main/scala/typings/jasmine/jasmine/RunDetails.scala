package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunDetails extends StObject {
  
  var failedExpectations: js.Array[ExpectationResult] = js.native
  
  var order: Order = js.native
}
object RunDetails {
  
  @scala.inline
  def apply(failedExpectations: js.Array[ExpectationResult], order: Order): RunDetails = {
    val __obj = js.Dynamic.literal(failedExpectations = failedExpectations.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
  
  @scala.inline
  implicit class RunDetailsMutableBuilder[Self <: RunDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedExpectations(value: js.Array[ExpectationResult]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExpectationsVarargs(value: ExpectationResult*): Self = StObject.set(x, "failedExpectations", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
