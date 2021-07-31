package typings.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "Quart")
@js.native
class Quart ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Quart {
  
  @JSImport("gsap", "Quart")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("gsap", "Quart.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quart = js.native
  
  /* static member */
  @JSImport("gsap", "Quart.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quart = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gsap", "Quart.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quart = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Quart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
