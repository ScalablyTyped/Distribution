package typings.jqgrid

import typings.jqgrid.jqgridStrings.GET
import typings.jqgrid.jqgridStrings.POST
import typings.jqgrid.jqgridStrings.asc
import typings.jqgrid.jqgridStrings.auto
import typings.jqgrid.jqgridStrings.clientArray
import typings.jqgrid.jqgridStrings.clientSide
import typings.jqgrid.jqgridStrings.desc
import typings.jqgrid.jqgridStrings.javascript
import typings.jqgrid.jqgridStrings.json
import typings.jqgrid.jqgridStrings.jsonstring
import typings.jqgrid.jqgridStrings.local
import typings.jqgrid.jqgridStrings.xml
import typings.jqgrid.jqgridStrings.xmlstring
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryJqGridOptions extends StObject {
  
  /**
    * When set to true, the grid width is recalculated automatically to the width of the parent element.
    * This is done only initially when the grid is created.
    * In order to resize the grid when the parent element changes width you should apply custom code and use the setGridWidth method for this purpose
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true encodes (html encode) the incoming (from server) and posted data (from editing modules).
    */
  var autoencode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the caption for the grid. This caption appears in the caption layer, which is above the header layer
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Array which describes the parameters of the columns. This is the most important part of the grid.
    */
  var colModel: js.UndefOr[js.Array[JQueryJqGridColumn]] = js.undefined
  
  /**
    * An array in which we place the names of the columns.
    * This is the text that appears in the head of the grid (header layer). The names are separated with commas.
    * Note that the number of elements in this array should be equal of the number elements in the colModel array.
    */
  var colNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array that stores the local data passed to the grid. You can directly point to this variable in case you want to load an array data.
    * It can replace the addRowData method which is slow on relative big data
    */
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Defines in what format to expect the data that fills the grid.
    * Valid options are xml (we expect data in xml format), xmlstring (we expect xml data as string), json (we expect data in JSON format),
    * jsonstring (we expect JSON data as a string), local (we expect data defined at client side (array data)),
    * javascript (we expect javascript as data), function (custom defined function for retrieving data),
    * or clientSide to manually load data via the data array
    */
  var datatype: js.UndefOr[
    xml | xmlstring | json | jsonstring | local | javascript | js.Function | clientSide
  ] = js.undefined
  
  /**
    * If set to true, and a column's width is changed, the adjacent column (to the right) will resize so that the overall grid width is maintained
    * (e.g., reducing the width of column 2 by 30px will increase the size of column 3 by 30px). In this case there is no horizontal scrollbar.
    * Note: This option is not compatible with shrinkToFit option - i.e if shrinkToFit is set to false, forceFit is ignored.
    */
  var forceFit: js.UndefOr[Boolean] = js.undefined
  
  // events
  /**
    * This fires after all the data is loaded into the grid and all other processes are complete.
    * Also the event fires independent from the datatype parameter and after sorting paging and etc.
    * @returns {} 
    */
  var gridComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * What will be the result if we insert all the data at once?
    * Yes, this can be done with a help of gridview option (set it to true).
    * The result is a grid that is 5 to 10 times faster. Of course, when this option is set to true we have some limitations.
    * If set to true we can not use treeGrid, subGrid, or the afterInsertRow event.
    * If you do not use these three options in the grid you can set this option to true and enjoy the speed.
    */
  var gridview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The height of the grid.
    * Can be set as number (in this case we mean pixels) or as percentage (only 100% is accepted) or value of auto is acceptable.
    */
  var height: js.UndefOr[Double | String | auto] = js.undefined
  
  /**
    * An array which describes the structure of the expected json data.
    */
  var jsonReader: js.UndefOr[IJqGridJsonReader] = js.undefined
  
  /**
    * If this flag is set to true, the grid loads the data from the server only once (using the appropriate datatype).
    * After the first request, the datatype parameter is automatically changed to local and all further manipulations are done on the client side.
    * The functions of the pager (if present) are disabled.
    */
  var loadonce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the type of request to make ("POST" or "GET")
    */
  var mtype: js.UndefOr[GET | POST] = js.undefined
  
  /**
    * This option works only when the multiselect option is set to true.
    * When multiselect is set to true, clicking anywhere on a row selects that row;
    * when multiboxonly is also set to true, the multiselection is done only when the checkbox is clicked (Yahoo style).
    * Clicking in any other row (suppose the checkbox is not clicked) deselects all rows and selects the current row.
    */
  var multiboxonly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this flag is set to true a multi selection of rows is enabled. A new column at left side containing checkboxes is added.
    * Can be used with any datatype option
    */
  var multiselect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Raised immediately after row was right clicked
    * @param rowid is the id of the row
    * @param iRow is the index of the row (do not mix this with the rowid)
    * @param iCol is the index of the cell
    * @param e  is the event object
    * @returns {} 
    */
  var onRightClickRow: js.UndefOr[
    js.Function4[/* rowid */ Any, /* iRow */ Double, /* iCol */ Double, /* e */ Event, Unit]
  ] = js.undefined
  
  /**
    * Raised immediately after row was clicked.
    * @param id  is the id of the row
    * @param status is the status of the selection
    * @param e  is the event object. Can be used when multiselect is set to true. true if the row is selected, false if the row is deselected.
    * @returns {} 
    */
  var onSelectRow: js.UndefOr[js.Function3[/* id */ String, /* status */ Any, /* e */ Event, Unit]] = js.undefined
  
  /**
    * Defines that we want to use a pager bar to navigate through the records.
    * This must be a valid HTML element; in our example we gave the div the id of "pager", but any name is acceptable.
    * Note that the navigation layer (the "pager" div) can be positioned anywhere you want, determined by your HTML;
    * in our example we specified that the pager will appear after the body layer.
    * The valid settings can be (in the context of our example) pager, #pager, jQuery('#pager').
    * I recommend to use the second one - #pager
    */
  var pager: js.UndefOr[String] = js.undefined
  
  /**
    * An array to construct a select box element in the pager in which we can change the number of the visible rows.
    * When changed during the execution, this parameter replaces the rowNum parameter that is passed to the url.
    * If the array is empty, this element does not appear in the pager. Typically you can set this like [10,20,30].
    * If the rowNum parameter is set to 30 then the selected value in the select box is 30
    */
  var rowList: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Sets how many records we want to view in the grid. This parameter is passed to the url for use by the server routine retrieving the data.
    * Note that if you set this parameter to 10 (i.e. retrieve 10 records) and your server return 15 then only 10 records will be loaded
    */
  var rowNum: js.UndefOr[Double] = js.undefined
  
  /**
    * This option, if set, defines how the the width of the columns of the grid should be re-calculated, taking into consideration the width of the grid.
    * If this value is true, and the width of the columns is also set, then every column is scaled in proportion to its width.
    * For example, if we define two columns with widths 80 and 120 pixels, but want the grid to have a width of 300 pixels,
    * then the columns will stretch to fit the entire grid, and the extra width assigned to them will depend on the width of the columns themselves and the extra width available.
    * The re-calculation is done as follows: the first column gets the width (300(new width)/200(sum of all widths))*80(first column width) = 120 pixels,
    * and the second column gets the width (300(new width)/200(sum of all widths))*120(second column width) = 180 pixels.
    * Now the widths of the columns sum up to 300 pixels, which is the width of the grid.
    * If the value is false and the value in width option is set, then no re-sizing happens whatsoever.
    * So in this example, if shrinkToFit is set to false, column one will have a width of 80 pixels,
    * column two will have a width of 120 pixels and the grid will retain the width of 300 pixels.
    * If the value of shrinkToFit is an integer, the width is calculated according to it.
    */
  var shrinkToFit: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * The column according to which the data is to be sorted when it is initially loaded from the server
    * (note that you will have to use datatypes xml or json to load remote data). This parameter is appended to the url.
    * If this value is set and the index (name) matches the name from colModel,
    * then an icon indicating that the grid is sorted according to this column is added to the column header.
    * This icon also indicates the sorting order - descending or ascending (see the parameter sortorder). Also see prmNames
    */
  var sortname: js.UndefOr[String] = js.undefined
  
  /**
    * The initial sorting order (ascending or descending) when we fetch data from the server using datatypes xml or json.
    * This parameter is appended to the url - see prnNames. The two allowed values are - asc or desc.
    */
  var sortorder: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * The url of the file that returns the data needed to populate the grid. May be set to clientArray to manualy post data to server
    */
  var url: js.UndefOr[String | clientArray] = js.undefined
  
  /**
    * If true, jqGrid displays the beginning and ending record number in the grid, out of the total number of records in the query.
    * This information is shown in the pager bar (bottom right by default)in this format: "View X to Y out of Z".
    * If this value is true, there are other parameters that can be adjusted, including emptyrecords and recordtext.
    */
  var viewrecords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this option is not set, the width of the grid is the sum of the widths of the columns defined in the colModel (in pixels).
    * If this option is set, the initial width of each column is set according to the value of the shrinkToFit option.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object JQueryJqGridOptions {
  
  inline def apply(): JQueryJqGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryJqGridOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryJqGridOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setAutoencode(value: Boolean): Self = StObject.set(x, "autoencode", value.asInstanceOf[js.Any])
    
    inline def setAutoencodeUndefined: Self = StObject.set(x, "autoencode", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setColModel(value: js.Array[JQueryJqGridColumn]): Self = StObject.set(x, "colModel", value.asInstanceOf[js.Any])
    
    inline def setColModelUndefined: Self = StObject.set(x, "colModel", js.undefined)
    
    inline def setColModelVarargs(value: JQueryJqGridColumn*): Self = StObject.set(x, "colModel", js.Array(value*))
    
    inline def setColNames(value: js.Array[String]): Self = StObject.set(x, "colNames", value.asInstanceOf[js.Any])
    
    inline def setColNamesUndefined: Self = StObject.set(x, "colNames", js.undefined)
    
    inline def setColNamesVarargs(value: String*): Self = StObject.set(x, "colNames", js.Array(value*))
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDatatype(value: xml | xmlstring | json | jsonstring | local | javascript | js.Function | clientSide): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    inline def setGridComplete(value: () => Unit): Self = StObject.set(x, "gridComplete", js.Any.fromFunction0(value))
    
    inline def setGridCompleteUndefined: Self = StObject.set(x, "gridComplete", js.undefined)
    
    inline def setGridview(value: Boolean): Self = StObject.set(x, "gridview", value.asInstanceOf[js.Any])
    
    inline def setGridviewUndefined: Self = StObject.set(x, "gridview", js.undefined)
    
    inline def setHeight(value: Double | String | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJsonReader(value: IJqGridJsonReader): Self = StObject.set(x, "jsonReader", value.asInstanceOf[js.Any])
    
    inline def setJsonReaderUndefined: Self = StObject.set(x, "jsonReader", js.undefined)
    
    inline def setLoadonce(value: Boolean): Self = StObject.set(x, "loadonce", value.asInstanceOf[js.Any])
    
    inline def setLoadonceUndefined: Self = StObject.set(x, "loadonce", js.undefined)
    
    inline def setMtype(value: GET | POST): Self = StObject.set(x, "mtype", value.asInstanceOf[js.Any])
    
    inline def setMtypeUndefined: Self = StObject.set(x, "mtype", js.undefined)
    
    inline def setMultiboxonly(value: Boolean): Self = StObject.set(x, "multiboxonly", value.asInstanceOf[js.Any])
    
    inline def setMultiboxonlyUndefined: Self = StObject.set(x, "multiboxonly", js.undefined)
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setOnRightClickRow(value: (/* rowid */ Any, /* iRow */ Double, /* iCol */ Double, /* e */ Event) => Unit): Self = StObject.set(x, "onRightClickRow", js.Any.fromFunction4(value))
    
    inline def setOnRightClickRowUndefined: Self = StObject.set(x, "onRightClickRow", js.undefined)
    
    inline def setOnSelectRow(value: (/* id */ String, /* status */ Any, /* e */ Event) => Unit): Self = StObject.set(x, "onSelectRow", js.Any.fromFunction3(value))
    
    inline def setOnSelectRowUndefined: Self = StObject.set(x, "onSelectRow", js.undefined)
    
    inline def setPager(value: String): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setRowList(value: js.Array[Double]): Self = StObject.set(x, "rowList", value.asInstanceOf[js.Any])
    
    inline def setRowListUndefined: Self = StObject.set(x, "rowList", js.undefined)
    
    inline def setRowListVarargs(value: Double*): Self = StObject.set(x, "rowList", js.Array(value*))
    
    inline def setRowNum(value: Double): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
    
    inline def setRowNumUndefined: Self = StObject.set(x, "rowNum", js.undefined)
    
    inline def setShrinkToFit(value: Boolean | Double): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    inline def setSortname(value: String): Self = StObject.set(x, "sortname", value.asInstanceOf[js.Any])
    
    inline def setSortnameUndefined: Self = StObject.set(x, "sortname", js.undefined)
    
    inline def setSortorder(value: asc | desc): Self = StObject.set(x, "sortorder", value.asInstanceOf[js.Any])
    
    inline def setSortorderUndefined: Self = StObject.set(x, "sortorder", js.undefined)
    
    inline def setUrl(value: String | clientArray): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setViewrecords(value: Boolean): Self = StObject.set(x, "viewrecords", value.asInstanceOf[js.Any])
    
    inline def setViewrecordsUndefined: Self = StObject.set(x, "viewrecords", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
