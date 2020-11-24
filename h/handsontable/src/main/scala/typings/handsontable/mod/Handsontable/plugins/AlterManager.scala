package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlterManager extends js.Object {
  
  var dataProvider: DataProvider = js.native
  
  def destroy(): Unit = js.native
  
  var hot: Core = js.native
  
  var matrix: Matrix = js.native
  
  def prepareAlter(action: String, args: js.Any): Unit = js.native
  
  var sheet: Sheet = js.native
  
  def triggerAlter(action: String, args: js.Any): Unit = js.native
}
object AlterManager {
  
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: () => Unit,
    hot: Core,
    matrix: Matrix,
    prepareAlter: (String, js.Any) => Unit,
    sheet: Sheet,
    triggerAlter: (String, js.Any) => Unit
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hot = hot.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], prepareAlter = js.Any.fromFunction2(prepareAlter), sheet = sheet.asInstanceOf[js.Any], triggerAlter = js.Any.fromFunction2(triggerAlter))
    __obj.asInstanceOf[AlterManager]
  }
  
  @scala.inline
  implicit class AlterManagerOps[Self <: AlterManager] (val x: Self) extends AnyVal {
    
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
    def setDataProvider(value: DataProvider): Self = this.set("dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Matrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareAlter(value: (String, js.Any) => Unit): Self = this.set("prepareAlter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSheet(value: Sheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerAlter(value: (String, js.Any) => Unit): Self = this.set("triggerAlter", js.Any.fromFunction2(value))
  }
}
