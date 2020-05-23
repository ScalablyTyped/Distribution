package typings.jestWatcher.typesMod

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchPlugin extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.undefined
  var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.undefined
  var isInternal: js.UndefOr[Boolean] = js.undefined
  var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var run: js.UndefOr[
    js.Function2[
      /* globalConfig */ GlobalConfig, 
      /* updateConfigAndRun */ UpdateConfigCallback, 
      js.Promise[Unit | Boolean]
    ]
  ] = js.undefined
}

object WatchPlugin {
  @scala.inline
  def apply(
    apply: /* hooks */ JestHookSubscriber => Unit = null,
    getUsageInfo: /* globalConfig */ GlobalConfig => UsageData | Null = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    onKey: /* value */ String => Unit = null,
    run: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => js.Promise[Unit | Boolean] = null
  ): WatchPlugin = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction1(apply))
    if (getUsageInfo != null) __obj.updateDynamic("getUsageInfo")(js.Any.fromFunction1(getUsageInfo))
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.get.asInstanceOf[js.Any])
    if (onKey != null) __obj.updateDynamic("onKey")(js.Any.fromFunction1(onKey))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction2(run))
    __obj.asInstanceOf[WatchPlugin]
  }
}

