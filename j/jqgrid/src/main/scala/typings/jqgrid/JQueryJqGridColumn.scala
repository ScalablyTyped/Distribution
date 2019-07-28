package typings.jqgrid

import typings.jqgrid.jqgridStrings.actions
import typings.jqgrid.jqgridStrings.center
import typings.jqgrid.jqgridStrings.checkbox
import typings.jqgrid.jqgridStrings.currency
import typings.jqgrid.jqgridStrings.date
import typings.jqgrid.jqgridStrings.email
import typings.jqgrid.jqgridStrings.integer
import typings.jqgrid.jqgridStrings.left
import typings.jqgrid.jqgridStrings.link
import typings.jqgrid.jqgridStrings.number
import typings.jqgrid.jqgridStrings.right
import typings.jqgrid.jqgridStrings.select
import typings.jqgrid.jqgridStrings.showlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://www.trirand.com/jqgridwiki/doku.php?id=wiki:colmodel_options
trait JQueryJqGridColumn extends js.Object {
  /**
    * Defines the alignment of the cell in the Body layer, not in header cell. Possible values: left, center, right
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * This function add attributes to the cell during the creation of the data - i.e dynamically.
    * By example all valid attributes for the table cell can be used or a style attribute with different properties.
    * @param rowId the id of the row
    * @param val the value which will be added in the cell
    * @param rowObject  the raw object of the data row - i.e if datatype is json - array, if datatype is xml xml node.
    * @param cm all the properties of this column listed in the colModel
    * @param rdata the data row which will be inserted in the row. This parameter is array of type name:value, where name is the name in colModel
    * @returns {} 
    */
  var cellattr: js.UndefOr[
    js.Function5[
      /* rowId */ js.Any, 
      /* val */ js.Any, 
      /* rowObject */ js.Any, 
      /* cm */ js.Any, 
      /* rdata */ js.Any, 
      String
    ]
  ] = js.undefined
  /**
    * This option allow to add classes to the column. If more than one class will be used a space should be set.
    * By example classes:'class1 class2' will set a class1 and class2 to every cell on that column.
    * In the grid css there is a predefined class ui-ellipsis which allow to attach ellipsis to a particular row.
    * Also this will work in FireFox too.
    */
  var classes: js.UndefOr[String] = js.undefined
  /**
    * Governs format of sorttype:date (when datetype is set to local) and editrules {date:true} fields.
    * Determines the expected date format for that column. Uses a PHP-like date formatting. Currently "/", "-", and "." are supported as date separators. Valid formats are:
    *  y,Y,yyyy for four digits year
    *  YY, yy for two digits year
    *  m,mm for months
    *  d,dd for days.
    */
  var datefmt: js.UndefOr[String] = js.undefined
  /**
    * Defines if the field is editable. This option is used in cell, inline and form modules.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * The predefined types (string) or custom function name that controls the format of this field
    * @param cellvalue is the value to be formatted
    * @param options is an object containing the following element: rowId - is the id of the row colModel is the object of the properties for this column getted from colModel array of jqGrid
    * @param rowObject  is a row data represented in the format determined from datatype option. If we have datatype: xml/xmlstring - the rowObject is xml node,provided according to the rules from xmlReader If we have datatype: json/jsonstring - the rowObject is array, provided according to the rules from jsonReader
    * @returns {} the formatted value
    */
  var formatter: js.UndefOr[
    integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ js.Any, /* options */ Anon_ColModel, /* rowObject */ js.Any, _])
  ] = js.undefined
  /**
    * Defines if this column is hidden at initialization.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the index name when sorting. Passed as sidx parameter.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Overwrite the id (defined in readers) from server. Can be set as id for the unique row id. Only one column can have this property.
    * This option have higher priority as those from the readers.
    * If there are more than one key set the grid finds the first one and the second is ignored.
    */
  var key: js.UndefOr[Boolean] = js.undefined
  /**
    * When colNames array is empty, defines the heading for this column.
    * If both the colNames array and this setting are empty, the heading for this column comes from the name property.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Set the unique name in the grid for the column.
    * This property is required.
    * As well as other words used as property/event names, the reserved words (which cannot be used for names) include subgrid, cb and rn.
    */
  var name: String
  /**
    * When used in search modules, disables or enables searching on that column
    */
  var search: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines is this can be sorted
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the initial width of the column, in pixels. This value currently can not be set as percentage
    */
  var width: js.UndefOr[Double] = js.undefined
}

object JQueryJqGridColumn {
  @scala.inline
  def apply(
    name: String,
    align: left | center | right = null,
    cellattr: (/* rowId */ js.Any, /* val */ js.Any, /* rowObject */ js.Any, /* cm */ js.Any, /* rdata */ js.Any) => String = null,
    classes: String = null,
    datefmt: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    formatter: integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ js.Any, /* options */ Anon_ColModel, /* rowObject */ js.Any, _]) = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    key: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    search: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): JQueryJqGridColumn = {
    val __obj = js.Dynamic.literal(name = name)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cellattr != null) __obj.updateDynamic("cellattr")(js.Any.fromFunction5(cellattr))
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (datefmt != null) __obj.updateDynamic("datefmt")(datefmt)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryJqGridColumn]
  }
}

