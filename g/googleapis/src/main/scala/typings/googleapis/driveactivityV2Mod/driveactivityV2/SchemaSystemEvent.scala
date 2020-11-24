package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by system operations instead of end users.
  */
@js.native
trait SchemaSystemEvent extends js.Object {
  
  /**
    * The type of the system event that may triggered activity.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaSystemEvent {
  
  @scala.inline
  def apply(): SchemaSystemEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemEvent]
  }
  
  @scala.inline
  implicit class SchemaSystemEventOps[Self <: SchemaSystemEvent] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
