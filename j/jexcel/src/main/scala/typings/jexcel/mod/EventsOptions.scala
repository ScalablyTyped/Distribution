package typings.jexcel.mod

import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsOptions extends js.Object {
  /** After all changes are applied in the table. */
  // tslint:disable-next-line ban-types
  var onafterchanges: js.UndefOr[js.Function] = js.undefined
  /** Before a column value is changed. NOTE: It is possible to overwrite the original value, by return a new value on this method. v3.4.0+ */
  // tslint:disable-next-line ban-types
  var onbeforechange: js.UndefOr[js.Function] = js.undefined
  /** Before a column is excluded. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeletecolumn: js.UndefOr[js.Function] = js.undefined
  /** Before a row is deleted. You can cancel the delete event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforedeleterow: js.UndefOr[js.Function] = js.undefined
  /** Before a new column is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertcolumn: js.UndefOr[js.Function] = js.undefined
  /** Before a new row is inserted. You can cancel the insert event by returning false. */
  // tslint:disable-next-line ban-types
  var onbeforeinsertrow: js.UndefOr[js.Function] = js.undefined
  /** Before the paste action is performed. Used to parse any input data, should return the data. */
  // tslint:disable-next-line ban-types
  var onbeforepaste: js.UndefOr[js.Function] = js.undefined
  /** On table blur */
  // tslint:disable-next-line ban-types
  var onblur: js.UndefOr[js.Function] = js.undefined
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
  // tslint:disable-next-line ban-types
  var ondeletecolumn: js.UndefOr[js.Function] = js.undefined
  /** After a row is excluded. */
  // tslint:disable-next-line ban-types
  var ondeleterow: js.UndefOr[js.Function] = js.undefined
  /** When a closeEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionend: js.UndefOr[js.Function] = js.undefined
  /** When a openEditor is called. */
  // tslint:disable-next-line ban-types
  var oneditionstart: js.UndefOr[js.Function] = js.undefined
  /** On table focus */
  // tslint:disable-next-line ban-types
  var onfocus: js.UndefOr[js.Function] = js.undefined
  /** After a new column is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertcolumn: js.UndefOr[js.Function] = js.undefined
  /** After a new row is inserted. */
  // tslint:disable-next-line ban-types
  var oninsertrow: js.UndefOr[js.Function] = js.undefined
  /** This method is called when the method setData */
  // tslint:disable-next-line ban-types
  var onload: js.UndefOr[js.Function] = js.undefined
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
  // tslint:disable-next-line ban-types
  var onpaste: js.UndefOr[js.Function] = js.undefined
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
  // tslint:disable-next-line ban-types
  var onselection: js.UndefOr[js.Function] = js.undefined
  /** After a colum is sorted. */
  // tslint:disable-next-line ban-types
  var onsort: js.UndefOr[js.Function] = js.undefined
  /** On undo is applied */
  // tslint:disable-next-line ban-types
  var onundo: js.UndefOr[js.Function] = js.undefined
}

