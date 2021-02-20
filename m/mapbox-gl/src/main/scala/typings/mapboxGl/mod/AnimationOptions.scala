package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends StObject {
  
  /** When set to false, no animation happens */
  var animate: js.UndefOr[Boolean] = js.native
  
  /** Number in milliseconds */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * A function taking a time in the range 0..1 and returning a number where 0 is the initial
    * state and 1 is the final state.
    */
  var easing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
  
  /** If `true`, then the animation is considered essential and will not be affected by `prefers-reduced-motion`.
    * Otherwise, the transition will happen instantly if the user has enabled the `reduced motion` accesibility feature in their operating system.
    */
  var essential: js.UndefOr[Boolean] = js.native
  
  /** point, origin of movement relative to map center */
  var offset: js.UndefOr[PointLike] = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: /* time */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    @scala.inline
    def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
