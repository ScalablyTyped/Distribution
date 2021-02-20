package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a trigger in a workspace.
  */
@js.native
trait SchemaRevertTriggerResponse extends StObject {
  
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
  implicit class SchemaRevertTriggerResponseMutableBuilder[Self <: SchemaRevertTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: SchemaTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