object EventsOptions {
  @scala.inline
  def apply(
    onafterchanges: js.Function = null,
    onbeforechange: js.Function = null,
    onbeforedeletecolumn: js.Function = null,
    onbeforedeleterow: js.Function = null,
    onbeforeinsertcolumn: js.Function = null,
    onbeforeinsertrow: js.Function = null,
    onbeforepaste: js.Function = null,
    onblur: js.Function = null,
    onchange: (/* instance */ HTMLElement, /* cell */ HTMLTableCellElement, /* columnIndex */ String, /* rowIndex */ String, /* value */ CellValue) => Unit = null,
    onchangeheader: js.Function = null,
    onchangemeta: js.Function = null,
    onchangepage: js.Function = null,
    onchangestyle: js.Function = null,
    ondeletecolumn: js.Function = null,
    ondeleterow: js.Function = null,
    oneditionend: js.Function = null,
    oneditionstart: js.Function = null,
    onfocus: js.Function = null,
    oninsertcolumn: js.Function = null,
    oninsertrow: js.Function = null,
    onload: js.Function = null,
    onmerge: js.Function = null,
    onmovecolumn: js.Function = null,
    onmoverow: js.Function = null,
    onpaste: js.Function = null,
    onredo: js.Function = null,
    onresizecolumn: js.Function = null,
    onresizerow: js.Function = null,
    onselection: js.Function = null,
    onsort: js.Function = null,
    onundo: js.Function = null
  ): EventsOptions = {
    val __obj = js.Dynamic.literal()
    if (onafterchanges != null) __obj.updateDynamic("onafterchanges")(onafterchanges.asInstanceOf[js.Any])
    if (onbeforechange != null) __obj.updateDynamic("onbeforechange")(onbeforechange.asInstanceOf[js.Any])
    if (onbeforedeletecolumn != null) __obj.updateDynamic("onbeforedeletecolumn")(onbeforedeletecolumn.asInstanceOf[js.Any])
    if (onbeforedeleterow != null) __obj.updateDynamic("onbeforedeleterow")(onbeforedeleterow.asInstanceOf[js.Any])
    if (onbeforeinsertcolumn != null) __obj.updateDynamic("onbeforeinsertcolumn")(onbeforeinsertcolumn.asInstanceOf[js.Any])
    if (onbeforeinsertrow != null) __obj.updateDynamic("onbeforeinsertrow")(onbeforeinsertrow.asInstanceOf[js.Any])
    if (onbeforepaste != null) __obj.updateDynamic("onbeforepaste")(onbeforepaste.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(js.Any.fromFunction5(onchange))
    if (onchangeheader != null) __obj.updateDynamic("onchangeheader")(onchangeheader.asInstanceOf[js.Any])
    if (onchangemeta != null) __obj.updateDynamic("onchangemeta")(onchangemeta.asInstanceOf[js.Any])
    if (onchangepage != null) __obj.updateDynamic("onchangepage")(onchangepage.asInstanceOf[js.Any])
    if (onchangestyle != null) __obj.updateDynamic("onchangestyle")(onchangestyle.asInstanceOf[js.Any])
    if (ondeletecolumn != null) __obj.updateDynamic("ondeletecolumn")(ondeletecolumn.asInstanceOf[js.Any])
    if (ondeleterow != null) __obj.updateDynamic("ondeleterow")(ondeleterow.asInstanceOf[js.Any])
    if (oneditionend != null) __obj.updateDynamic("oneditionend")(oneditionend.asInstanceOf[js.Any])
    if (oneditionstart != null) __obj.updateDynamic("oneditionstart")(oneditionstart.asInstanceOf[js.Any])
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (oninsertcolumn != null) __obj.updateDynamic("oninsertcolumn")(oninsertcolumn.asInstanceOf[js.Any])
    if (oninsertrow != null) __obj.updateDynamic("oninsertrow")(oninsertrow.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onmerge != null) __obj.updateDynamic("onmerge")(onmerge.asInstanceOf[js.Any])
    if (onmovecolumn != null) __obj.updateDynamic("onmovecolumn")(onmovecolumn.asInstanceOf[js.Any])
    if (onmoverow != null) __obj.updateDynamic("onmoverow")(onmoverow.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onredo != null) __obj.updateDynamic("onredo")(onredo.asInstanceOf[js.Any])
    if (onresizecolumn != null) __obj.updateDynamic("onresizecolumn")(onresizecolumn.asInstanceOf[js.Any])
    if (onresizerow != null) __obj.updateDynamic("onresizerow")(onresizerow.asInstanceOf[js.Any])
    if (onselection != null) __obj.updateDynamic("onselection")(onselection.asInstanceOf[js.Any])
    if (onsort != null) __obj.updateDynamic("onsort")(onsort.asInstanceOf[js.Any])
    if (onundo != null) __obj.updateDynamic("onundo")(onundo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsOptions]
  }
}

