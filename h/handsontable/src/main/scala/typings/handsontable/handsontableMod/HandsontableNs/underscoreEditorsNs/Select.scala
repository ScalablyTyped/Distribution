package typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs

import typings.handsontable.handsontableMod.HandsontableNs.CellValue
import typings.handsontable.handsontableMod.HandsontableNs.RowObject
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Base {
  def getEditedCell(): js.UndefOr[HTMLTableCellElement] = js.native
  def prepareOptions(): Unit = js.native
  def prepareOptions(optionsToPrepare: js.Array[CellValue]): Unit = js.native
  def prepareOptions(optionsToPrepare: RowObject): Unit = js.native
  def refreshDimensions(): Unit = js.native
  def refreshValue(): Unit = js.native
  def registerHooks(): Unit = js.native
}

