package typings.juiGrid

import typings.juiGrid.juiGridStrings.asc
import typings.juiGrid.juiGridStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colshow extends StObject {
    
    /**
      * @cfg {Boolean/Array} [colshow=false]
      * Sets a column index shown when the Show/Hide Column menu is enabled.
      */
    var colshow: js.UndefOr[Boolean | js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Array} [csv=null]
      * Sets the column key shown when converted to a CSV string.
      */
    var csv: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Array} [csvNames=null]
      * Sets the name of a column shown when converting to a CSV string, which must be defined in the same order as the CSV option.
      */
    var csvNames: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Array} [csvNumber=null]
      * Sets the column key to be changed to a number form when converted to a CSV string.
      */
    var csvNumber: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Array} data
      * Sets the initial row list of a table.
      */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Boolean} [editEvent=true]
      * Sets the Show/Hide state of an extended row area when doubleclicking on a row/cell.
      */
    var editEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Boolean|Array} [editRow=false]
      * Determines whether to use a modified row area.
      */
    var editRow: js.UndefOr[Boolean | js.Array[Any]] = js.undefined
    
    var event: js.UndefOr[Any] = js.undefined
    
    /**
      * @cfg {Boolean} [expand=false]
      * Determines whether to use an extended row area.
      */
    var expand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Boolean} [expandEvent=true]
      * Sets the Show/Hide state of an extended row area when clicking on a row.
      */
    var expandEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Array} [fields=null]
      * Sets the name of columns in the order of being displayed on the table screen.
      */
    var fields: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Boolean} [moveRow=false]
      * Determines whether to use the move function when you fire row draggable event.
      */
    var moveRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Boolean} [resize=false]
      * Determines whether to use the column resizing function.
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Boolean} [scroll=false]
      * Determines whether to use a table scroll.
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Integer} [scrollHeight=200]
      * Sets the reference height of a body area when using a table scroll.
      */
    var scrollHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * @cfg {Boolean/Array} [sort=false]
      * Determines whether to use the table sort function.
      */
    var sort: js.UndefOr[Boolean | js.Array[Any]] = js.undefined
    
    /**
      * @cfg {Boolean} [sortEvent=true]
      * Determines whether to use the sort function when you click on a column.
      */
    var sortEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @cfg {Integer} [sortIndex=null]
      * Determines whether to use the table sort function.
      */
    var sortIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * @cfg {String} [sortOrder="asc"]
      * Determines whether to use the table sort function.
      */
    var sortOrder: js.UndefOr[asc | desc] = js.undefined
    
    var tpl: js.UndefOr[Any] = js.undefined
    
    /**
      * @cfg {Integer} [width=0]
      * Sets the area of a table.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Colshow {
    
    inline def apply(): Colshow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colshow]
    }
    
    extension [Self <: Colshow](x: Self) {
      
      inline def setColshow(value: Boolean | js.Array[Any]): Self = StObject.set(x, "colshow", value.asInstanceOf[js.Any])
      
      inline def setColshowUndefined: Self = StObject.set(x, "colshow", js.undefined)
      
      inline def setColshowVarargs(value: Any*): Self = StObject.set(x, "colshow", js.Array(value*))
      
      inline def setCsv(value: js.Array[Any]): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvNames(value: js.Array[Any]): Self = StObject.set(x, "csvNames", value.asInstanceOf[js.Any])
      
      inline def setCsvNamesUndefined: Self = StObject.set(x, "csvNames", js.undefined)
      
      inline def setCsvNamesVarargs(value: Any*): Self = StObject.set(x, "csvNames", js.Array(value*))
      
      inline def setCsvNumber(value: js.Array[Any]): Self = StObject.set(x, "csvNumber", value.asInstanceOf[js.Any])
      
      inline def setCsvNumberUndefined: Self = StObject.set(x, "csvNumber", js.undefined)
      
      inline def setCsvNumberVarargs(value: Any*): Self = StObject.set(x, "csvNumber", js.Array(value*))
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
      
      inline def setCsvVarargs(value: Any*): Self = StObject.set(x, "csv", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEditEvent(value: Boolean): Self = StObject.set(x, "editEvent", value.asInstanceOf[js.Any])
      
      inline def setEditEventUndefined: Self = StObject.set(x, "editEvent", js.undefined)
      
      inline def setEditRow(value: Boolean | js.Array[Any]): Self = StObject.set(x, "editRow", value.asInstanceOf[js.Any])
      
      inline def setEditRowUndefined: Self = StObject.set(x, "editRow", js.undefined)
      
      inline def setEditRowVarargs(value: Any*): Self = StObject.set(x, "editRow", js.Array(value*))
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandEvent(value: Boolean): Self = StObject.set(x, "expandEvent", value.asInstanceOf[js.Any])
      
      inline def setExpandEventUndefined: Self = StObject.set(x, "expandEvent", js.undefined)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFields(value: js.Array[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: Any*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMoveRow(value: Boolean): Self = StObject.set(x, "moveRow", value.asInstanceOf[js.Any])
      
      inline def setMoveRowUndefined: Self = StObject.set(x, "moveRow", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSort(value: Boolean | js.Array[Any]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortEvent(value: Boolean): Self = StObject.set(x, "sortEvent", value.asInstanceOf[js.Any])
      
      inline def setSortEventUndefined: Self = StObject.set(x, "sortEvent", js.undefined)
      
      inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
      
      inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
      
      inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: Any*): Self = StObject.set(x, "sort", js.Array(value*))
      
      inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
