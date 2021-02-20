package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerMean extends StObject {
  
  /** The number of values being aggregated. */
  var count: js.UndefOr[SplitInt64] = js.native
  
  /** The sum of all values being aggregated. */
  var sum: js.UndefOr[SplitInt64] = js.native
}
object IntegerMean {
  
  @scala.inline
  def apply(): IntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerMean]
  }
  
  @scala.inline
  implicit class IntegerMeanMutableBuilder[Self <: IntegerMean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: SplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSum(value: SplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
