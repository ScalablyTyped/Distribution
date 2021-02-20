package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Light extends StObject {
  
  var anchor: js.UndefOr[map | viewport] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var `color-transition`: js.UndefOr[Transition] = js.native
  
  var intensity: js.UndefOr[Double] = js.native
  
  var `intensity-transition`: js.UndefOr[Transition] = js.native
  
  var position: js.UndefOr[js.Array[Double]] = js.native
  
  var `position-transition`: js.UndefOr[Transition] = js.native
}
object Light {
  
  @scala.inline
  def apply(): Light = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Light]
  }
  
  @scala.inline
  implicit class LightMutableBuilder[Self <: Light] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: map | viewport): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-transition`(value: Transition): Self = StObject.set(x, "color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-transitionUndefined`: Self = StObject.set(x, "color-transition", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIntensity-transition`(value: Transition): Self = StObject.set(x, "intensity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIntensity-transitionUndefined`: Self = StObject.set(x, "intensity-transition", js.undefined)
    
    @scala.inline
    def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPosition-transition`(value: Transition): Self = StObject.set(x, "position-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPosition-transitionUndefined`: Self = StObject.set(x, "position-transition", js.undefined)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
