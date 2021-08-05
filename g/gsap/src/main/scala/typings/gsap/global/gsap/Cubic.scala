package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Cubic")
@js.native
class Cubic ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Cubic {
  
  @JSGlobal("gsap.Cubic")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Cubic.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Cubic = js.native
  
  /* static member */
  @JSGlobal("gsap.Cubic.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Cubic = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Cubic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Cubic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Cubic.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Cubic = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Cubic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
