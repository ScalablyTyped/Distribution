package typings.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "Quint")
@js.native
class Quint ()
  extends StObject
     with typings.gsap.gsap.Ease {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
object Quint {
  
  @JSImport("gsap", "Quint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("gsap", "Quint.easeIn")
  @js.native
  def easeIn: typings.gsap.gsap.Quint = js.native
  
  /* static member */
  @JSImport("gsap", "Quint.easeInOut")
  @js.native
  def easeInOut: typings.gsap.gsap.Quint = js.native
  inline def easeInOut_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOut")(x.asInstanceOf[js.Any])
  
  inline def easeIn_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gsap", "Quint.easeOut")
  @js.native
  def easeOut: typings.gsap.gsap.Quint = js.native
  inline def easeOut_=(x: typings.gsap.gsap.Quint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(x.asInstanceOf[js.Any])
}
