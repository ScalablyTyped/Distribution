package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskUtilization extends js.Object {
  
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.native
  
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.native
}
object DiskUtilization {
  
  @scala.inline
  def apply(): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskUtilization]
  }
  
  @scala.inline
  implicit class DiskUtilizationOps[Self <: DiskUtilization] (val x: Self) extends AnyVal {
    
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
    def setTargetReadBytesPerSecond(value: Double): Self = this.set("targetReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReadBytesPerSecond: Self = this.set("targetReadBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetReadOpsPerSecond(value: Double): Self = this.set("targetReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetReadOpsPerSecond: Self = this.set("targetReadOpsPerSecond", js.undefined)
    
    @scala.inline
    def setTargetWriteBytesPerSecond(value: Double): Self = this.set("targetWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWriteBytesPerSecond: Self = this.set("targetWriteBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetWriteOpsPerSecond(value: Double): Self = this.set("targetWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWriteOpsPerSecond: Self = this.set("targetWriteOpsPerSecond", js.undefined)
  }
}
