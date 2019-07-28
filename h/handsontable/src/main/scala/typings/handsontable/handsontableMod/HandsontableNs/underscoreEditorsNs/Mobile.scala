package typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mobile extends Base {
  def hideCellPointer(): Unit = js.native
  def onBeforeKeyDown(): Unit = js.native
  def onBeforeKeyDown(event: KeyboardEvent): Unit = js.native
  def prepareAndSave(): Unit = js.native
  def scrollToView(): Unit = js.native
  def updateEditorData(): Unit = js.native
  def updateEditorPosition(): Unit = js.native
  def updateEditorPosition(x: Double): Unit = js.native
  def updateEditorPosition(x: Double, y: Double): Unit = js.native
  def valueChanged(): Boolean = js.native
}

