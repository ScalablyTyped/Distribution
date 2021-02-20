package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider extends StObject {
  
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
  implicit class DataProviderMutableBuilder[Self <: DataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Object): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearChanges(value: () => Unit): Self = StObject.set(x, "clearChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollectChanges(value: (Double, Double, js.Any) => Unit): Self = StObject.set(x, "collectChanges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataAtCell(value: (Double, Double) => js.Any): Self = StObject.set(x, "getDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = StObject.set(x, "getDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetRawDataAtCell(value: (Double, Double) => js.Any): Self = StObject.set(x, "getRawDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRawDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = StObject.set(x, "getRawDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetSourceDataAtCell(value: (Double, Double) => js.Any): Self = StObject.set(x, "getSourceDataAtCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSourceDataByRange(value: (Double, Double, Double, Double) => js.Array[_]): Self = StObject.set(x, "getSourceDataByRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHot(value: Core): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInDataRange(value: (Double, Double) => Boolean): Self = StObject.set(x, "isInDataRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSourceData(value: (Double, Double, js.Any) => Unit): Self = StObject.set(x, "updateSourceData", js.Any.fromFunction3(value))
  }
}
