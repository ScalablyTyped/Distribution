package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable:strict-export-declare-modifiers
trait MixinType extends StObject {
  
  var Events: typings.leaflet.mod.Events
}
object MixinType {
  
  inline def apply(Events: Events): MixinType = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinType]
  }
  
  extension [Self <: MixinType](x: Self) {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
  }
}
