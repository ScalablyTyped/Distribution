package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenColumns extends Base {
  
  def getHiddenColumns(): js.Array[Double] = js.native
  
  def hideColumn(column: Double): Unit = js.native
  
  def hideColumns(columns: js.Array[Double]): Unit = js.native
  
  def isHidden(column: Double): Boolean = js.native
  
  def isValidConfig(hiddenColumns: js.Array[Double]): Boolean = js.native
  
  def showColumn(column: Double): Unit = js.native
  
  def showColumns(columns: js.Array[Double]): Unit = js.native
}
object HiddenColumns {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    getHiddenColumns: () => js.Array[Double],
    hideColumn: Double => Unit,
    hideColumns: js.Array[Double] => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isHidden: Double => Boolean,
    isPluginsReady: Boolean,
    isValidConfig: js.Array[Double] => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    showColumn: Double => Unit,
    showColumns: js.Array[Double] => Unit,
    updatePlugin: () => Unit
  ): HiddenColumns = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], getHiddenColumns = js.Any.fromFunction0(getHiddenColumns), hideColumn = js.Any.fromFunction1(hideColumn), hideColumns = js.Any.fromFunction1(hideColumns), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isHidden = js.Any.fromFunction1(isHidden), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], isValidConfig = js.Any.fromFunction1(isValidConfig), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), showColumn = js.Any.fromFunction1(showColumn), showColumns = js.Any.fromFunction1(showColumns), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[HiddenColumns]
  }
  
  @scala.inline
  implicit class HiddenColumnsOps[Self <: HiddenColumns] (val x: Self) extends AnyVal {
    
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
    def setGetHiddenColumns(value: () => js.Array[Double]): Self = this.set("getHiddenColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideColumn(value: Double => Unit): Self = this.set("hideColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideColumns(value: js.Array[Double] => Unit): Self = this.set("hideColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHidden(value: Double => Boolean): Self = this.set("isHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidConfig(value: js.Array[Double] => Boolean): Self = this.set("isValidConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowColumn(value: Double => Unit): Self = this.set("showColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowColumns(value: js.Array[Double] => Unit): Self = this.set("showColumns", js.Any.fromFunction1(value))
  }
}
