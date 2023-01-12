package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnFilterable extends StObject {
  
  var cell: js.UndefOr[GridColumnFilterableCell] = js.undefined
  
  var checkAll: js.UndefOr[Boolean] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var itemTemplate: js.UndefOr[js.Function] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var operators: js.UndefOr[Any] = js.undefined
  
  var search: js.UndefOr[Boolean] = js.undefined
  
  var ui: js.UndefOr[String | js.Function] = js.undefined
}
object GridColumnFilterable {
  
  inline def apply(): GridColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumnFilterable] (val x: Self) extends AnyVal {
    
    inline def setCell(value: GridColumnFilterableCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setCheckAll(value: Boolean): Self = StObject.set(x, "checkAll", value.asInstanceOf[js.Any])
    
    inline def setCheckAllUndefined: Self = StObject.set(x, "checkAll", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setItemTemplate(value: js.Function): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setOperators(value: Any): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
