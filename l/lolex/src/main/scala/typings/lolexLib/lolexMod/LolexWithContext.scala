package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LolexWithContext extends js.Object {
  var timers: GlobalTimers[TimerId] = js.native
  def createClock[TClock /* <: Clock */](): TClock = js.native
  def createClock[TClock /* <: Clock */](now: scala.Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: scala.Double, loopLimit: scala.Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: stdLib.Date): TClock = js.native
  def createClock[TClock /* <: Clock */](now: stdLib.Date, loopLimit: scala.Double): TClock = js.native
  def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
  def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
  def withGlobal(global: js.Object): LolexWithContext = js.native
}

