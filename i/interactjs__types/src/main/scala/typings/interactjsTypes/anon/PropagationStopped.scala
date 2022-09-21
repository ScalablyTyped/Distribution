package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropagationStopped extends StObject {
  
  var propagationStopped: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
}
object PropagationStopped {
  
  inline def apply(`type`: String): PropagationStopped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagationStopped]
  }
  
  extension [Self <: PropagationStopped](x: Self) {
    
    inline def setPropagationStopped(value: Boolean): Self = StObject.set(x, "propagationStopped", value.asInstanceOf[js.Any])
    
    inline def setPropagationStoppedUndefined: Self = StObject.set(x, "propagationStopped", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
