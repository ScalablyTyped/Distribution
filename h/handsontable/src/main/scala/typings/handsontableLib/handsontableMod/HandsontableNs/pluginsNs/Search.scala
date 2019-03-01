package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends Base {
  var searchResultClass: java.lang.String
  def callback(): scala.Unit
  def getCallback(): js.Function0[scala.Unit]
  def getQueryMethod(): js.Function0[scala.Unit]
  def getSearchResultClass(): java.lang.String
  def query(
    queryStr: java.lang.String,
    callback: js.Function0[scala.Unit],
    queryMethod: js.Function0[scala.Unit]
  ): js.Array[_]
  def queryMethod(): scala.Unit
  def setCallback(newCallback: js.Function0[scala.Unit]): scala.Unit
  def setQueryMethod(newQueryMethod: js.Function0[scala.Unit]): scala.Unit
  def setSearchResultClass(newElementClass: java.lang.String): scala.Unit
}

object Search {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    callback: js.Function0[scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    getCallback: js.Function0[js.Function0[scala.Unit]],
    getQueryMethod: js.Function0[js.Function0[scala.Unit]],
    getSearchResultClass: js.Function0[java.lang.String],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    query: js.Function3[java.lang.String, js.Function0[scala.Unit], js.Function0[scala.Unit], js.Array[_]],
    queryMethod: js.Function0[scala.Unit],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    searchResultClass: java.lang.String,
    setCallback: js.Function1[js.Function0[scala.Unit], scala.Unit],
    setQueryMethod: js.Function1[js.Function0[scala.Unit], scala.Unit],
    setSearchResultClass: js.Function1[java.lang.String, scala.Unit]
  ): Search = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("getCallback")(getCallback)
    __obj.updateDynamic("getQueryMethod")(getQueryMethod)
    __obj.updateDynamic("getSearchResultClass")(getSearchResultClass)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("queryMethod")(queryMethod)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("searchResultClass")(searchResultClass)
    __obj.updateDynamic("setCallback")(setCallback)
    __obj.updateDynamic("setQueryMethod")(setQueryMethod)
    __obj.updateDynamic("setSearchResultClass")(setSearchResultClass)
    __obj.asInstanceOf[Search]
  }
}

