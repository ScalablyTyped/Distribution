package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.SlowMo")
@js.native
class SlowMo ()
  extends StObject
     with typings.gsap.gsap.SlowMo {
  
  /* CompleteClass */
  override def config(linearRatio: Double, power: Double, yoyoMode: Boolean): typings.gsap.gsap.SlowMo = js.native
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object SlowMo {
  
  @JSGlobal("gsap.SlowMo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.SlowMo.ease")
  @js.native
  def ease: typings.gsap.gsap.SlowMo = js.native
  @scala.inline
  def ease_=(x: typings.gsap.gsap.SlowMo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
}
