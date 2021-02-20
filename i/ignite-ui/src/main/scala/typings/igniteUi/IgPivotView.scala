package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotView
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Configuration settings that will be assigned to the igPivotDataSelector widget.
    *
    */
  var dataSelectorOptions: js.UndefOr[IgPivotViewDataSelectorOptions] = js.native
  
  /**
    * Configuration settings for the panel containing the igPivotDataSelector.
    *
    */
  var dataSelectorPanel: js.UndefOr[IgPivotViewDataSelectorPanel] = js.native
  
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotViewDataSourceOptions] = js.native
  
  /**
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number.
    * "null" will stretch vertically to fit the parent, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Configuration settings that will be assigned to the igPivotGrid widget.
    *
    */
  var pivotGridOptions: js.UndefOr[IgPivotViewPivotGridOptions] = js.native
  
  /**
    * Configuration settings for the panel containing the igPivotGrid.
    *
    */
  var pivotGridPanel: js.UndefOr[IgPivotViewPivotGridPanel] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "number" The widget width can be set as a number.
    * "null" will stretch to fit the parent, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgPivotView {
  
  @scala.inline
  def apply(): IgPivotView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotView]
  }
  
  @scala.inline
  implicit class IgPivotViewMutableBuilder[Self <: IgPivotView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSelectorOptions(value: IgPivotViewDataSelectorOptions): Self = StObject.set(x, "dataSelectorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSelectorOptionsUndefined: Self = StObject.set(x, "dataSelectorOptions", js.undefined)
    
    @scala.inline
    def setDataSelectorPanel(value: IgPivotViewDataSelectorPanel): Self = StObject.set(x, "dataSelectorPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSelectorPanelUndefined: Self = StObject.set(x, "dataSelectorPanel", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceOptions(value: IgPivotViewDataSourceOptions): Self = StObject.set(x, "dataSourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceOptionsUndefined: Self = StObject.set(x, "dataSourceOptions", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPivotGridOptions(value: IgPivotViewPivotGridOptions): Self = StObject.set(x, "pivotGridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotGridOptionsUndefined: Self = StObject.set(x, "pivotGridOptions", js.undefined)
    
    @scala.inline
    def setPivotGridPanel(value: IgPivotViewPivotGridPanel): Self = StObject.set(x, "pivotGridPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotGridPanelUndefined: Self = StObject.set(x, "pivotGridPanel", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
