package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Back")
@js.native
class Back ()
  extends StObject
     with typings.gsap.gsap.Back {
  
  /* CompleteClass */
  override def config(overshoot: Double): typings.gsap.gsap.Elastic = js.native
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Back {
  
  @JSGlobal("gsap.Back")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Back.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Back = js.native
  
  /* static member */
  @JSGlobal("gsap.Back.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Back = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Back.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Back = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
