package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Circ")
@js.native
class Circ ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Circ {
  
  @JSGlobal("gsap.Circ")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Circ.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Circ = js.native
  
  /* static member */
  @JSGlobal("gsap.Circ.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Circ = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Circ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Circ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Circ.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Circ = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Circ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
