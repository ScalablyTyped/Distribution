package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenRows extends Base {
  
  def getHiddenRows(): js.Array[Double] = js.native
  
  def hideRow(row: Double): Unit = js.native
  
  def hideRows(rows: js.Array[Double]): Unit = js.native
  
  def isHidden(row: Double): Boolean = js.native
  
  def isValidConfig(hiddenRows: js.Array[Double]): Boolean = js.native
  
  def showRow(row: Double): Unit = js.native
  
  def showRows(rows: js.Array[Double]): Unit = js.native
}
object HiddenRows {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    getHiddenRows: () => js.Array[Double],
    hideRow: Double => Unit,
    hideRows: js.Array[Double] => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isHidden: Double => Boolean,
    isPluginsReady: Boolean,
    isValidConfig: js.Array[Double] => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    showRow: Double => Unit,
    showRows: js.Array[Double] => Unit,
    updatePlugin: () => Unit
  ): HiddenRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], getHiddenRows = js.Any.fromFunction0(getHiddenRows), hideRow = js.Any.fromFunction1(hideRow), hideRows = js.Any.fromFunction1(hideRows), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isHidden = js.Any.fromFunction1(isHidden), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], isValidConfig = js.Any.fromFunction1(isValidConfig), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), showRow = js.Any.fromFunction1(showRow), showRows = js.Any.fromFunction1(showRows), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[HiddenRows]
  }
  
  @scala.inline
  implicit class HiddenRowsMutableBuilder[Self <: HiddenRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHiddenRows(value: () => js.Array[Double]): Self = StObject.set(x, "getHiddenRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideRow(value: Double => Unit): Self = StObject.set(x, "hideRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideRows(value: js.Array[Double] => Unit): Self = StObject.set(x, "hideRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHidden(value: Double => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidConfig(value: js.Array[Double] => Boolean): Self = StObject.set(x, "isValidConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowRow(value: Double => Unit): Self = StObject.set(x, "showRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowRows(value: js.Array[Double] => Unit): Self = StObject.set(x, "showRows", js.Any.fromFunction1(value))
  }
}
