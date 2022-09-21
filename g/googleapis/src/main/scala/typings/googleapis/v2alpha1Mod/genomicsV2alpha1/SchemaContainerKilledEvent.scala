package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerKilledEvent extends StObject {
  
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaContainerKilledEvent {
  
  inline def apply(): SchemaContainerKilledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerKilledEvent]
  }
  
  extension [Self <: SchemaContainerKilledEvent](x: Self) {
    
    inline def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
