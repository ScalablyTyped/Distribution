package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderTooltips extends Base {
  var settings: Boolean | js.Object = js.native
  def parseSettings(): Unit = js.native
}

object HeaderTooltips {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    parseSettings: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    settings: Boolean | js.Object,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): HeaderTooltips = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], parseSettings = js.Any.fromFunction0(parseSettings), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), settings = settings.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[HeaderTooltips]
  }
  @scala.inline
  implicit class HeaderTooltipsOps[Self <: HeaderTooltips] (val x: Self) extends AnyVal {
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
    def setParseSettings(value: () => Unit): Self = this.set("parseSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setSettings(value: Boolean | js.Object): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

