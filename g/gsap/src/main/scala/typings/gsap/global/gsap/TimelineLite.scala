package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.TimelineLite")
@js.native
class TimelineLite ()
  extends typings.gsap.gsap.TimelineLite {
  def this(vars: js.Object) = this()
}
object TimelineLite {
  
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  /* static member */
  @JSGlobal("gsap.TimelineLite.exportRoot")
  @js.native
  def exportRoot(): typings.gsap.gsap.TimelineLite = js.native
  @JSGlobal("gsap.TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.UndefOr[scala.Nothing], omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = js.native
  @JSGlobal("gsap.TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.Object): typings.gsap.gsap.TimelineLite = js.native
  @JSGlobal("gsap.TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: Boolean): typings.gsap.gsap.TimelineLite = js.native
}
