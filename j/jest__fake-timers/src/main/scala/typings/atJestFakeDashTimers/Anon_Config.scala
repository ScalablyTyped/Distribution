package typings.atJestFakeDashTimers

import typings.atJestFakeDashTimers.buildJestFakeTimersMod.TimerConfig
import typings.jestDashMessageDashUtil.jestDashMessageDashUtilMod.StackTraceConfig
import typings.jestDashMock.jestDashMockMod.ModuleMocker
import typings.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config[TimerRef] extends js.Object {
  var config: StackTraceConfig
  var global: Global
  var maxLoops: js.UndefOr[Double] = js.undefined
  var moduleMocker: ModuleMocker
  var timerConfig: TimerConfig[TimerRef]
}

object Anon_Config {
  @scala.inline
  def apply[TimerRef](
    config: StackTraceConfig,
    global: Global,
    moduleMocker: ModuleMocker,
    timerConfig: TimerConfig[TimerRef],
    maxLoops: Int | Double = null
  ): Anon_Config[TimerRef] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
    if (maxLoops != null) __obj.updateDynamic("maxLoops")(maxLoops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Config[TimerRef]]
  }
}

