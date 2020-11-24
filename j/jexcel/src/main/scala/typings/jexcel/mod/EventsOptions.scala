package typings.jexcel.mod

import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsOptions extends js.Object {
  
  /** After all changes are applied in the table. */
  // tslint:disable-next-line ban-types
  var onafterchanges: js.UndefOr[js.Function] = js.native
  
  /** Before a column value is changed. NOTE: It is possible to overwrite the original value, by return a new value on this method. v3.4.0+ */
  // tslint:disable-next-line ban-types
  var onbeforechange: js.UndefOr[js.Function] = js.native
  
  /** Before a column is excluded. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeletecolumn: js.UndefOr[js.Function] = js.native
  
  /** Before a row is deleted. You can cancel the delete event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeleterow: js.UndefOr[js.Function] = js.native
  
  /** Before a new column is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertcolumn: js.UndefOr[js.Function] = js.native
  
  /** Before a new row is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertrow: js.UndefOr[js.Function] = js.native
  
  /** Before the paste action is performed. Used to parse any input data, should return the data. */
  // tslint:disable-next-line ban-types
  var onbeforepaste: js.UndefOr[js.Function] = js.native
  
  /** On table blur */
  // tslint:disable-next-line ban-types
  var onblur: js.UndefOr[js.Function] = js.native
  
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
  ] = js.native
  
  /** On header change */
  // tslint:disable-next-line ban-types
  var onchangeheader: js.UndefOr[js.Function] = js.native
  
  /** When a setMeta is called. */
  // tslint:disable-next-line ban-types
  var onchangemeta: js.UndefOr[js.Function] = js.native
  
  /** When the page is changed. */
  // tslint:disable-next-line ban-types
  var onchangepage: js.UndefOr[js.Function] = js.native
  
  /** When a setStyle is called. */
  // tslint:disable-next-line ban-types
  var onchangestyle: js.UndefOr[js.Function] = js.native
  
  /** After a column is excluded. */
  // tslint:disable-next-line ban-types
  var ondeletecolumn: js.UndefOr[js.Function] = js.native
  
  /** After a row is excluded. */
  // tslint:disable-next-line ban-types
  var ondeleterow: js.UndefOr[js.Function] = js.native
  
  /** When a closeEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionend: js.UndefOr[js.Function] = js.native
  
  /** When a openEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionstart: js.UndefOr[js.Function] = js.native
  
  /** On table focus */
  // tslint:disable-next-line ban-types
  var onfocus: js.UndefOr[js.Function] = js.native
  
  /** After a new column is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertcolumn: js.UndefOr[js.Function] = js.native
  
  /** After a new row is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertrow: js.UndefOr[js.Function] = js.native
  
  /** This method is called when the method setData */
  // tslint:disable-next-line ban-types
  var onload: js.UndefOr[js.Function] = js.native
  
  /** On column merge */
  // tslint:disable-next-line ban-types
  var onmerge: js.UndefOr[js.Function] = js.native
  
  /** After a column is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmovecolumn: js.UndefOr[js.Function] = js.native
  
  /** After a row is moved to a new position. */
  // tslint:disable-next-line ban-types
  var onmoverow: js.UndefOr[js.Function] = js.native
  
  /** After a paste action is performed in the javascript table. */
  // tslint:disable-next-line ban-types
  var onpaste: js.UndefOr[js.Function] = js.native
  
  /** On redo is applied */
  // tslint:disable-next-line ban-types
  var onredo: js.UndefOr[js.Function] = js.native
  
  /** After a change in column width. */
  // tslint:disable-next-line ban-types
  var onresizecolumn: js.UndefOr[js.Function] = js.native
  
  /** After a change in row height. */
  // tslint:disable-next-line ban-types
  var onresizerow: js.UndefOr[js.Function] = js.native
  
  /** On the selection is changed. */
  // tslint:disable-next-line ban-types
  var onselection: js.UndefOr[js.Function] = js.native
  
  /** After a colum is sorted. */
  // tslint:disable-next-line ban-types
  var onsort: js.UndefOr[js.Function] = js.native
  
  /** On undo is applied */
  // tslint:disable-next-line ban-types
  var onundo: js.UndefOr[js.Function] = js.native
}
object EventsOptions {
  
