package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Bounce")
@js.native
class Bounce ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Bounce {
  
  @JSGlobal("gsap.Bounce")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Bounce.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Bounce = js.native
  
  /* static member */
  @JSGlobal("gsap.Bounce.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Bounce = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Bounce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Bounce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Bounce.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Bounce = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Bounce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
