package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.Change
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.Filter
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.InsertCol
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.InsertRow
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.RemoveCol
  import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction.RemoveRow

  type CellReference = BaseCell
  type Parser = js.Object
  type UndoRedoAction = Change | InsertRow | RemoveRow | InsertCol | RemoveCol | Filter
}
