package typings
package gsapLib.gsapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "TimelineLite")
@js.native
class TimelineLite ()
  extends gsapLib.gsapNs.TimelineLite {
  def this(vars: js.Object) = this()
}

@JSImport("gsap", "TimelineLite")
@js.native
object TimelineLite extends js.Object {
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  def exportRoot(): gsapLib.gsapNs.TimelineLite = js.native
  def exportRoot(vars: js.Object): gsapLib.gsapNs.TimelineLite = js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: scala.Boolean): gsapLib.gsapNs.TimelineLite = js.native
}

