package typings.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "SteppedEase")
@js.native
class SteppedEase protected ()
  extends StObject
     with typings.gsap.gsap.SteppedEase {
  def this(staps: Double) = this()
  
  /* CompleteClass */
  override def config(steps: Double): typings.gsap.gsap.SteppedEase = js.native
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
