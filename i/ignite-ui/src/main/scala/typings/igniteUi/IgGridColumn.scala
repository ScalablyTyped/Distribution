package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridColumn
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the colSpan of the cell in a Multi-Row Layout configuration. colSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  /**
    * Space-separated list of CSS classes to be applied on the data cells of this column. The class is not applied if the column has a column [template](ui.iggrid#options:columns.template) defined, which contains full <td> definition in the template.
    *
    */
  var columnCssClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies the column index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
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
  var dataType: js.UndefOr[String] = js.undefined
  /**
    * Determines the way in which dates will be displayed in the grid for this column.
    *
    *
    * Valid values:
    * "local" The dates for this column will be rendered in the client's local timezone.
    * "utc" The dates for this column will be rendered in their UTC representation.
    */
  var dateDisplayType: js.UndefOr[String] = js.undefined
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
  var format: js.UndefOr[String] = js.undefined
  /**
    * Reference to a function (string or function) which will be used for formatting the cell values. The function should accept a value and return the new formatted value. [Here column formatting is explained in details](http://www.igniteui.com/help/iggrid-columns-and-layout#column-formatting)
    *
    *
    * Valid values:
    * "string" The name of the function which will be used for formatting the cell values.
    * "function" Function which will be used for formatting the cell values. The function should accept a value and return the new formatted value.
    */
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  /**
    * A reference to or the name of a JavaScript function, which will calculate the value of the current cell based on other cell values in the same row. Used with [unbound columns](ui.iggrid#options:columns.unbound).
    *
    *
    * Valid values:
    * "string" The name of the JavaScript function.
    * "function" Reference to the JavaScript function.
    */
  var formula: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Array of child column definitions. If the column has the property group than the grid has multi column headers.
    *
    */
  var group: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Options used to configure collapsible column [groups](ui.iggrid#options:columns.group).
    *
    */
  var groupOptions: js.UndefOr[IgGridColumnGroupOptions] = js.undefined
  /**
    * Space-separated list of CSS classes to be applied on the header cell of this column.
    *
    */
  var headerCssClass: js.UndefOr[String] = js.undefined
  /**
    * Header text for the specified column. HTML and special characters should not be included as part of the header text content, because the browsers can interpret it and break the grid UI.
    *
    */
  var headerText: js.UndefOr[String] = js.undefined
  /**
    * Initial visibility of the column. A column can be hidden without the Hiding feature being enabled but there will be no UI for unhiding it. Columns can be defined as hidden in the options of the Hiding feature as well and those definitions take precedence.
    *
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The property in the data source to which the column is bound. Also used to identify the column by, and find specific columns with API methods such as [columnByKey](ui.iggrid#methods:columnByKey).
    *
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * This option is applicable only for columns with [dataType](ui.iggrid#options:columns.dataType) of object. Reference to a function, or the name of the function, that will be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this column and will be displayed as cell value. [Here you can find more examples of how to setup a column mapper](http://www.igniteui.com/help/iggrid-columns-and-layout#defining-mapper)
    *
    *
    * Valid values:
    * "string" The name of the mapper function.
    * "function" Reference to the mapper function.
    */
  var mapper: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Specifies the navigation index of the cell for the TAB sequence when the cells are in edit mode in a Multi-Row Layout grid. Has no effect otherwise. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var navigationIndex: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the row index of the cell in a Multi-Row Layout configuration. All columns must have this property set for the multi-row-layout mode to be enabled. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout)
    *
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the rowSpan of the cell in a Multi-Row Layout configuration. rowSpan 0 is not supported and will be changed to 1 by the grid. [Here you can find more about the Multi-Row Layout feature](http://www.igniteui.com/help/iggrid-multirowlayout). If multi-row-layout is not used but multi-column-header is set then this option is used to adjust span of header cell.
    *
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
  /**
    * This option has been deprecated as of the June 2016 service release.
    * Adjust span of multi column header cell. Use option rowSpan.
    */
  var rowspan: js.UndefOr[Double] = js.undefined
  /**
    * Sets a template for an individual column. the contents of the template should be the HTML markup that goes inside the table cell, or the entire table cell markup. [Here's an example of creating a basic column template](http://www.igniteui.com/help/creating-a-basic-column-template-in-the-iggrid)
    *
    */
  var template: js.UndefOr[String] = js.undefined
  /**
    * Sets whether column data is derived from the datasource. If set to true, then the cells in this column are not bound to the data source. The data in this column is populated using [formula](ui.iggrid#options:columns.formula), or using [unboundValues](ui.iggrid#options:columns.unboundValues), or through the [setUnboundValues](ui.iggrid#methods:setUnboundValues) API method. [Here's an overview of the unbound columns feature](http://www.igniteui.com/help/iggrid-unboundcolumns-overview)
    *
    */
  var unbound: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of values which will be populated in the column cells at initialization, if the column is [unbound](ui.iggrid#options:columns.unbound).
    *
    */
  var unboundValues: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Width of the column in pixels or percentage. Can also be set as '*', in which case the width auto-size based on the content of the column cells (including the header text).If width is not defined and [defaultColumnWidth](ui.iggrid#options:defaultColumnWidth) is set, it is assumed for all columns.
    *
    *
    * Valid values:
    * "string" The column width can be set in pixels (px), percentage (%) or as '*' in order to auto-size based on the cells and header content.
    * "number" The column width can be set as a number
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgGridColumn {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    columnCssClass: String = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    dataType: String = null,
    dateDisplayType: String = null,
    format: String = null,
    formatter: String | js.Function = null,
    formula: String | js.Function = null,
    group: js.Array[_] = null,
    groupOptions: IgGridColumnGroupOptions = null,
    headerCssClass: String = null,
    headerText: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    mapper: String | js.Function = null,
    navigationIndex: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowSpan: js.UndefOr[Double] = js.undefined,
    rowspan: js.UndefOr[Double] = js.undefined,
    template: String = null,
    unbound: js.UndefOr[Boolean] = js.undefined,
    unboundValues: js.Array[_] = null,
    width: String | Double = null
  ): IgGridColumn = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (columnCssClass != null) __obj.updateDynamic("columnCssClass")(columnCssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (dateDisplayType != null) __obj.updateDynamic("dateDisplayType")(dateDisplayType.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupOptions != null) __obj.updateDynamic("groupOptions")(groupOptions.asInstanceOf[js.Any])
    if (headerCssClass != null) __obj.updateDynamic("headerCssClass")(headerCssClass.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mapper != null) __obj.updateDynamic("mapper")(mapper.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationIndex)) __obj.updateDynamic("navigationIndex")(navigationIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowspan)) __obj.updateDynamic("rowspan")(rowspan.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(unbound)) __obj.updateDynamic("unbound")(unbound.get.asInstanceOf[js.Any])
    if (unboundValues != null) __obj.updateDynamic("unboundValues")(unboundValues.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridColumn]
  }
}

