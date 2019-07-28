package typings.lolex

import typings.lolex.Anon_Callback
import typings.lolex.Anon_Performance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lolexMod {
  /**
    * Lolex clock for a browser environment.
    */
  type BrowserClock = LolexClock[Double] with Anon_Performance
  /**
    * Clock object created by lolex.
    */
  type Clock = BrowserClock | NodeClock
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: Clock */] = TClock with InstalledMethods
  /**
    * Lolex clock for a Node environment.
    */
  type NodeClock = LolexClock[NodeTimer] with Anon_Callback
  type TimerId = Double | NodeTimer
}
