package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Quart` */
@JSGlobal("gsap.Power3")
@js.native
class Power3 ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
/* was `typeof Quart` */
object Power3 {
  
  @JSGlobal("gsap.Power3")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Power3.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quart = js.native
  
  /* static member */
  @JSGlobal("gsap.Power3.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quart = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Power3.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quart = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
