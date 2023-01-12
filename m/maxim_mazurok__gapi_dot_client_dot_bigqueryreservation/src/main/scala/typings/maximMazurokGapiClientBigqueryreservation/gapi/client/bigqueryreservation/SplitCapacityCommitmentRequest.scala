package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitCapacityCommitmentRequest extends StObject {
  
  /** Number of slots in the capacity commitment after the split. */
  var slotCount: js.UndefOr[String] = js.undefined
}
object SplitCapacityCommitmentRequest {
  
  inline def apply(): SplitCapacityCommitmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitCapacityCommitmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitCapacityCommitmentRequest] (val x: Self) extends AnyVal {
    
    inline def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    inline def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
  }
}
