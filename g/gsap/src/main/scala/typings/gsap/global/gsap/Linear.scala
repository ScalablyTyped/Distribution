package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Linear")
@js.native
class Linear ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Linear {
  
  @JSGlobal("gsap.Linear")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Linear.ease")
  @js.native
  def ease: typings.gsap.gsap.Linear = js.native
  
  /* static member */
  @JSGlobal("gsap.Linear.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Linear = js.native
  
  /* static member */
  @JSGlobal("gsap.Linear.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Linear = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Linear.easeNone")
  @js.native
  def easeNone: typings.gsap.gsap.Linear = js.native
  inline def easeNone_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeNone")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Linear.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Linear = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
  
  inline def ease_=(x: typings.gsap.gsap.Linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
}
