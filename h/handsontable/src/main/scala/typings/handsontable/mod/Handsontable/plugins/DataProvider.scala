package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider extends js.Object {
  
  var changes: js.Object = js.native
  
  def clearChanges(): Unit = js.native
  
  def collectChanges(row: Double, column: Double, value: js.Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getDataAtCell(row: Double, column: Double): js.Any = js.native
  
  def getDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  
  def getRawDataAtCell(row: Double, column: Double): js.Any = js.native
  
  def getRawDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  
  def getSourceDataAtCell(row: Double, column: Double): js.Any = js.native
  
  def getSourceDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_] = js.native
  
  var hot: Core = js.native
  
  def isInDataRange(row: Double, column: Double): Boolean = js.native
  
  def updateSourceData(row: Double, column: Double, value: js.Any): Unit = js.native
}
object DataProvider {
  
  @scala.inline
  def apply(
    changes: js.Object,
    clearChanges: () => Unit,
    collectChanges: (Double, Double, js.Any) => Unit,
    destroy: () => Unit,
    getDataAtCell: (Double, Double) => js.Any,
    getDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getRawDataAtCell: (Double, Double) => js.Any,
    getRawDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getSourceDataAtCell: (Double, Double) => js.Any,
    getSourceDataByRange: (Double, Double, Double, Double) => js.Array[_],
    hot: Core,
    isInDataRange: (Double, Double) => Boolean,
    updateSourceData: (Double, Double, js.Any) => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], clearChanges = js.Any.fromFunction0(clearChanges), collectChanges = js.Any.fromFunction3(collectChanges), destroy = js.Any.fromFunction0(destroy), getDataAtCell = js.Any.fromFunction2(getDataAtCell), getDataByRange = js.Any.fromFunction4(getDataByRange), getRawDataAtCell = js.Any.fromFunction2(getRawDataAtCell), getRawDataByRange = js.Any.fromFunction4(getRawDataByRange), getSourceDataAtCell = js.Any.fromFunction2(getSourceDataAtCell), getSourceDataByRange = js.Any.fromFunction4(getSourceDataByRange), hot = hot.asInstanceOf[js.Any], isInDataRange = js.Any.fromFunction2(isInDataRange), updateSourceData = js.Any.fromFunction3(updateSourceData))
    __obj.asInstanceOf[DataProvider]
  }
  
  @scala.inline
  implicit class DataProviderOps[Self <: DataProvider] (val x: Self) extends AnyVal {
    
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
    def setChanges(value: js.Object): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearChanges(value: () => Unit): Self = this.set("clearChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollectChanges(value: (Double, Double, js.Any) => Unit): Self = this.set("collectChanges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataAtCell(value: (Double, Double) => js.Any): Self = this.set("getDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = this.set("getDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetRawDataAtCell(value: (Double, Double) => js.Any): Self = this.set("getRawDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRawDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = this.set("getRawDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetSourceDataAtCell(value: (Double, Double) => js.Any): Self = this.set("getSourceDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSourceDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = this.set("getSourceDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInDataRange(value: (Double, Double) => Boolean): Self = this.set("isInDataRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSourceData(value: (Double, Double, js.Any) => Unit): Self = this.set("updateSourceData", js.Any.fromFunction3(value))
  }
}
