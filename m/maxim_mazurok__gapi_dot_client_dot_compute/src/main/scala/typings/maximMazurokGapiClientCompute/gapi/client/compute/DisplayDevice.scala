package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayDevice extends StObject {
  
  /** Defines whether the instance has Display enabled. */
  var enableDisplay: js.UndefOr[Boolean] = js.undefined
}
object DisplayDevice {
  
  inline def apply(): DisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayDevice]
  }
  
  extension [Self <: DisplayDevice](x: Self) {
    
    inline def setEnableDisplay(value: Boolean): Self = StObject.set(x, "enableDisplay", value.asInstanceOf[js.Any])
    
    inline def setEnableDisplayUndefined: Self = StObject.set(x, "enableDisplay", js.undefined)
  }
}
