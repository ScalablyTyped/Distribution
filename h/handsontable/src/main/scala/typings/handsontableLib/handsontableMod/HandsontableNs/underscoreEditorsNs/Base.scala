package typings
package handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var TD: stdLib.HTMLTableCellElement = js.native
  var cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties = js.native
  var col: scala.Double = js.native
  var instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var originalValue: js.Any = js.native
  var prop: java.lang.String | scala.Double = js.native
  var row: scala.Double = js.native
  var state: EditorState = js.native
  def beginEditing(): scala.Unit = js.native
  def beginEditing(initialValue: js.Any): scala.Unit = js.native
  def beginEditing(initialValue: js.Any, event: stdLib.Event): scala.Unit = js.native
  def cancelChanges(): scala.Unit = js.native
  def checkEditorSection(): handsontableLib.handsontableLibStrings.`top-left-corner` | handsontableLib.handsontableLibStrings.top | handsontableLib.handsontableLibStrings.`bottom-left-corner` | handsontableLib.handsontableLibStrings.bottom | handsontableLib.handsontableLibStrings.left | handsontableLib.handsontableLibStrings.Empty = js.native
  def close(): scala.Unit = js.native
  def discardEditor(): scala.Unit = js.native
  def discardEditor(validationResult: scala.Boolean): scala.Unit = js.native
  def enableFullEditMode(): scala.Unit = js.native
  def extend[T /* <: Base */](): T = js.native
  def finishEditing(): scala.Unit = js.native
  def finishEditing(restoreOriginalValue: scala.Boolean): scala.Unit = js.native
  def finishEditing(restoreOriginalValue: scala.Boolean, ctrlDown: scala.Boolean): scala.Unit = js.native
  def finishEditing(restoreOriginalValue: scala.Boolean, ctrlDown: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getValue(): js.Any = js.native
  def init(): scala.Unit = js.native
  def isInFullEditMode(): scala.Boolean = js.native
  def isOpened(): scala.Boolean = js.native
  def isWaiting(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def open(event: stdLib.Event): scala.Unit = js.native
  def prepare(
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    TD: stdLib.HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def prepare(
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    TD: stdLib.HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def saveValue(): scala.Unit = js.native
  def saveValue(`val`: js.Any): scala.Unit = js.native
  def saveValue(`val`: js.Any, ctrlDown: scala.Boolean): scala.Unit = js.native
  def setValue(): scala.Unit = js.native
  def setValue(newValue: js.Any): scala.Unit = js.native
}

