package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Capture extends StObject {
  
  var capture: js.UndefOr[Boolean] = js.native
  
  var passive: js.UndefOr[Boolean] = js.native
}
object Capture {
  
  @scala.inline
  def apply(): Capture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capture]
  }
  
  @scala.inline
  implicit class CaptureMutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
