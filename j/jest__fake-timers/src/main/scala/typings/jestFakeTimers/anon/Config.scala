package typings.jestFakeTimers.anon

import typings.jestFakeTimers.jestFakeTimersMod.TimerConfig
import typings.jestMessageUtil.mod.StackTraceConfig
import typings.jestMock.mod.ModuleMocker
import typings.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[TimerRef] extends js.Object {
  var config: StackTraceConfig = js.native
  var global: Global = js.native
  var maxLoops: js.UndefOr[Double] = js.native
  var moduleMocker: ModuleMocker = js.native
  var timerConfig: TimerConfig[TimerRef] = js.native
}

object Config {
  @scala.inline
  def apply[TimerRef](
    config: StackTraceConfig,
    global: Global,
    moduleMocker: ModuleMocker,
    timerConfig: TimerConfig[TimerRef]
  ): Config[TimerRef] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[TimerRef]]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], TimerRef] (val x: Self with Config[TimerRef]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: StackTraceConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Global): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleMocker(value: ModuleMocker): Self = this.set("moduleMocker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimerConfig(value: TimerConfig[TimerRef]): Self = this.set("timerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLoops(value: Double): Self = this.set("maxLoops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLoops: Self = this.set("maxLoops", js.undefined)
  }
  
}

