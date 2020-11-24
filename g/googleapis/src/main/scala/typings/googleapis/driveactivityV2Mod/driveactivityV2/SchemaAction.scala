package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the action.
  */
@js.native
trait SchemaAction extends js.Object {
  
  /**
    * The actor responsible for this action (or empty if all actors are
    * responsible).
    */
  var actor: js.UndefOr[SchemaActor] = js.native
  
  /**
    * The type and detailed information about the action.
    */
  var detail: js.UndefOr[SchemaActionDetail] = js.native
  
  /**
    * The target this action affects (or empty if affecting all targets). This
    * represents the state of the target immediately after this action
    * occurred.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  
  /**
    * The action occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.native
  
  /**
    * The action occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}
object SchemaAction {
  
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  @scala.inline
  implicit class SchemaActionOps[Self <: SchemaAction] (val x: Self) extends AnyVal {
    
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
    def setActor(value: SchemaActor): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setDetail(value: SchemaActionDetail): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setTarget(value: SchemaTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTimeRange(value: SchemaTimeRange): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRange: Self = this.set("timeRange", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
