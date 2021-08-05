package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a trigger in a workspace.
  */
trait SchemaRevertTriggerResponse extends StObject {
  
  /**
    * Trigger as it appears in the latest container version since the last
    * workspace synchronization operation. If no trigger is present, that means
    * the trigger was deleted in the latest container version.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.undefined
}
object SchemaRevertTriggerResponse {
  
  inline def apply(): SchemaRevertTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertTriggerResponse]
  }
  
  extension [Self <: SchemaRevertTriggerResponse](x: Self) {
    
    inline def setTrigger(value: SchemaTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
