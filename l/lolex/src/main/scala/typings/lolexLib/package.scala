package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lolexLib {
  /**
   * Lolex clock for a browser environment.
   */
  type BrowserClock = js.Any
  /**
   * Clock object created by lolex.
   */
  type Clock = BrowserClock | NodeClock
  /**
   * Names of clock methods that may be faked by install.
   */
  type FakeMethod = lolexLib.lolexLibStrings.setTimeout | lolexLib.lolexLibStrings.clearTimeout | lolexLib.lolexLibStrings.setImmediate | lolexLib.lolexLibStrings.clearImmediate | lolexLib.lolexLibStrings.setInterval | lolexLib.lolexLibStrings.clearInterval | lolexLib.lolexLibStrings.Date | lolexLib.lolexLibStrings.nextTick | lolexLib.lolexLibStrings.hrtime
  /**
   * Lolex clock for a Node environment.
   */
  type NodeClock = js.Any with Anon_Hrtime
}
