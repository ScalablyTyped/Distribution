package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchScroll extends Base {
  var clones: js.Array[_] = js.native
  var lockedCollection: Boolean = js.native
  var scrollbars: js.Array[_] = js.native
}

object TouchScroll {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    clones: js.Array[_],
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    lockedCollection: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    scrollbars: js.Array[_],
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): TouchScroll = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), clones = clones.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], lockedCollection = lockedCollection.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), scrollbars = scrollbars.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[TouchScroll]
  }
  @scala.inline
  implicit class TouchScrollOps[Self <: TouchScroll] (val x: Self) extends AnyVal {
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
    def setClonesVarargs(value: js.Any*): Self = this.set("clones", js.Array(value :_*))
    @scala.inline
    def setClones(value: js.Array[_]): Self = this.set("clones", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockedCollection(value: Boolean): Self = this.set("lockedCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbarsVarargs(value: js.Any*): Self = this.set("scrollbars", js.Array(value :_*))
    @scala.inline
    def setScrollbars(value: js.Array[_]): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
  }
  
}

