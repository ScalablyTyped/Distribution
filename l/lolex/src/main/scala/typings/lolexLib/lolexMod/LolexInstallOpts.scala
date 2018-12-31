package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LolexInstallOpts extends js.Object {
  /**
    * Relevant only when using with shouldAdvanceTime: true. increment mocked time by advanceTimeDelta ms every advanceTimeDelta ms change
    * in the real system time (default: 20)
    */
  var advanceTimeDelta: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of timers that will be run when calling runAll() (default: 1000)
    */
  var loopLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Installs lolex with the specified unix epoch (default: 0)
    */
  var now: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
    * Tells lolex to increment mocked time automatically based on the real system time shift (e.g. the mocked time will be incremented by
    * 20ms for every 20ms change in the real system time) (default: false)
    */
  var shouldAdvanceTime: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Installs lolex onto the specified target context (default: global)
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /**
    * An array with explicit function names to hijack. When not set, lolex will automatically fake all methods except nextTick
    * e.g., lolex.install({ toFake: ["setTimeout", "nextTick"]}) will fake only setTimeout and nextTick
    */
  var toFake: js.UndefOr[js.Array[lolexLib.FakeMethod]] = js.undefined
}

