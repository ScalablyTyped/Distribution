package typings.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Lolex clock for a browser environment.
    */
  type BrowserClock = typings.lolex.mod.LolexClock[scala.Double] with typings.lolex.AnonPerformance
  /**
    * Clock object created by lolex.
    */
  type Clock = typings.lolex.mod.BrowserClock | typings.lolex.mod.NodeClock
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: typings.lolex.mod.Clock */] = TClock with typings.lolex.mod.InstalledMethods
  /**
    * Lolex clock for a Node environment.
    */
  type NodeClock = typings.lolex.mod.LolexClock[typings.lolex.mod.NodeTimer] with typings.lolex.AnonCallback
  type TimerId = scala.Double | typings.lolex.mod.NodeTimer
}
