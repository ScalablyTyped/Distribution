package typings.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "TimelineLite")
@js.native
class TimelineLite ()
  extends StObject
     with typings.gsap.gsap.TimelineLite {
  def this(vars: js.Object) = this()
}
object TimelineLite {
  
  @JSImport("gsap", "TimelineLite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  /* static member */
  @scala.inline
  def exportRoot(): typings.gsap.gsap.TimelineLite = ^.asInstanceOf[js.Dynamic].applyDynamic("exportRoot")().asInstanceOf[typings.gsap.gsap.TimelineLite]
  @scala.inline
  def exportRoot(vars: js.Object): typings.gsap.gsap.TimelineLite = ^.asInstanceOf[js.Dynamic].applyDynamic("exportRoot")(vars.asInstanceOf[js.Any]).asInstanceOf[typings.gsap.gsap.TimelineLite]
  @scala.inline
  def exportRoot(vars: js.Object, omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = (^.asInstanceOf[js.Dynamic].applyDynamic("exportRoot")(vars.asInstanceOf[js.Any], omitDelayedCalls.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TimelineLite]
  @scala.inline
  def exportRoot(vars: Unit, omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = (^.asInstanceOf[js.Dynamic].applyDynamic("exportRoot")(vars.asInstanceOf[js.Any], omitDelayedCalls.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TimelineLite]
}
