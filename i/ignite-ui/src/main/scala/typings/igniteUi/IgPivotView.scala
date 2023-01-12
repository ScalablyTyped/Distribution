package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotView
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Configuration settings that will be assigned to the igPivotDataSelector widget.
    *
    */
  var dataSelectorOptions: js.UndefOr[IgPivotViewDataSelectorOptions] = js.undefined
  
  /**
    * Configuration settings for the panel containing the igPivotDataSelector.
    *
    */
  var dataSelectorPanel: js.UndefOr[IgPivotViewDataSelectorPanel] = js.undefined
  
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotViewDataSourceOptions] = js.undefined
  
  /**
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number.
    * "null" will stretch vertically to fit the parent, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Configuration settings that will be assigned to the igPivotGrid widget.
    *
    */
  var pivotGridOptions: js.UndefOr[IgPivotViewPivotGridOptions] = js.undefined
  
  /**
    * Configuration settings for the panel containing the igPivotGrid.
    *
    */
  var pivotGridPanel: js.UndefOr[IgPivotViewPivotGridPanel] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "number" The widget width can be set as a number.
    * "null" will stretch to fit the parent, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgPivotView {
  
  inline def apply(): IgPivotView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgPivotView] (val x: Self) extends AnyVal {
    
    inline def setDataSelectorOptions(value: IgPivotViewDataSelectorOptions): Self = StObject.set(x, "dataSelectorOptions", value.asInstanceOf[js.Any])
    
    inline def setDataSelectorOptionsUndefined: Self = StObject.set(x, "dataSelectorOptions", js.undefined)
    
    inline def setDataSelectorPanel(value: IgPivotViewDataSelectorPanel): Self = StObject.set(x, "dataSelectorPanel", value.asInstanceOf[js.Any])
    
    inline def setDataSelectorPanelUndefined: Self = StObject.set(x, "dataSelectorPanel", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceOptions(value: IgPivotViewDataSourceOptions): Self = StObject.set(x, "dataSourceOptions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceOptionsUndefined: Self = StObject.set(x, "dataSourceOptions", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPivotGridOptions(value: IgPivotViewPivotGridOptions): Self = StObject.set(x, "pivotGridOptions", value.asInstanceOf[js.Any])
    
    inline def setPivotGridOptionsUndefined: Self = StObject.set(x, "pivotGridOptions", js.undefined)
    
    inline def setPivotGridPanel(value: IgPivotViewPivotGridPanel): Self = StObject.set(x, "pivotGridPanel", value.asInstanceOf[js.Any])
    
    inline def setPivotGridPanelUndefined: Self = StObject.set(x, "pivotGridPanel", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
