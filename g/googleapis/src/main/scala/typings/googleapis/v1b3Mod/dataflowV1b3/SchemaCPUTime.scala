package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Modeled after information exposed by /proc/stat.
  */
@js.native
trait SchemaCPUTime extends js.Object {
  
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.native
}
object SchemaCPUTime {
  
  @scala.inline
  def apply(): SchemaCPUTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUTime]
  }
  
  @scala.inline
  implicit class SchemaCPUTimeOps[Self <: SchemaCPUTime] (val x: Self) extends AnyVal {
    
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
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTotalMs(value: String): Self = this.set("totalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalMs: Self = this.set("totalMs", js.undefined)
  }
}
