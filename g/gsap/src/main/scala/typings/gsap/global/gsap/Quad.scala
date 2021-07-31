package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Quad")
@js.native
class Quad ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Quad {
  
  @JSGlobal("gsap.Quad")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Quad.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quad = js.native
  
  /* static member */
  @JSGlobal("gsap.Quad.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quad = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Quad.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quad = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
