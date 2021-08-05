package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleTransferRunsResponse extends StObject {
  
  /** The transfer runs that were scheduled. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.undefined
}
object ScheduleTransferRunsResponse {
  
  inline def apply(): ScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleTransferRunsResponse]
  }
  
  extension [Self <: ScheduleTransferRunsResponse](x: Self) {
    
    inline def setRuns(value: js.Array[TransferRun]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "runs", js.undefined)
    
    inline def setRunsVarargs(value: TransferRun*): Self = StObject.set(x, "runs", js.Array(value :_*))
  }
}
