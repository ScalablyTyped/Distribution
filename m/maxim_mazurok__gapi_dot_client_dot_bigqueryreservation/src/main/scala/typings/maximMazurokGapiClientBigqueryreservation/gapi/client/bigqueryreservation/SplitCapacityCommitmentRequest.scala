package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitCapacityCommitmentRequest extends StObject {
  
  /** Number of slots in the capacity commitment after the split. */
  var slotCount: js.UndefOr[String] = js.native
}
object SplitCapacityCommitmentRequest {
  
  @scala.inline
  def apply(): SplitCapacityCommitmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitCapacityCommitmentRequest]
  }
  
  @scala.inline
  implicit class SplitCapacityCommitmentRequestMutableBuilder[Self <: SplitCapacityCommitmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
  }
}
