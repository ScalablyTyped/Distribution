package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartManualTransferRunsResponse extends StObject {
  
  /** The transfer runs that were created. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.native
}
object StartManualTransferRunsResponse {
  
  @scala.inline
  def apply(): StartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartManualTransferRunsResponse]
  }
  
  @scala.inline
  implicit class StartManualTransferRunsResponseMutableBuilder[Self <: StartManualTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuns(value: js.Array[TransferRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    @scala.inline
    def setRunsVarargs(value: TransferRun*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
