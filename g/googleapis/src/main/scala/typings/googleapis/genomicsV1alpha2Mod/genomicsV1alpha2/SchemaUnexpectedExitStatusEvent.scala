package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnexpectedExitStatusEvent extends StObject {
  
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double | Null] = js.undefined
}
object SchemaUnexpectedExitStatusEvent {
  
  inline def apply(): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
  
  extension [Self <: SchemaUnexpectedExitStatusEvent](x: Self) {
    
    inline def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setExitStatus(value: Double): Self = StObject.set(x, "exitStatus", value.asInstanceOf[js.Any])
    
    inline def setExitStatusNull: Self = StObject.set(x, "exitStatus", null)
    
    inline def setExitStatusUndefined: Self = StObject.set(x, "exitStatus", js.undefined)
  }
}
