package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsAutoColumnSizeAutoColumnSizeMod {
  
  @JSImport("handsontable/plugins/autoColumnSize/autoColumnSize", "AutoColumnSize")
  @js.native
  open class AutoColumnSize protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def calculateAllColumnsWidth(): Unit = js.native
    def calculateAllColumnsWidth(rowRange: js.Object): Unit = js.native
    def calculateAllColumnsWidth(rowRange: Double): Unit = js.native
    
    def calculateColumnsWidth(): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object, rowRange: Double): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object, rowRange: Double, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: js.Object, rowRange: Unit, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Double): Unit = js.native
    def calculateColumnsWidth(colRange: Double, rowRange: js.Object): Unit = js.native
    def calculateColumnsWidth(colRange: Double, rowRange: js.Object, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Double, rowRange: Double): Unit = js.native
    def calculateColumnsWidth(colRange: Double, rowRange: Double, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Double, rowRange: Unit, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Unit, rowRange: js.Object): Unit = js.native
    def calculateColumnsWidth(colRange: Unit, rowRange: js.Object, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Unit, rowRange: Double): Unit = js.native
    def calculateColumnsWidth(colRange: Unit, rowRange: Double, force: Boolean): Unit = js.native
    def calculateColumnsWidth(colRange: Unit, rowRange: Unit, force: Boolean): Unit = js.native
    
    def calculateVisibleColumnsWidth(): Unit = js.native
    
    def clearCache(): Unit = js.native
    def clearCache(columns: js.Array[Double]): Unit = js.native
    
    def getColumnWidth(column: Double): Double = js.native
    def getColumnWidth(column: Double, defaultWidth: Double): Double = js.native
    def getColumnWidth(column: Double, defaultWidth: Double, keepMinimum: Boolean): Double = js.native
    def getColumnWidth(column: Double, defaultWidth: Unit, keepMinimum: Boolean): Double = js.native
    
    def getFirstVisibleColumn(): Double = js.native
    
    def getLastVisibleColumn(): Double = js.native
    
    def getSyncCalculationLimit(): Double = js.native
    
    var inProgress: Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isNeedRecalculate(): Boolean = js.native
    
    var measuredColumns: Double = js.native
    
    def recalculateAllColumnsWidth(): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var syncLimit: js.UndefOr[String | Double] = js.undefined
    
    var useHeaders: js.UndefOr[Boolean] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setSyncLimit(value: String | Double): Self = StObject.set(x, "syncLimit", value.asInstanceOf[js.Any])
      
      inline def setSyncLimitUndefined: Self = StObject.set(x, "syncLimit", js.undefined)
      
      inline def setUseHeaders(value: Boolean): Self = StObject.set(x, "useHeaders", value.asInstanceOf[js.Any])
      
      inline def setUseHeadersUndefined: Self = StObject.set(x, "useHeaders", js.undefined)
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
