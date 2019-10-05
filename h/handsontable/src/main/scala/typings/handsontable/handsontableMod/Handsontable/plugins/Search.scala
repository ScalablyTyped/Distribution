package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends Base {
  var searchResultClass: String
  def callback(): Unit
  def getCallback(): js.Function0[Unit]
  def getQueryMethod(): js.Function0[Unit]
  def getSearchResultClass(): String
  def query(queryStr: String, callback: js.Function0[Unit], queryMethod: js.Function0[Unit]): js.Array[_]
  def queryMethod(): Unit
  def setCallback(newCallback: js.Function0[Unit]): Unit
  def setQueryMethod(newQueryMethod: js.Function0[Unit]): Unit
  def setSearchResultClass(newElementClass: String): Unit
}

object Search {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    callback: () => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    getCallback: () => js.Function0[Unit],
    getQueryMethod: () => js.Function0[Unit],
    getSearchResultClass: () => String,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    query: (String, js.Function0[Unit], js.Function0[Unit]) => js.Array[_],
    queryMethod: () => Unit,
    removeHooks: String => Unit,
    searchResultClass: String,
    setCallback: js.Function0[Unit] => Unit,
    setQueryMethod: js.Function0[Unit] => Unit,
    setSearchResultClass: String => Unit
  ): Search = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), callback = js.Any.fromFunction0(callback), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, getCallback = js.Any.fromFunction0(getCallback), getQueryMethod = js.Any.fromFunction0(getQueryMethod), getSearchResultClass = js.Any.fromFunction0(getSearchResultClass), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, query = js.Any.fromFunction3(query), queryMethod = js.Any.fromFunction0(queryMethod), removeHooks = js.Any.fromFunction1(removeHooks), searchResultClass = searchResultClass, setCallback = js.Any.fromFunction1(setCallback), setQueryMethod = js.Any.fromFunction1(setQueryMethod), setSearchResultClass = js.Any.fromFunction1(setSearchResultClass))
  
    __obj.asInstanceOf[Search]
  }
}

