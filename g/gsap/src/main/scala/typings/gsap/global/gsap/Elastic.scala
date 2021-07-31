package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Elastic")
@js.native
class Elastic ()
  extends StObject
     with typings.gsap.gsap.Elastic {
  
  /* CompleteClass */
  override def config(amplitude: Double, period: Double): typings.gsap.gsap.Elastic = js.native
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Elastic {
  
  @JSGlobal("gsap.Elastic")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("gsap.Elastic.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Elastic = js.native
  
  /* static member */
  @JSGlobal("gsap.Elastic.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Elastic = js.native
  @scala.inline
  def easeInOut_=(x: typings.gsap.gsap.Elastic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def easeIn_=(x: typings.gsap.gsap.Elastic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("gsap.Elastic.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Elastic = js.native
  @scala.inline
  def easeOut_=(x: typings.gsap.gsap.Elastic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
