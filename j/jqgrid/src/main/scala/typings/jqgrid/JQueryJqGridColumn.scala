package typings.jqgrid

import typings.jqgrid.anon.ColModel
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://www.trirand.com/jqgridwiki/doku.php?id=wiki:colmodel_options
trait JQueryJqGridColumn extends StObject {
  
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
    js.Function5[/* rowId */ Any, /* val */ Any, /* rowObject */ Any, /* cm */ Any, /* rdata */ Any, String]
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
    integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ Any, /* options */ ColModel, /* rowObject */ Any, Any])
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
  
  inline def apply(name: String): JQueryJqGridColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryJqGridColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryJqGridColumn] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCellattr(
      value: (/* rowId */ Any, /* val */ Any, /* rowObject */ Any, /* cm */ Any, /* rdata */ Any) => String
    ): Self = StObject.set(x, "cellattr", js.Any.fromFunction5(value))
    
    inline def setCellattrUndefined: Self = StObject.set(x, "cellattr", js.undefined)
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDatefmt(value: String): Self = StObject.set(x, "datefmt", value.asInstanceOf[js.Any])
    
    inline def setDatefmtUndefined: Self = StObject.set(x, "datefmt", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFormatter(
      value: integer | number | currency | date | email | link | showlink | checkbox | select | actions | (js.Function3[/* cellvalue */ Any, /* options */ ColModel, /* rowObject */ Any, Any])
    ): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterFunction3(value: (/* cellvalue */ Any, /* options */ ColModel, /* rowObject */ Any) => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
