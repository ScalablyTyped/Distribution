package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPaste extends Base {
  var columnsLimit: scala.Double = js.native
  var copyableRanges: js.Array[_] = js.native
  var eventManager: EventManager = js.native
  var focusableElement: FocusableWrapper = js.native
  var pasteMode: PasteModeType = js.native
  var rowsLimit: scala.Double = js.native
  def copy(): scala.Unit = js.native
  def copy(triggeredByClick: scala.Boolean): scala.Unit = js.native
  def cut(): scala.Unit = js.native
  def cut(triggeredByClick: scala.Boolean): scala.Unit = js.native
  def getRangedCopyableData(ranges: js.Array[RangeType]): java.lang.String = js.native
  def getRangedData(ranges: js.Array[RangeType]): js.Array[_] = js.native
  def paste(): scala.Unit = js.native
  def paste(triggeredByClick: scala.Boolean): scala.Unit = js.native
  def setCopyableText(): scala.Unit = js.native
}

