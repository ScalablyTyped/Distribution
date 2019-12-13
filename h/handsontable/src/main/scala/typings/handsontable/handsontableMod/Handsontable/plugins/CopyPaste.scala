package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPaste extends Base {
  var columnsLimit: Double = js.native
  var copyableRanges: js.Array[_] = js.native
  var focusableElement: FocusableWrapper = js.native
  var pasteMode: PasteModeType = js.native
  var rowsLimit: Double = js.native
  var uiContainer: HTMLElement = js.native
  def copy(): Unit = js.native
  def cut(): Unit = js.native
  def getRangedCopyableData(ranges: js.Array[RangeType]): String = js.native
  def getRangedData(ranges: js.Array[RangeType]): js.Array[_] = js.native
  def paste(): Unit = js.native
  def paste(pastableText: String): Unit = js.native
  def paste(pastableText: String, pastableHtml: String): Unit = js.native
  def setCopyableText(): Unit = js.native
}

