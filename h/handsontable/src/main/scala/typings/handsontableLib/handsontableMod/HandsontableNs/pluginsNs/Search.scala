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
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    callback: () => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    getCallback: () => js.Function0[scala.Unit],
    getQueryMethod: () => js.Function0[scala.Unit],
    getSearchResultClass: () => java.lang.String,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    query: (java.lang.String, js.Function0[scala.Unit], js.Function0[scala.Unit]) => js.Array[_],
    queryMethod: () => scala.Unit,
    removeHooks: java.lang.String => scala.Unit,
    searchResultClass: java.lang.String,
    setCallback: js.Function0[scala.Unit] => scala.Unit,
    setQueryMethod: js.Function0[scala.Unit] => scala.Unit,
    setSearchResultClass: java.lang.String => scala.Unit
  ): Search = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), callback = js.Any.fromFunction0(callback), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, getCallback = js.Any.fromFunction0(getCallback), getQueryMethod = js.Any.fromFunction0(getQueryMethod), getSearchResultClass = js.Any.fromFunction0(getSearchResultClass), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, query = js.Any.fromFunction3(query), queryMethod = js.Any.fromFunction0(queryMethod), removeHooks = js.Any.fromFunction1(removeHooks), searchResultClass = searchResultClass, setCallback = js.Any.fromFunction1(setCallback), setQueryMethod = js.Any.fromFunction1(setQueryMethod), setSearchResultClass = js.Any.fromFunction1(setSearchResultClass))
  
    __obj.asInstanceOf[Search]
  }
}

