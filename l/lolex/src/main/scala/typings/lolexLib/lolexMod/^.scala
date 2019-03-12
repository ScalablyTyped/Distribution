package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lolex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val timers: GlobalTimers[TimerId] = js.native
  def createClock[TClock /* <: lolexLib.Clock */](): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: scala.Double): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: scala.Double, loopLimit: scala.Double): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: stdLib.Date): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: stdLib.Date, loopLimit: scala.Double): TClock = js.native
  def install[TClock /* <: lolexLib.Clock */](): lolexLib.InstalledClock[TClock] = js.native
  def install[TClock /* <: lolexLib.Clock */](opts: LolexInstallOpts): lolexLib.InstalledClock[TClock] = js.native
  def withGlobal(global: js.Object): LolexWithContext = js.native
}

