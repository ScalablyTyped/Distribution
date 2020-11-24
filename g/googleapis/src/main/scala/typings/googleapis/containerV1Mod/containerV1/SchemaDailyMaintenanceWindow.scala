package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for daily maintenance operations.
  */
@js.native
trait SchemaDailyMaintenanceWindow extends js.Object {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario. Duration will be in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format
    * &quot;PTnHnMnS&quot;.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Time within the maintenance window to start the maintenance operations.
    * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format &quot;HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaDailyMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaDailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDailyMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaDailyMaintenanceWindowOps[Self <: SchemaDailyMaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
