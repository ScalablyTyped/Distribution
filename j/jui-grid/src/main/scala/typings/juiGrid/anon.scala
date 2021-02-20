package typings.juiGrid

import typings.juiGrid.juiGridStrings.asc
import typings.juiGrid.juiGridStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Colshow extends StObject {
    
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
    implicit class ColshowMutableBuilder[Self <: Colshow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColshow(value: Boolean | js.Array[_]): Self = StObject.set(x, "colshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColshowUndefined: Self = StObject.set(x, "colshow", js.undefined)
      
      @scala.inline
      def setColshowVarargs(value: js.Any*): Self = StObject.set(x, "colshow", js.Array(value :_*))
      
      @scala.inline
      def setCsv(value: js.Array[_]): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvNames(value: js.Array[_]): Self = StObject.set(x, "csvNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvNamesUndefined: Self = StObject.set(x, "csvNames", js.undefined)
      
      @scala.inline
      def setCsvNamesVarargs(value: js.Any*): Self = StObject.set(x, "csvNames", js.Array(value :_*))
      
      @scala.inline
      def setCsvNumber(value: js.Array[_]): Self = StObject.set(x, "csvNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvNumberUndefined: Self = StObject.set(x, "csvNumber", js.undefined)
      
      @scala.inline
      def setCsvNumberVarargs(value: js.Any*): Self = StObject.set(x, "csvNumber", js.Array(value :_*))
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
      
      @scala.inline
      def setCsvVarargs(value: js.Any*): Self = StObject.set(x, "csv", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEditEvent(value: Boolean): Self = StObject.set(x, "editEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditEventUndefined: Self = StObject.set(x, "editEvent", js.undefined)
      
      @scala.inline
      def setEditRow(value: Boolean | js.Array[_]): Self = StObject.set(x, "editRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditRowUndefined: Self = StObject.set(x, "editRow", js.undefined)
      
      @scala.inline
      def setEditRowVarargs(value: js.Any*): Self = StObject.set(x, "editRow", js.Array(value :_*))
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandEvent(value: Boolean): Self = StObject.set(x, "expandEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandEventUndefined: Self = StObject.set(x, "expandEvent", js.undefined)
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setFields(value: js.Array[_]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setMoveRow(value: Boolean): Self = StObject.set(x, "moveRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveRowUndefined: Self = StObject.set(x, "moveRow", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean | js.Array[_]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortEvent(value: Boolean): Self = StObject.set(x, "sortEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortEventUndefined: Self = StObject.set(x, "sortEvent", js.undefined)
      
      @scala.inline
      def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
      
      @scala.inline
      def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: js.Any*): Self = StObject.set(x, "sort", js.Array(value :_*))
      
      @scala.inline
      def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
