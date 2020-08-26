package typings.lolex.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LolexWithContext extends js.Object {
  var timers: GlobalTimers[TimerId] = js.native
  def createClock[TClock /* <: Clock */](): TClock = js.native
  def createClock[TClock /* <: Clock */](now: js.UndefOr[scala.Nothing], loopLimit: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Date): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Date, loopLimit: Double): TClock = js.native
  def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
  def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
  def withGlobal(global: js.Object): LolexWithContext = js.native
}

