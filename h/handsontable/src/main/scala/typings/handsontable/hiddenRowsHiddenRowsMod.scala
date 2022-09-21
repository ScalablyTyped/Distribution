package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenRowsHiddenRowsMod {
  
  @JSImport("handsontable/plugins/hiddenRows/hiddenRows", "HiddenRows")
  @js.native
  open class HiddenRows protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def getHiddenRows(): js.Array[Double] = js.native
    
    def hideRow(row: Double*): Unit = js.native
    
    def hideRows(rows: js.Array[Double]): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isHidden(row: Double): Boolean = js.native
    
    def isValidConfig(hiddenRows: js.Array[Double]): Boolean = js.native
    
    def showRow(row: Double*): Unit = js.native
    
    def showRows(rows: js.Array[Double]): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var indicators: js.UndefOr[Boolean] = js.undefined
    
    var rows: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      inline def setRows(value: js.Array[Double]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: Double*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
