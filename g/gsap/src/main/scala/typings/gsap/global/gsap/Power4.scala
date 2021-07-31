package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Quint` */
@JSGlobal("gsap.Power4")
@js.native
class Power4 ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
/* was `typeof Quint` */
object Power4 {
  
  @JSGlobal("gsap.Power4")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Power4.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quint = js.native
  
  /* static member */
  @JSGlobal("gsap.Power4.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quint = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Power4.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quint = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
