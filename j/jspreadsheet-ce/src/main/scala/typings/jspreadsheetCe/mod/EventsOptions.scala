package typings.jspreadsheetCe.mod

import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsOptions extends StObject {
  
  /** After all changes are applied in the table. */
  var onafterchanges: js.UndefOr[
    js.Function2[/* instance */ HTMLElement, /* cellChanges */ js.Array[CellChange], Unit]
  ] = js.undefined
  
  /** Before a column value is changed. NOTE: It is possible to overwrite the original value, by return a new value on this method. v3.4.0+ */
  var onbeforechange: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      /* value */ CellValue, 
      CellValue | Unit
    ]
  ] = js.undefined
  
  /** Before a column is excluded. You can cancel the insert event by returning false. */
  var onbeforedeletecolumn: js.UndefOr[
    js.Function3[/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, Unit]
  ] = js.undefined
  
  /** Before a row is deleted. You can cancel the delete event by returning false. */
  var onbeforedeleterow: js.UndefOr[
    js.Function3[/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, Unit]
  ] = js.undefined
  
  /** Before a new column is inserted. You can cancel the insert event by returning false. */
  var onbeforeinsertcolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* isBefore */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  /** Before a new row is inserted. You can cancel the insert event by returning false. */
  var onbeforeinsertrow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* isBefore */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  /** Before the paste action is performed. Used to parse any input data, should return the data. */
  // tslint:disable-next-line ban-types
  var onbeforepaste: js.UndefOr[js.Function] = js.undefined
  
  /** On table blur */
  var onblur: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** After a column value is changed. */
  var onchange: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      /* value */ CellValue, 
      Unit
    ]
  ] = js.undefined
  
  /** On header change */
  // tslint:disable-next-line ban-types
  var onchangeheader: js.UndefOr[js.Function] = js.undefined
  
  /** When a setMeta is called. */
  // tslint:disable-next-line ban-types
  var onchangemeta: js.UndefOr[js.Function] = js.undefined
  
  /** When the page is changed. */
  // tslint:disable-next-line ban-types
  var onchangepage: js.UndefOr[js.Function] = js.undefined
  
  /** When a setStyle is called. */
  // tslint:disable-next-line ban-types
  var onchangestyle: js.UndefOr[js.Function] = js.undefined
  
  /** After a column is excluded. */
  var ondeletecolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** After a row is excluded. */
  var ondeleterow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startRowIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** When a closeEditor is called. */
  var oneditionend: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      /* value */ CellValue, 
      Unit
    ]
  ] = js.undefined
  
  /** When a openEditor is called. */
  var oneditionstart: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* cell */ HTMLTableCellElement, 
      /* columnIndex */ String, 
      /* rowIndex */ String, 
      Unit
    ]
  ] = js.undefined
  
  /** On table focus */
  var onfocus: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** After a new column is inserted. */
  var oninsertcolumn: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** After a new row is inserted. */
  var oninsertrow: js.UndefOr[
    js.Function4[
      /* instance */ HTMLElement, 
      /* startRowIndex */ Double, 
      /* count */ Double, 
      /* cells */ js.Array[js.Array[HTMLTableCellElement]], 
      Unit
    ]
  ] = js.undefined
  
  /** This method is called when the method setData */
  var onload: js.UndefOr[js.Function1[/* instance */ HTMLElement, Unit]] = js.undefined
  
  /** On column merge */
  // tslint:disable-next-line ban-types
  var onmerge: js.UndefOr[js.Function] = js.undefined
  
  /** After a column is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmovecolumn: js.UndefOr[js.Function] = js.undefined
  
  /** After a row is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmoverow: js.UndefOr[js.Function] = js.undefined
  
  /** After a paste action is performed in the javascript table. */
  var onpaste: js.UndefOr[
    js.Function2[/* instance */ HTMLElement, /* data */ js.Array[js.Array[CellValue]], Unit]
  ] = js.undefined
  
  /** On redo is applied */
  // tslint:disable-next-line ban-types
  var onredo: js.UndefOr[js.Function] = js.undefined
  
  /** After a change in column width. */
  // tslint:disable-next-line ban-types
  var onresizecolumn: js.UndefOr[js.Function] = js.undefined
  
  /** After a change in row height. */
  // tslint:disable-next-line ban-types
  var onresizerow: js.UndefOr[js.Function] = js.undefined
  
  /** On the selection is changed. */
  var onselection: js.UndefOr[
    js.Function5[
      /* instance */ HTMLElement, 
      /* startColumnIndex */ Double, 
      /* startRowIndex */ Double, 
      /* endColumnIndex */ Double, 
      /* endRowIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  
  /** After a colum is sorted. */
  // tslint:disable-next-line ban-types
  var onsort: js.UndefOr[js.Function] = js.undefined
  
  /** On undo is applied */
  // tslint:disable-next-line ban-types
  var onundo: js.UndefOr[js.Function] = js.undefined
}
object EventsOptions {
  
  inline def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  
  extension [Self <: EventsOptions](x: Self) {
    
    inline def setOnafterchanges(value: (/* instance */ HTMLElement, /* cellChanges */ js.Array[CellChange]) => Unit): Self = StObject.set(x, "onafterchanges", js.Any.fromFunction2(value))
    
    inline def setOnafterchangesUndefined: Self = StObject.set(x, "onafterchanges", js.undefined)
    
    inline def setOnbeforechange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ Double, /* rowIndex */ Double, /* value */ CellValue) => CellValue | Unit
    ): Self = StObject.set(x, "onbeforechange", js.Any.fromFunction5(value))
    
    inline def setOnbeforechangeUndefined: Self = StObject.set(x, "onbeforechange", js.undefined)
    
    inline def setOnbeforedeletecolumn(value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double) => Unit): Self = StObject.set(x, "onbeforedeletecolumn", js.Any.fromFunction3(value))
    
    inline def setOnbeforedeletecolumnUndefined: Self = StObject.set(x, "onbeforedeletecolumn", js.undefined)
    
    inline def setOnbeforedeleterow(value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double) => Unit): Self = StObject.set(x, "onbeforedeleterow", js.Any.fromFunction3(value))
    
    inline def setOnbeforedeleterowUndefined: Self = StObject.set(x, "onbeforedeleterow", js.undefined)
    
    inline def setOnbeforeinsertcolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* isBefore */ Boolean) => Unit
    ): Self = StObject.set(x, "onbeforeinsertcolumn", js.Any.fromFunction4(value))
    
    inline def setOnbeforeinsertcolumnUndefined: Self = StObject.set(x, "onbeforeinsertcolumn", js.undefined)
    
    inline def setOnbeforeinsertrow(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* isBefore */ Boolean) => Unit
    ): Self = StObject.set(x, "onbeforeinsertrow", js.Any.fromFunction4(value))
    
    inline def setOnbeforeinsertrowUndefined: Self = StObject.set(x, "onbeforeinsertrow", js.undefined)
    
    inline def setOnbeforepaste(value: js.Function): Self = StObject.set(x, "onbeforepaste", value.asInstanceOf[js.Any])
    
    inline def setOnbeforepasteUndefined: Self = StObject.set(x, "onbeforepaste", js.undefined)
    
    inline def setOnblur(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onblur", js.Any.fromFunction1(value))
    
    inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    inline def setOnchange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = StObject.set(x, "onchange", js.Any.fromFunction5(value))
    
    inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    inline def setOnchangeheader(value: js.Function): Self = StObject.set(x, "onchangeheader", value.asInstanceOf[js.Any])
    
    inline def setOnchangeheaderUndefined: Self = StObject.set(x, "onchangeheader", js.undefined)
    
    inline def setOnchangemeta(value: js.Function): Self = StObject.set(x, "onchangemeta", value.asInstanceOf[js.Any])
    
    inline def setOnchangemetaUndefined: Self = StObject.set(x, "onchangemeta", js.undefined)
    
    inline def setOnchangepage(value: js.Function): Self = StObject.set(x, "onchangepage", value.asInstanceOf[js.Any])
    
    inline def setOnchangepageUndefined: Self = StObject.set(x, "onchangepage", js.undefined)
    
    inline def setOnchangestyle(value: js.Function): Self = StObject.set(x, "onchangestyle", value.asInstanceOf[js.Any])
    
    inline def setOnchangestyleUndefined: Self = StObject.set(x, "onchangestyle", js.undefined)
    
    inline def setOndeletecolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "ondeletecolumn", js.Any.fromFunction4(value))
    
    inline def setOndeletecolumnUndefined: Self = StObject.set(x, "ondeletecolumn", js.undefined)
    
    inline def setOndeleterow(
      value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "ondeleterow", js.Any.fromFunction4(value))
    
    inline def setOndeleterowUndefined: Self = StObject.set(x, "ondeleterow", js.undefined)
    
    inline def setOneditionend(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = StObject.set(x, "oneditionend", js.Any.fromFunction5(value))
    
    inline def setOneditionendUndefined: Self = StObject.set(x, "oneditionend", js.undefined)
    
    inline def setOneditionstart(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String) => Unit
    ): Self = StObject.set(x, "oneditionstart", js.Any.fromFunction4(value))
    
    inline def setOneditionstartUndefined: Self = StObject.set(x, "oneditionstart", js.undefined)
    
    inline def setOnfocus(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onfocus", js.Any.fromFunction1(value))
    
    inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    inline def setOninsertcolumn(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "oninsertcolumn", js.Any.fromFunction4(value))
    
    inline def setOninsertcolumnUndefined: Self = StObject.set(x, "oninsertcolumn", js.undefined)
    
    inline def setOninsertrow(
      value: (/* instance */ HTMLElement, /* startRowIndex */ Double, /* count */ Double, /* cells */ js.Array[js.Array[HTMLTableCellElement]]) => Unit
    ): Self = StObject.set(x, "oninsertrow", js.Any.fromFunction4(value))
    
    inline def setOninsertrowUndefined: Self = StObject.set(x, "oninsertrow", js.undefined)
    
    inline def setOnload(value: /* instance */ HTMLElement => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnmerge(value: js.Function): Self = StObject.set(x, "onmerge", value.asInstanceOf[js.Any])
    
    inline def setOnmergeUndefined: Self = StObject.set(x, "onmerge", js.undefined)
    
    inline def setOnmovecolumn(value: js.Function): Self = StObject.set(x, "onmovecolumn", value.asInstanceOf[js.Any])
    
    inline def setOnmovecolumnUndefined: Self = StObject.set(x, "onmovecolumn", js.undefined)
    
    inline def setOnmoverow(value: js.Function): Self = StObject.set(x, "onmoverow", value.asInstanceOf[js.Any])
    
    inline def setOnmoverowUndefined: Self = StObject.set(x, "onmoverow", js.undefined)
    
    inline def setOnpaste(value: (/* instance */ HTMLElement, /* data */ js.Array[js.Array[CellValue]]) => Unit): Self = StObject.set(x, "onpaste", js.Any.fromFunction2(value))
    
    inline def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
    
    inline def setOnredo(value: js.Function): Self = StObject.set(x, "onredo", value.asInstanceOf[js.Any])
    
    inline def setOnredoUndefined: Self = StObject.set(x, "onredo", js.undefined)
    
    inline def setOnresizecolumn(value: js.Function): Self = StObject.set(x, "onresizecolumn", value.asInstanceOf[js.Any])
    
    inline def setOnresizecolumnUndefined: Self = StObject.set(x, "onresizecolumn", js.undefined)
    
    inline def setOnresizerow(value: js.Function): Self = StObject.set(x, "onresizerow", value.asInstanceOf[js.Any])
    
    inline def setOnresizerowUndefined: Self = StObject.set(x, "onresizerow", js.undefined)
    
    inline def setOnselection(
      value: (/* instance */ HTMLElement, /* startColumnIndex */ Double, /* startRowIndex */ Double, /* endColumnIndex */ Double, /* endRowIndex */ Double) => Unit
    ): Self = StObject.set(x, "onselection", js.Any.fromFunction5(value))
    
    inline def setOnselectionUndefined: Self = StObject.set(x, "onselection", js.undefined)
    
    inline def setOnsort(value: js.Function): Self = StObject.set(x, "onsort", value.asInstanceOf[js.Any])
    
    inline def setOnsortUndefined: Self = StObject.set(x, "onsort", js.undefined)
    
    inline def setOnundo(value: js.Function): Self = StObject.set(x, "onundo", value.asInstanceOf[js.Any])
    
    inline def setOnundoUndefined: Self = StObject.set(x, "onundo", js.undefined)
  }
}
