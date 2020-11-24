package typings.juiGrid.anon

import typings.juiGrid.juiGridStrings.asc
import typings.juiGrid.juiGridStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colshow extends js.Object {
  
  /**
    * @cfg {Boolean/Array} [colshow=false]
    * Sets a column index shown when the Show/Hide Column menu is enabled.
    */
  var colshow: js.UndefOr[Boolean | js.Array[_]] = js.native
  
  /**
    * @cfg {Array} [csv=null]
    * Sets the column key shown when converted to a CSV string.
    */
  var csv: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Array} [csvNames=null]
    * Sets the name of a column shown when converting to a CSV string, which must be defined in the same order as the CSV option.
    */
  var csvNames: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Array} [csvNumber=null]
    * Sets the column key to be changed to a number form when converted to a CSV string.
    */
  var csvNumber: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Array} data
    * Sets the initial row list of a table.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Boolean} [editEvent=true]
    * Sets the Show/Hide state of an extended row area when doubleclicking on a row/cell.
    */
  var editEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean|Array} [editRow=false]
    * Determines whether to use a modified row area.
    */
  var editRow: js.UndefOr[Boolean | js.Array[_]] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Boolean} [expand=false]
    * Determines whether to use an extended row area.
    */
  var expand: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [expandEvent=true]
    * Sets the Show/Hide state of an extended row area when clicking on a row.
    */
  var expandEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Array} [fields=null]
    * Sets the name of columns in the order of being displayed on the table screen.
    */
  var fields: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @cfg {Boolean} [moveRow=false]
    * Determines whether to use the move function when you fire row draggable event.
    */
  var moveRow: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [resize=false]
    * Determines whether to use the column resizing function.
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Boolean} [scroll=false]
    * Determines whether to use a table scroll.
    */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Integer} [scrollHeight=200]
    * Sets the reference height of a body area when using a table scroll.
    */
  var scrollHeight: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Boolean/Array} [sort=false]
    * Determines whether to use the table sort function.
    */
  var sort: js.UndefOr[Boolean | js.Array[_]] = js.native
  
  /**
    * @cfg {Boolean} [sortEvent=true]
    * Determines whether to use the sort function when you click on a column.
    */
  var sortEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Integer} [sortIndex=null]
    * Determines whether to use the table sort function.
    */
  var sortIndex: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {String} [sortOrder="asc"]
    * Determines whether to use the table sort function.
    */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [width=0]
    * Sets the area of a table.
    */
  var width: js.UndefOr[Double] = js.native
}
object Colshow {
  
  @scala.inline
  def apply(): Colshow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colshow]
  }
  
  @scala.inline
  implicit class ColshowOps[Self <: Colshow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColshowVarargs(value: js.Any*): Self = this.set("colshow", js.Array(value :_*))
    
    @scala.inline
    def setColshow(value: Boolean | js.Array[_]): Self = this.set("colshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColshow: Self = this.set("colshow", js.undefined)
    
    @scala.inline
    def setCsvVarargs(value: js.Any*): Self = this.set("csv", js.Array(value :_*))
    
    @scala.inline
    def setCsv(value: js.Array[_]): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    
    @scala.inline
    def setCsvNamesVarargs(value: js.Any*): Self = this.set("csvNames", js.Array(value :_*))
    
    @scala.inline
    def setCsvNames(value: js.Array[_]): Self = this.set("csvNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvNames: Self = this.set("csvNames", js.undefined)
    
    @scala.inline
    def setCsvNumberVarargs(value: js.Any*): Self = this.set("csvNumber", js.Array(value :_*))
    
    @scala.inline
    def setCsvNumber(value: js.Array[_]): Self = this.set("csvNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvNumber: Self = this.set("csvNumber", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEditEvent(value: Boolean): Self = this.set("editEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditEvent: Self = this.set("editEvent", js.undefined)
    
    @scala.inline
    def setEditRowVarargs(value: js.Any*): Self = this.set("editRow", js.Array(value :_*))
    
    @scala.inline
    def setEditRow(value: Boolean | js.Array[_]): Self = this.set("editRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditRow: Self = this.set("editRow", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpandEvent(value: Boolean): Self = this.set("expandEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandEvent: Self = this.set("expandEvent", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMoveRow(value: Boolean): Self = this.set("moveRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveRow: Self = this.set("moveRow", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: js.Any*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: Boolean | js.Array[_]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortEvent(value: Boolean): Self = this.set("sortEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortEvent: Self = this.set("sortEvent", js.undefined)
    
    @scala.inline
    def setSortIndex(value: Double): Self = this.set("sortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIndex: Self = this.set("sortIndex", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
