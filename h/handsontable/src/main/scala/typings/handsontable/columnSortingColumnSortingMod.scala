package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableNumbers.`1`
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.handsontable.settingsMod.GridSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnSortingColumnSortingMod {
  
  @JSImport("handsontable/plugins/columnSorting/columnSorting", "ColumnSorting")
  @js.native
  open class ColumnSorting protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def clearSort(): Unit = js.native
    
    def getSortConfig(): Config | js.Array[Config] = js.native
    def getSortConfig(column: Double): Config | js.Array[Config] = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isSorted(): Boolean = js.native
    
    def setSortConfig(): Unit = js.native
    def setSortConfig(sortConfig: js.Array[Config]): Unit = js.native
    def setSortConfig(sortConfig: Config): Unit = js.native
    
    def sort(sortConfig: js.Array[Config]): Unit = js.native
    def sort(sortConfig: Config): Unit = js.native
  }
  
  trait Config extends StObject {
    
    var column: Double
    
    var sortOrder: SortOrderType
  }
  object Config {
    
    inline def apply(column: Double, sortOrder: SortOrderType): Config = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetailedSettings extends StObject {
    
    var compareFunctionFactory: js.UndefOr[
        js.Function2[
          /* sortOrder */ SortOrderType, 
          /* columnMeta */ GridSettings, 
          js.Function2[/* value */ Any, /* nextValue */ Any, `-1` | `0` | `1`]
        ]
      ] = js.undefined
    
    var headerAction: js.UndefOr[Boolean] = js.undefined
    
    var indicator: js.UndefOr[Boolean] = js.undefined
    
    var initialConfig: js.UndefOr[Config | js.Array[Config]] = js.undefined
    
    var sortEmptyCells: js.UndefOr[Boolean] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCompareFunctionFactory(
        value: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => js.Function2[/* value */ Any, /* nextValue */ Any, `-1` | `0` | `1`]
      ): Self = StObject.set(x, "compareFunctionFactory", js.Any.fromFunction2(value))
      
      inline def setCompareFunctionFactoryUndefined: Self = StObject.set(x, "compareFunctionFactory", js.undefined)
      
      inline def setHeaderAction(value: Boolean): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
      
      inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
      
      inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setInitialConfig(value: Config | js.Array[Config]): Self = StObject.set(x, "initialConfig", value.asInstanceOf[js.Any])
      
      inline def setInitialConfigUndefined: Self = StObject.set(x, "initialConfig", js.undefined)
      
      inline def setInitialConfigVarargs(value: Config*): Self = StObject.set(x, "initialConfig", js.Array(value*))
      
      inline def setSortEmptyCells(value: Boolean): Self = StObject.set(x, "sortEmptyCells", value.asInstanceOf[js.Any])
      
      inline def setSortEmptyCellsUndefined: Self = StObject.set(x, "sortEmptyCells", js.undefined)
    }
  }
  
  type Settings = Boolean | DetailedSettings
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.asc
    - typings.handsontable.handsontableStrings.desc
  */
  trait SortOrderType extends StObject
  object SortOrderType {
    
    inline def asc: typings.handsontable.handsontableStrings.asc = "asc".asInstanceOf[typings.handsontable.handsontableStrings.asc]
    
    inline def desc: typings.handsontable.handsontableStrings.desc = "desc".asInstanceOf[typings.handsontable.handsontableStrings.desc]
  }
}
