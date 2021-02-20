package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnSorting {
  
  @js.native
  trait Config extends StObject {
    
    var column: Double = js.native
    
    var sortOrder: SortOrderType = js.native
  }
  object Config {
    
    @scala.inline
    def apply(column: Double, sortOrder: SortOrderType): Config = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    var initialConfig: js.UndefOr[Config] = js.native
    
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
      def setInitialConfig(value: Config): Self = StObject.set(x, "initialConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialConfigUndefined: Self = StObject.set(x, "initialConfig", js.undefined)
      
      @scala.inline
      def setSortEmptyCells(value: Boolean): Self = StObject.set(x, "sortEmptyCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortEmptyCellsUndefined: Self = StObject.set(x, "sortEmptyCells", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.asc
    - typings.handsontable.handsontableStrings.desc
  */
  trait SortOrderType extends StObject
  object SortOrderType {
    
    @scala.inline
    def asc: typings.handsontable.handsontableStrings.asc = "asc".asInstanceOf[typings.handsontable.handsontableStrings.asc]
    
    @scala.inline
    def desc: typings.handsontable.handsontableStrings.desc = "desc".asInstanceOf[typings.handsontable.handsontableStrings.desc]
  }
}
