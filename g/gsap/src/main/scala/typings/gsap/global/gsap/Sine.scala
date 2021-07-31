package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Sine")
@js.native
class Sine ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Sine {
  
  @JSGlobal("gsap.Sine")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Sine.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Sine = js.native
  
  /* static member */
  @JSGlobal("gsap.Sine.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Sine = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Sine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Sine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Sine.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Sine = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Sine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
