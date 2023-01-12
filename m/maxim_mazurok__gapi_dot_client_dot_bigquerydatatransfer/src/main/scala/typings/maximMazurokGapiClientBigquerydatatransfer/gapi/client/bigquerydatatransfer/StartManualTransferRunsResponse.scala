package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartManualTransferRunsResponse extends StObject {
  
  /** The transfer runs that were created. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.undefined
}
object StartManualTransferRunsResponse {
  
  inline def apply(): StartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartManualTransferRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartManualTransferRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setRuns(value: js.Array[TransferRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: TransferRun*): Self = StObject.set(x, "runs", js.Array(value*))
  }
}
