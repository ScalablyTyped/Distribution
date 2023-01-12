package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitCapacityCommitmentResponse extends StObject {
  
  /** First capacity commitment, result of a split. */
  var first: js.UndefOr[CapacityCommitment] = js.undefined
  
  /** Second capacity commitment, result of a split. */
  var second: js.UndefOr[CapacityCommitment] = js.undefined
}
object SplitCapacityCommitmentResponse {
  
  inline def apply(): SplitCapacityCommitmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitCapacityCommitmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitCapacityCommitmentResponse] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: CapacityCommitment): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setSecond(value: CapacityCommitment): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
  }
}
