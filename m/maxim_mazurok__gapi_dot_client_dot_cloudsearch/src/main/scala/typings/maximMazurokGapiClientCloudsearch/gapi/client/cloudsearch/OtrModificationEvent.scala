package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtrModificationEvent extends StObject {
  
  var newOtrStatus: js.UndefOr[String] = js.undefined
  
  var newOtrToggle: js.UndefOr[String] = js.undefined
  
  var oldOtrStatus: js.UndefOr[String] = js.undefined
  
  var oldOtrToggle: js.UndefOr[String] = js.undefined
}
object OtrModificationEvent {
  
  inline def apply(): OtrModificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtrModificationEvent]
  }
  
  extension [Self <: OtrModificationEvent](x: Self) {
    
    inline def setNewOtrStatus(value: String): Self = StObject.set(x, "newOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setNewOtrStatusUndefined: Self = StObject.set(x, "newOtrStatus", js.undefined)
    
    inline def setNewOtrToggle(value: String): Self = StObject.set(x, "newOtrToggle", value.asInstanceOf[js.Any])
    
    inline def setNewOtrToggleUndefined: Self = StObject.set(x, "newOtrToggle", js.undefined)
    
    inline def setOldOtrStatus(value: String): Self = StObject.set(x, "oldOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setOldOtrStatusUndefined: Self = StObject.set(x, "oldOtrStatus", js.undefined)
    
    inline def setOldOtrToggle(value: String): Self = StObject.set(x, "oldOtrToggle", value.asInstanceOf[js.Any])
    
    inline def setOldOtrToggleUndefined: Self = StObject.set(x, "oldOtrToggle", js.undefined)
  }
}
