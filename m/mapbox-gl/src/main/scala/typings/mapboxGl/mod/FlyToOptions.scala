package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyToOptions
  extends AnimationOptions
     with CameraOptions {
  
  var curve: js.UndefOr[Double] = js.native
  
  var maxDuration: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var screenSpeed: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object FlyToOptions {
  
  @scala.inline
  def apply(): FlyToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToOptions]
  }
  
  @scala.inline
  implicit class FlyToOptionsMutableBuilder[Self <: FlyToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: Double): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setScreenSpeed(value: Double): Self = StObject.set(x, "screenSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSpeedUndefined: Self = StObject.set(x, "screenSpeed", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
