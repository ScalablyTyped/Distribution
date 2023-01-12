package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNIC extends StObject {
  
  /** Whether gVNIC features are enabled in the node pool. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object VirtualNIC {
  
  inline def apply(): VirtualNIC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNIC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualNIC] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
