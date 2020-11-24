package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimRows extends Base {
  
  def getTrimmedRows(): js.Array[Double] = js.native
  
  def isTrimmed(row: Double): Boolean = js.native
  
  var removedRows: js.Array[_] = js.native
  
  def trimRow(row: Double): Unit = js.native
  
  def trimRows(rows: js.Array[Double]): Unit = js.native
  
  var trimmedRows: js.Array[_] = js.native
  
  def untrimAll(): Unit = js.native
  
  def untrimRow(row: Double): Unit = js.native
  
  def untrimRows(rows: js.Array[Double]): Unit = js.native
}
object TrimRows {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    getTrimmedRows: () => js.Array[Double],
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    isTrimmed: Double => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedRows: js.Array[_],
    trimRow: Double => Unit,
    trimRows: js.Array[Double] => Unit,
    trimmedRows: js.Array[_],
    untrimAll: () => Unit,
    untrimRow: Double => Unit,
    untrimRows: js.Array[Double] => Unit,
    updatePlugin: () => Unit
  ): TrimRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], getTrimmedRows = js.Any.fromFunction0(getTrimmedRows), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], isTrimmed = js.Any.fromFunction1(isTrimmed), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedRows = removedRows.asInstanceOf[js.Any], trimRow = js.Any.fromFunction1(trimRow), trimRows = js.Any.fromFunction1(trimRows), trimmedRows = trimmedRows.asInstanceOf[js.Any], untrimAll = js.Any.fromFunction0(untrimAll), untrimRow = js.Any.fromFunction1(untrimRow), untrimRows = js.Any.fromFunction1(untrimRows), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[TrimRows]
  }
  
  @scala.inline
  implicit class TrimRowsOps[Self <: TrimRows] (val x: Self) extends AnyVal {
    
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
    def setGetTrimmedRows(value: () => js.Array[Double]): Self = this.set("getTrimmedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTrimmed(value: Double => Boolean): Self = this.set("isTrimmed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovedRowsVarargs(value: js.Any*): Self = this.set("removedRows", js.Array(value :_*))
    
    @scala.inline
    def setRemovedRows(value: js.Array[_]): Self = this.set("removedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimRow(value: Double => Unit): Self = this.set("trimRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrimRows(value: js.Array[Double] => Unit): Self = this.set("trimRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrimmedRowsVarargs(value: js.Any*): Self = this.set("trimmedRows", js.Array(value :_*))
    
    @scala.inline
    def setTrimmedRows(value: js.Array[_]): Self = this.set("trimmedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntrimAll(value: () => Unit): Self = this.set("untrimAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUntrimRow(value: Double => Unit): Self = this.set("untrimRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUntrimRows(value: js.Array[Double] => Unit): Self = this.set("untrimRows", js.Any.fromFunction1(value))
  }
}
