package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Linear` */
@JSGlobal("gsap.Power0")
@js.native
class Power0 ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
/* was `typeof Linear` */
object Power0 {
  
  @JSGlobal("gsap.Power0")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Power0.ease")
  @js.native
  def ease: typings.gsap.gsap.Linear = js.native
  
  /* static member */
  @JSGlobal("gsap.Power0.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Linear = js.native
  
  /* static member */
  @JSGlobal("gsap.Power0.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Linear = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Power0.easeNone")
  @js.native
  def easeNone: typings.gsap.gsap.Linear = js.native
  inline def easeNone_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeNone")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Power0.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Linear = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
  
  inline def ease_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
}
