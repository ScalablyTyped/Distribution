package typings.jestFakeTimers.anon

import typings.jestFakeTimers.jestFakeTimersMod.TimerConfig
import typings.jestMessageUtil.mod.StackTraceConfig
import typings.jestMock.mod.ModuleMocker
import typings.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[TimerRef] extends js.Object {
  var config: StackTraceConfig
  var global: Global
  var maxLoops: js.UndefOr[Double] = js.undefined
  var moduleMocker: ModuleMocker
  var timerConfig: TimerConfig[TimerRef]
}

object Config {
  @scala.inline
  def apply[TimerRef](
    config: StackTraceConfig,
    global: Global,
    moduleMocker: ModuleMocker,
    timerConfig: TimerConfig[TimerRef],
    maxLoops: js.UndefOr[Double] = js.undefined
  ): Config[TimerRef] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLoops)) __obj.updateDynamic("maxLoops")(maxLoops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[TimerRef]]
  }
}

