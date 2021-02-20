package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumn
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the colSpan of the cell in a Multi-Row Layout configuration. colSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var colSpan: js.UndefOr[Double] = js.native
  
  /**
    * Space-separated list of CSS classes to be applied on the data cells of this column. The class is not applied if the column has a column [template](ui.iggrid#options:columns.template) defined, which contains full <td> definition in the template.
    *
    */
  var columnCssClass: js.UndefOr[String] = js.native
  
  /**
    * Specifies the column index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Data type of the column cell values: string, number, bool, date, time, object.
    *
    *
    * Valid values:
    * "string" Used when the data for the column is of type string
    * "number" Used when the data for the column is of type number
    * "boolean" Used when the data for the column is of type boolean
    * "date" Used when the data for the column is of type date
    * "time" Used when the data for the column is of type date and but only the time portion is important
    * "object" Used when the data for the column is of type object
    */
  var dataType: js.UndefOr[String] = js.native
  
  /**
    * Determines the way in which dates will be displayed in the grid for this column.
    *
    *
    * Valid values:
    * "local" The dates for this column will be rendered in the client's local timezone.
    * "utc" The dates for this column will be rendered in their UTC representation.
    */
  var dateDisplayType: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the type of formatting for cells of the column. Default value is null. Checkout [Formatting Dates, Numbers and Strings](http://www.igniteui.com/help/formatting-dates-numbers-and-strings) for details on the valid formatting specifiers.
    *
    * If dataType is "date", then supported formats are following: "date", "dateLong", "dateTime", "time", "timeLong", "MM/dd/yyyy", "MMM-d, yy, h:mm:ss tt", "dddd d MMM", etc.
    * If dataType is "time", then supported formats are following: "date", "dateLong", "dateTime", "time", "timeLong", "MMM-d, yy, h:mm:ss tt", etc.
    * If dataType is "number", then supported numeric formats are following: "number", "currency", "percent", "int", "double", "0.00", "#.0####", "0", "#.#######", etc.
    * The value of "double" will be similar to "number", but with unlimited maximum number of decimal places.
    * The format patterns and rules for numbers and dates are defined in $.ig.regional.defaults object.
    * If dataType is "string" or not set, then format is rendered as it is with replacement of possible "{0}" flag by value in cell. Example, if format is set to "Name: {0}" and value in cell is "Bob", then value will appear as "Name: Bob"
    * If value is set to "checkbox", then checkboxes are used regardless of renderCheckboxes option of the grid. That has effect only when dataType option of column is set to "bool".
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Reference to a function (string or function) which will be used for formatting the cell values. The function should accept a value and return the new formatted value. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
    *
    *
    * Valid values:
    * "string" The name of the function which will be used for formatting the cell values.
    * "function" Function which will be used for formatting the cell values. The function should accept a value and return the new formatted value.
    */
  var formatter: js.UndefOr[String | js.Function] = js.native
  
  /**
    * A reference to or the name of a JavaScript function, which will calculate the value of the current cell based on other cell values in the same row. Used with [unbound columns](ui.iggrid#options:columns.unbound).
    *
    *
    * Valid values:
    * "string" The name of the JavaScript function.
    * "function" Reference to the JavaScript function.
    */
  var formula: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Array of child column definitions. If the column has the property group than the grid has multi column headers.
    *
    */
  var group: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Options used to configure collapsible column [groups](ui.iggrid#options:columns.group).
    *
    */
  var groupOptions: js.UndefOr[IgGridColumnGroupOptions] = js.native
  
  /**
    * Space-separated list of CSS classes to be applied on the header cell of this column.
    *
    */
  var headerCssClass: js.UndefOr[String] = js.native
  
  /**
    * Header text for the specified column. HTML and special characters should not be included as part of the header text content, because the browsers can interpret it and break the grid UI.
    *
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * Initial visibility of the column. A column can be hidden without the Hiding feature being enabled but there will be no UI for unhiding it. Columns can be defined as hidden in the options of the Hiding feature as well and those definitions take precedence.
    *
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * The property in the data source to which the column is bound. Also used to identify the column by, and find specific columns with API methods such as [columnByKey](ui.iggrid#methods:columnByKey).
    *
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * This option is applicable only for columns with [dataType](ui.iggrid#options:columns.dataType) of object. Reference to a function, or the name of the function, that will be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this column and will be displayed as cell value. [Here you can find more examples of how to setup a column mapper](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-mapper)
    *
    *
    * Valid values:
    * "string" The name of the mapper function.
    * "function" Reference to the mapper function.
    */
  var mapper: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Specifies the navigation index of the cell for the TAB sequence when the cells are in edit mode in a Multi-Row Layout grid. Has no effect otherwise. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var navigationIndex: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the row index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the rowSpan of the cell in a Multi-Row Layout configuration. rowSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout). If multi-row-layout is not used but multi-column-header is set then this option is used to adjust span of header cell.
    *
    */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /**
    * This option has been deprecated as of the June 2016 service release.
    * Adjust span of multi column header cell. Use option rowSpan.
    */
  var rowspan: js.UndefOr[Double] = js.native
  
  /**
    * Sets a template for an individual column. the contents of the template should be the HTML markup that goes inside the table cell, or the entire table cell markup. [Here's an example of creating a basic column template](http://www.igniteui.com/help/creating-a-basic-column-template-in-the-iggrid)
    *
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * Sets whether column data is derived from the datasource. If set to true, then the cells in this column are not bound to the data source. The data in this column is populated using [formula](ui.iggrid#options:columns.formula), or using [unboundValues](ui.iggrid#options:columns.unboundValues), or through the [setUnboundValues](ui.iggrid#methods:setUnboundValues) API method. [Here's an overview of the unbound columns feature](http://www.igniteui.com/help/iggrid-unboundcolumns-overview)
    *
    */
  var unbound: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of values which will be populated in the column cells at initialization, if the column is [unbound](ui.iggrid#options:columns.unbound).
    *
    */
  var unboundValues: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Width of the column in pixels or percentage. Can also be set as '*', in which case the width auto-size based on the content of the column cells (including the header text).If width is not defined and [defaultColumnWidth](ui.iggrid#options:defaultColumnWidth) is set, it is assumed for all columns.
    *
    *
    * Valid values:
    * "string" The column width can be set in pixels (px), percentage (%) or as '*' in order to auto-size based on the cells and header content.
    * "number" The column width can be set as a number
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgGridColumn {
  
  @scala.inline
  def apply(): IgGridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumn]
  }
  
  @scala.inline
  implicit class IgGridColumnMutableBuilder[Self <: IgGridColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setColumnCssClass(value: String): Self = StObject.set(x, "columnCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCssClassUndefined: Self = StObject.set(x, "columnCssClass", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDateDisplayType(value: String): Self = StObject.set(x, "dateDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDisplayTypeUndefined: Self = StObject.set(x, "dateDisplayType", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setFormula(value: String | js.Function): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[_]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOptions(value: IgGridColumnGroupOptions): Self = StObject.set(x, "groupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOptionsUndefined: Self = StObject.set(x, "groupOptions", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: js.Any*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setHeaderCssClass(value: String): Self = StObject.set(x, "headerCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCssClassUndefined: Self = StObject.set(x, "headerCssClass", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMapper(value: String | js.Function): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapperUndefined: Self = StObject.set(x, "mapper", js.undefined)
    
    @scala.inline
    def setNavigationIndex(value: Double): Self = StObject.set(x, "navigationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationIndexUndefined: Self = StObject.set(x, "navigationIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setUnbound(value: Boolean): Self = StObject.set(x, "unbound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundUndefined: Self = StObject.set(x, "unbound", js.undefined)
    
    @scala.inline
    def setUnboundValues(value: js.Array[_]): Self = StObject.set(x, "unboundValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundValuesUndefined: Self = StObject.set(x, "unboundValues", js.undefined)
    
    @scala.inline
    def setUnboundValuesVarargs(value: js.Any*): Self = StObject.set(x, "unboundValues", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
