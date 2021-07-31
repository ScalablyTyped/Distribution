package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.PivotDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorOptions extends StObject {
  
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.undefined
  
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var messages: js.UndefOr[PivotConfiguratorMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var sortable: js.UndefOr[Boolean | PivotConfiguratorSortable] = js.undefined
}
object PivotConfiguratorOptions {
  
  @scala.inline
  def apply(): PivotConfiguratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorOptions]
  }
  
  @scala.inline
  implicit class PivotConfiguratorOptionsMutableBuilder[Self <: PivotConfiguratorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any | PivotDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMessages(value: PivotConfiguratorMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | PivotConfiguratorSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
