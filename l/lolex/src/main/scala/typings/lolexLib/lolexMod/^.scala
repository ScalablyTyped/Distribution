package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lolex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClock[TClock /* <: lolexLib.Clock */](): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: scala.Double): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: scala.Double, loopLimit: scala.Double): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: stdLib.Date): TClock = js.native
  def createClock[TClock /* <: lolexLib.Clock */](now: stdLib.Date, loopLimit: scala.Double): TClock = js.native
  def install[TClock /* <: lolexLib.Clock */](): TClock = js.native
  def install[TClock /* <: lolexLib.Clock */](opts: lolexLib.lolexMod.LolexInstallOpts): TClock = js.native
}

