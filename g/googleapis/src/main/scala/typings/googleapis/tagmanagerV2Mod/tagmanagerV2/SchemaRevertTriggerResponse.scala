package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a trigger in a workspace.
  */
@js.native
trait SchemaRevertTriggerResponse extends js.Object {
  
  /**
    * Trigger as it appears in the latest container version since the last
    * workspace synchronization operation. If no trigger is present, that means
    * the trigger was deleted in the latest container version.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
}
object SchemaRevertTriggerResponse {
  
  @scala.inline
  def apply(): SchemaRevertTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertTriggerResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertTriggerResponseOps[Self <: SchemaRevertTriggerResponse] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: SchemaTrigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
