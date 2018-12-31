package typings
package jqgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://www.trirand.com/jqgridwiki/doku.php?id=wiki:colmodel_options
trait JQueryJqGridColumn extends js.Object {
  /**
    * Defines the alignment of the cell in the Body layer, not in header cell. Possible values: left, center, right
    */
  var align: js.UndefOr[
    jqgridLib.jqgridLibStrings.left | jqgridLib.jqgridLibStrings.center | jqgridLib.jqgridLibStrings.right
  ] = js.undefined
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
      java.lang.String
    ]
  ] = js.undefined
  /**
    * This option allow to add classes to the column. If more than one class will be used a space should be set.
    * By example classes:'class1 class2' will set a class1 and class2 to every cell on that column.
    * In the grid css there is a predefined class ui-ellipsis which allow to attach ellipsis to a particular row.
    * Also this will work in FireFox too.
    */
  var classes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Governs format of sorttype:date (when datetype is set to local) and editrules {date:true} fields.
    * Determines the expected date format for that column. Uses a PHP-like date formatting. Currently "/", "-", and "." are supported as date separators. Valid formats are:
    *  y,Y,yyyy for four digits year
    *  YY, yy for two digits year
    *  m,mm for months
    *  d,dd for days.
    */
  var datefmt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines if the field is editable. This option is used in cell, inline and form modules.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The predefined types (string) or custom function name that controls the format of this field
    * @param cellvalue is the value to be formatted
    * @param options is an object containing the following element: rowId - is the id of the row colModel is the object of the properties for this column getted from colModel array of jqGrid
    * @param rowObject  is a row data represented in the format determined from datatype option. If we have datatype: xml/xmlstring - the rowObject is xml node,provided according to the rules from xmlReader If we have datatype: json/jsonstring - the rowObject is array, provided according to the rules from jsonReader
    * @returns {} the formatted value
    */
  var formatter: js.UndefOr[
    jqgridLib.jqgridLibStrings.integer | jqgridLib.jqgridLibStrings.number | jqgridLib.jqgridLibStrings.currency | jqgridLib.jqgridLibStrings.date | jqgridLib.jqgridLibStrings.email | jqgridLib.jqgridLibStrings.link | jqgridLib.jqgridLibStrings.showlink | jqgridLib.jqgridLibStrings.checkbox | jqgridLib.jqgridLibStrings.select | jqgridLib.jqgridLibStrings.actions | (js.Function3[/* cellvalue */ js.Any, /* options */ Anon_RowId, /* rowObject */ js.Any, _])
  ] = js.undefined
  /**
    * Defines if this column is hidden at initialization.
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the index name when sorting. Passed as sidx parameter.
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overwrite the id (defined in readers) from server. Can be set as id for the unique row id. Only one column can have this property.
    * This option have higher priority as those from the readers.
    * If there are more than one key set the grid finds the first one and the second is ignored.
    */
  var key: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When colNames array is empty, defines the heading for this column.
    * If both the colNames array and this setting are empty, the heading for this column comes from the name property.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the unique name in the grid for the column.
    * This property is required.
    * As well as other words used as property/event names, the reserved words (which cannot be used for names) include subgrid, cb and rn.
    */
  var name: java.lang.String
  /**
    * When used in search modules, disables or enables searching on that column
    */
  var search: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines is this can be sorted
    */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the initial width of the column, in pixels. This value currently can not be set as percentage
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

