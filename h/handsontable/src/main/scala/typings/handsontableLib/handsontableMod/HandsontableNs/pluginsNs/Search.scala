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
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, callback = callback, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, getCallback = getCallback, getQueryMethod = getQueryMethod, getSearchResultClass = getSearchResultClass, init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, query = query, queryMethod = queryMethod, removeHook = removeHook, searchResultClass = searchResultClass, setCallback = setCallback, setQueryMethod = setQueryMethod, setSearchResultClass = setSearchResultClass)
  
    __obj.asInstanceOf[Search]
  }
}

