package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Quad` */
@JSGlobal("gsap.Power1")
@js.native
class Power1 ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
/* was `typeof Quad` */
object Power1 {
  
  @JSGlobal("gsap.Power1")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Power1.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quad = js.native
  
  /* static member */
  @JSGlobal("gsap.Power1.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quad = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Power1.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quad = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
