package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnFilterable extends StObject {
  
  var cell: js.UndefOr[GridColumnFilterableCell] = js.native
  
  var checkAll: js.UndefOr[Boolean] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var extra: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var itemTemplate: js.UndefOr[js.Function] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var operators: js.UndefOr[js.Any] = js.native
  
  var search: js.UndefOr[Boolean] = js.native
  
  var ui: js.UndefOr[String | js.Function] = js.native
}
object GridColumnFilterable {
  
  @scala.inline
  def apply(): GridColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterable]
  }
  
  @scala.inline
  implicit class GridColumnFilterableMutableBuilder[Self <: GridColumnFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: GridColumnFilterableCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setCheckAll(value: Boolean): Self = StObject.set(x, "checkAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckAllUndefined: Self = StObject.set(x, "checkAll", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: js.Function): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setOperators(value: js.Any): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
