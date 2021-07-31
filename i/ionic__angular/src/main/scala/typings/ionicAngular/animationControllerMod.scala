package typings.ionicAngular

import typings.ionicCore.animationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationControllerMod {
  
  @JSImport("@ionic/angular/providers/animation-controller", "AnimationController")
  @js.native
  class AnimationController () extends StObject {
    
    /**
      * Create a new animation
      */
    def create(): Animation = js.native
    def create(animationId: String): Animation = js.native
    
    /**
      * EXPERIMENTAL
      *
      * Given a progression and a cubic bezier function,
      * this utility returns the time value(s) at which the
      * cubic bezier reaches the given time progression.
      *
      * If the cubic bezier never reaches the progression
      * the result will be an empty array.
      *
      * This is most useful for switching between easing curves
      * when doing a gesture animation (i.e. going from linear easing
      * during a drag, to another easing when `progressEnd` is called)
      */
    def easingTime(
      p0: js.Array[Double],
      p1: js.Array[Double],
      p2: js.Array[Double],
      p3: js.Array[Double],
      progression: Double
    ): js.Array[Double] = js.native
  }
}
