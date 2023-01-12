package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsAutoRowSizeAutoRowSizeMod {
  
  @JSImport("handsontable/plugins/autoRowSize/autoRowSize", "AutoRowSize")
  @js.native
  open class AutoRowSize protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def calculateAllRowsHeight(): Unit = js.native
    def calculateAllRowsHeight(colRange: js.Object): Unit = js.native
    def calculateAllRowsHeight(colRange: Double): Unit = js.native
    
    def calculateRowsHeight(): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object, colRange: js.Object): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object, colRange: js.Object, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object, colRange: Double): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object, colRange: Double, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: js.Object, colRange: Unit, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Double): Unit = js.native
    def calculateRowsHeight(rowRange: Double, colRange: js.Object): Unit = js.native
    def calculateRowsHeight(rowRange: Double, colRange: js.Object, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Double, colRange: Double): Unit = js.native
    def calculateRowsHeight(rowRange: Double, colRange: Double, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Double, colRange: Unit, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Unit, colRange: js.Object): Unit = js.native
    def calculateRowsHeight(rowRange: Unit, colRange: js.Object, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Unit, colRange: Double): Unit = js.native
    def calculateRowsHeight(rowRange: Unit, colRange: Double, force: Boolean): Unit = js.native
    def calculateRowsHeight(rowRange: Unit, colRange: Unit, force: Boolean): Unit = js.native
    
    def clearCache(): Unit = js.native
    
    def clearCacheByRange(range: js.Object): Unit = js.native
    def clearCacheByRange(range: Double): Unit = js.native
    
    def getColumnHeaderHeight(): Double = js.native
    
    def getFirstVisibleRow(): Double = js.native
    
    def getLastVisibleRow(): Double = js.native
    
    def getRowHeight(row: Double): Double = js.native
    def getRowHeight(row: Double, defaultHeight: Double): Double = js.native
    
    def getSyncCalculationLimit(): Double = js.native
    
    var inProgress: Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isNeedRecalculate(): Boolean = js.native
    
    var measuredRows: Double = js.native
    
    def recalculateAllRowsHeight(): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var syncLimit: js.UndefOr[String | Double] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setSyncLimit(value: String | Double): Self = StObject.set(x, "syncLimit", value.asInstanceOf[js.Any])
      
      inline def setSyncLimitUndefined: Self = StObject.set(x, "syncLimit", js.undefined)
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
