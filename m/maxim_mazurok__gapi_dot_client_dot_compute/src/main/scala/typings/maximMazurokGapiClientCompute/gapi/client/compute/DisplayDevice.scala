package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayDevice extends StObject {
  
  /** Defines whether the instance has Display enabled. */
  var enableDisplay: js.UndefOr[Boolean] = js.undefined
}
object DisplayDevice {
  
  @scala.inline
  def apply(): DisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayDevice]
  }
  
  @scala.inline
  implicit class DisplayDeviceMutableBuilder[Self <: DisplayDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDisplay(value: Boolean): Self = StObject.set(x, "enableDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDisplayUndefined: Self = StObject.set(x, "enableDisplay", js.undefined)
  }
}
