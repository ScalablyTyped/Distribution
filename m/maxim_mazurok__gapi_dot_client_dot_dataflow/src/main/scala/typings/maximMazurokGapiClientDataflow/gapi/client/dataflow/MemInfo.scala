package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemInfo extends js.Object {
  
  /** Instantenous memory limit in bytes. */
  var currentLimitBytes: js.UndefOr[String] = js.native
  
  /** Instantenous memory (RSS) size in bytes. */
  var currentRssBytes: js.UndefOr[String] = js.native
  
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** Total memory (RSS) usage since start up in GB * ms. */
  var totalGbMs: js.UndefOr[String] = js.native
}
object MemInfo {
  
  @scala.inline
  def apply(): MemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemInfo]
  }
  
  @scala.inline
  implicit class MemInfoOps[Self <: MemInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrentLimitBytes(value: String): Self = this.set("currentLimitBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentLimitBytes: Self = this.set("currentLimitBytes", js.undefined)
    
    @scala.inline
    def setCurrentRssBytes(value: String): Self = this.set("currentRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRssBytes: Self = this.set("currentRssBytes", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTotalGbMs(value: String): Self = this.set("totalGbMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalGbMs: Self = this.set("totalGbMs", js.undefined)
  }
}
