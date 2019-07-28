package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPaste extends Base {
  var columnsLimit: Double = js.native
  var copyableRanges: js.Array[_] = js.native
  var eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager = js.native
  var focusableElement: FocusableWrapper = js.native
  var pasteMode: PasteModeType = js.native
  var rowsLimit: Double = js.native
  def copy(): Unit = js.native
  def copy(triggeredByClick: Boolean): Unit = js.native
  def cut(): Unit = js.native
  def cut(triggeredByClick: Boolean): Unit = js.native
  def getRangedCopyableData(ranges: js.Array[RangeType]): String = js.native
  def getRangedData(ranges: js.Array[RangeType]): js.Array[_] = js.native
  def paste(): Unit = js.native
  def paste(triggeredByClick: Boolean): Unit = js.native
  def setCopyableText(): Unit = js.native
}

