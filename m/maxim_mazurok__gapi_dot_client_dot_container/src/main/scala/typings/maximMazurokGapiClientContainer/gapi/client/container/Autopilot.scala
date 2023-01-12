package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autopilot extends StObject {
  
  /** Enable Autopilot */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object Autopilot {
  
  inline def apply(): Autopilot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autopilot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Autopilot] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
