package typings.jestWatcher.typesMod

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchPlugin extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.native
  var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.native
  var isInternal: js.UndefOr[Boolean] = js.native
  var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var run: js.UndefOr[
    js.Function2[
      /* globalConfig */ GlobalConfig, 
      /* updateConfigAndRun */ UpdateConfigCallback, 
      js.Promise[Unit | Boolean]
    ]
  ] = js.native
}

object WatchPlugin {
  @scala.inline
  def apply(): WatchPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchPlugin]
  }
  @scala.inline
  implicit class WatchPluginOps[Self <: WatchPlugin] (val x: Self) extends AnyVal {
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
    def setApply(value: /* hooks */ JestHookSubscriber => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setGetUsageInfo(value: /* globalConfig */ GlobalConfig => UsageData | Null): Self = this.set("getUsageInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetUsageInfo: Self = this.set("getUsageInfo", js.undefined)
    @scala.inline
    def setIsInternal(value: Boolean): Self = this.set("isInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInternal: Self = this.set("isInternal", js.undefined)
    @scala.inline
    def setOnKey(value: /* value */ String => Unit): Self = this.set("onKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKey: Self = this.set("onKey", js.undefined)
    @scala.inline
    def setRun(
      value: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => js.Promise[Unit | Boolean]
    ): Self = this.set("run", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

