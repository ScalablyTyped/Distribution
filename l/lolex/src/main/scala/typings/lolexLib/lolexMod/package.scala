package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lolexMod {
  /**
    * Lolex clock for a browser environment.
    */
  type BrowserClock = LolexClock[scala.Double] with lolexLib.Anon_Performance
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
  type NodeClock = LolexClock[NodeTimer] with lolexLib.Anon_Callback
  type TimerId = scala.Double | NodeTimer
}
