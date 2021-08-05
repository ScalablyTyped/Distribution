package typings.gsap.mod

import typings.gsap.gsap.RoughEaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "RoughEase")
@js.native
class RoughEase protected ()
  extends StObject
     with typings.gsap.gsap.RoughEase {
  def this(vars: RoughEaseConfig) = this()
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object RoughEase {
  
  @JSImport("gsap", "RoughEase")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("gsap", "RoughEase.ease")
  @js.native
  def ease: typings.gsap.gsap.RoughEase = js.native
  inline def ease_=(x: typings.gsap.gsap.RoughEase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
}
