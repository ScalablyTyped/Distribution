package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartManualTransferRunsResponse extends js.Object {
  
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
  implicit class StartManualTransferRunsResponseOps[Self <: StartManualTransferRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRunsVarargs(value: TransferRun*): Self = this.set("runs", js.Array(value :_*))
    
    @scala.inline
    def setRuns(value: js.Array[TransferRun]): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
  }
}
