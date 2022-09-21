package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtrModificationEvent extends StObject {
  
  var newOtrStatus: js.UndefOr[String | Null] = js.undefined
  
  var newOtrToggle: js.UndefOr[String | Null] = js.undefined
  
  var oldOtrStatus: js.UndefOr[String | Null] = js.undefined
  
  var oldOtrToggle: js.UndefOr[String | Null] = js.undefined
}
object SchemaOtrModificationEvent {
  
  inline def apply(): SchemaOtrModificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtrModificationEvent]
  }
  
  extension [Self <: SchemaOtrModificationEvent](x: Self) {
    
    inline def setNewOtrStatus(value: String): Self = StObject.set(x, "newOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setNewOtrStatusNull: Self = StObject.set(x, "newOtrStatus", null)
    
    inline def setNewOtrStatusUndefined: Self = StObject.set(x, "newOtrStatus", js.undefined)
    
    inline def setNewOtrToggle(value: String): Self = StObject.set(x, "newOtrToggle", value.asInstanceOf[js.Any])
    
    inline def setNewOtrToggleNull: Self = StObject.set(x, "newOtrToggle", null)
    
    inline def setNewOtrToggleUndefined: Self = StObject.set(x, "newOtrToggle", js.undefined)
    
    inline def setOldOtrStatus(value: String): Self = StObject.set(x, "oldOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setOldOtrStatusNull: Self = StObject.set(x, "oldOtrStatus", null)
    
    inline def setOldOtrStatusUndefined: Self = StObject.set(x, "oldOtrStatus", js.undefined)
    
    inline def setOldOtrToggle(value: String): Self = StObject.set(x, "oldOtrToggle", value.asInstanceOf[js.Any])
    
    inline def setOldOtrToggleNull: Self = StObject.set(x, "oldOtrToggle", null)
    
    inline def setOldOtrToggleUndefined: Self = StObject.set(x, "oldOtrToggle", js.undefined)
  }
}
