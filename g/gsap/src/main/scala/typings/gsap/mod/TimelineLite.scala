package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "TimelineLite")
@js.native
class TimelineLite ()
  extends typings.gsap.gsap.TimelineLite {
  def this(vars: js.Object) = this()
}
/* static members */
@JSImport("gsap", "TimelineLite")
@js.native
object TimelineLite extends js.Object {
  
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  def exportRoot(): typings.gsap.gsap.TimelineLite = js.native
  def exportRoot(vars: js.UndefOr[scala.Nothing], omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = js.native
  def exportRoot(vars: js.Object): typings.gsap.gsap.TimelineLite = js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = js.native
}