  @scala.inline
  def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  
  @scala.inline
  implicit class EventsOptionsOps[Self <: EventsOptions] (val x: Self) extends AnyVal {
    
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
    def setOnafterchanges(value: js.Function): Self = this.set("onafterchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnafterchanges: Self = this.set("onafterchanges", js.undefined)
    
    @scala.inline
    def setOnbeforechange(value: js.Function): Self = this.set("onbeforechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforechange: Self = this.set("onbeforechange", js.undefined)
    
    @scala.inline
    def setOnbeforedeletecolumn(value: js.Function): Self = this.set("onbeforedeletecolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforedeletecolumn: Self = this.set("onbeforedeletecolumn", js.undefined)
    
    @scala.inline
    def setOnbeforedeleterow(value: js.Function): Self = this.set("onbeforedeleterow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforedeleterow: Self = this.set("onbeforedeleterow", js.undefined)
    
    @scala.inline
    def setOnbeforeinsertcolumn(value: js.Function): Self = this.set("onbeforeinsertcolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforeinsertcolumn: Self = this.set("onbeforeinsertcolumn", js.undefined)
    
    @scala.inline
    def setOnbeforeinsertrow(value: js.Function): Self = this.set("onbeforeinsertrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforeinsertrow: Self = this.set("onbeforeinsertrow", js.undefined)
    
    @scala.inline
    def setOnbeforepaste(value: js.Function): Self = this.set("onbeforepaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforepaste: Self = this.set("onbeforepaste", js.undefined)
    
    @scala.inline
    def setOnblur(value: js.Function): Self = this.set("onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    
    @scala.inline
    def setOnchange(
      value: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit
    ): Self = this.set("onchange", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    
    @scala.inline
    def setOnchangeheader(value: js.Function): Self = this.set("onchangeheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchangeheader: Self = this.set("onchangeheader", js.undefined)
    
    @scala.inline
    def setOnchangemeta(value: js.Function): Self = this.set("onchangemeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchangemeta: Self = this.set("onchangemeta", js.undefined)
    
    @scala.inline
    def setOnchangepage(value: js.Function): Self = this.set("onchangepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchangepage: Self = this.set("onchangepage", js.undefined)
    
    @scala.inline
    def setOnchangestyle(value: js.Function): Self = this.set("onchangestyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchangestyle: Self = this.set("onchangestyle", js.undefined)
    
    @scala.inline
    def setOndeletecolumn(value: js.Function): Self = this.set("ondeletecolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndeletecolumn: Self = this.set("ondeletecolumn", js.undefined)
    
    @scala.inline
    def setOndeleterow(value: js.Function): Self = this.set("ondeleterow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndeleterow: Self = this.set("ondeleterow", js.undefined)
    
    @scala.inline
    def setOneditionend(value: js.Function): Self = this.set("oneditionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditionend: Self = this.set("oneditionend", js.undefined)
    
    @scala.inline
    def setOneditionstart(value: js.Function): Self = this.set("oneditionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditionstart: Self = this.set("oneditionstart", js.undefined)
    
    @scala.inline
    def setOnfocus(value: js.Function): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    
    @scala.inline
    def setOninsertcolumn(value: js.Function): Self = this.set("oninsertcolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninsertcolumn: Self = this.set("oninsertcolumn", js.undefined)
    
    @scala.inline
    def setOninsertrow(value: js.Function): Self = this.set("oninsertrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninsertrow: Self = this.set("oninsertrow", js.undefined)
    
    @scala.inline
    def setOnload(value: js.Function): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnmerge(value: js.Function): Self = this.set("onmerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmerge: Self = this.set("onmerge", js.undefined)
    
    @scala.inline
    def setOnmovecolumn(value: js.Function): Self = this.set("onmovecolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmovecolumn: Self = this.set("onmovecolumn", js.undefined)
    
    @scala.inline
    def setOnmoverow(value: js.Function): Self = this.set("onmoverow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmoverow: Self = this.set("onmoverow", js.undefined)
    
    @scala.inline
    def setOnpaste(value: js.Function): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    
    @scala.inline
    def setOnredo(value: js.Function): Self = this.set("onredo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnredo: Self = this.set("onredo", js.undefined)
    
    @scala.inline
    def setOnresizecolumn(value: js.Function): Self = this.set("onresizecolumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresizecolumn: Self = this.set("onresizecolumn", js.undefined)
    
    @scala.inline
    def setOnresizerow(value: js.Function): Self = this.set("onresizerow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresizerow: Self = this.set("onresizerow", js.undefined)
    
    @scala.inline
    def setOnselection(value: js.Function): Self = this.set("onselection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselection: Self = this.set("onselection", js.undefined)
    
    @scala.inline
    def setOnsort(value: js.Function): Self = this.set("onsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsort: Self = this.set("onsort", js.undefined)
    
    @scala.inline
    def setOnundo(value: js.Function): Self = this.set("onundo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnundo: Self = this.set("onundo", js.undefined)
  }
}
