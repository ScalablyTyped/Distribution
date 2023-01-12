package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsHiddenColumnsHiddenColumnsMod {
  
  @JSImport("handsontable/plugins/hiddenColumns/hiddenColumns", "HiddenColumns")
  @js.native
  open class HiddenColumns protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def getHiddenColumns(): js.Array[Double] = js.native
    
    def hideColumn(column: Double*): Unit = js.native
    
    def hideColumns(columns: js.Array[Double]): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isHidden(column: Double): Boolean = js.native
    
    def isValidConfig(hiddenColumns: js.Array[Double]): Boolean = js.native
    
    def showColumn(column: Double*): Unit = js.native
    
    def showColumns(columns: js.Array[Double]): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var columns: js.UndefOr[js.Array[Double]] = js.undefined
    
    var indicators: js.UndefOr[Boolean] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetailedSettings] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: Double*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    }
  }
  
  type Settings = Boolean | DetailedSettings
}
