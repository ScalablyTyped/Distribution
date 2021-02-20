package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableNumbers.`1`
import typings.handsontable.mod.Handsontable.columnSorting.Config
import typings.handsontable.mod.Handsontable.columnSorting.SortOrderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiColumnSorting {
  
  @js.native
  trait Settings extends StObject {
    
    var compareFunctionFactory: js.UndefOr[
        js.Function2[
          /* sortOrder */ SortOrderType, 
          /* columnMeta */ GridSettings, 
          js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
        ]
      ] = js.native
    
    var headerAction: js.UndefOr[Boolean] = js.native
    
    var indicator: js.UndefOr[Boolean] = js.native
    
    var initialConfig: js.UndefOr[Config | js.Array[Config]] = js.native
    
    var sortEmptyCells: js.UndefOr[Boolean] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompareFunctionFactory(
        value: (/* sortOrder */ SortOrderType, /* columnMeta */ GridSettings) => js.Function2[/* value */ _, /* nextValue */ _, `-1` | `0` | `1`]
      ): Self = StObject.set(x, "compareFunctionFactory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareFunctionFactoryUndefined: Self = StObject.set(x, "compareFunctionFactory", js.undefined)
      
      @scala.inline
      def setHeaderAction(value: Boolean): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
      
      @scala.inline
      def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setInitialConfig(value: Config | js.Array[Config]): Self = StObject.set(x, "initialConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialConfigUndefined: Self = StObject.set(x, "initialConfig", js.undefined)
      
      @scala.inline
      def setInitialConfigVarargs(value: Config*): Self = StObject.set(x, "initialConfig", js.Array(value :_*))
      
      @scala.inline
      def setSortEmptyCells(value: Boolean): Self = StObject.set(x, "sortEmptyCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortEmptyCellsUndefined: Self = StObject.set(x, "sortEmptyCells", js.undefined)
    }
  }
}
