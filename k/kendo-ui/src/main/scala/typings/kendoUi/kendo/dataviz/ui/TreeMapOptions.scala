package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMapOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var colorField: js.UndefOr[String] = js.native
  
  var colors: js.UndefOr[js.Any] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeMapDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  
  var itemCreated: js.UndefOr[js.Function1[/* e */ TreeMapItemCreatedEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var textField: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var valueField: js.UndefOr[String] = js.native
}
object TreeMapOptions {
  
  @scala.inline
  def apply(): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapOptions]
  }
  
  @scala.inline
  implicit class TreeMapOptionsMutableBuilder[Self <: TreeMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    @scala.inline
    def setColors(value: js.Any): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TreeMapDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setItemCreated(value: /* e */ TreeMapItemCreatedEvent => Unit): Self = StObject.set(x, "itemCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemCreatedUndefined: Self = StObject.set(x, "itemCreated", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTextField(value: String): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
