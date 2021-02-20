package typings.handsontable.mod.Handsontable.plugins

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyPaste extends Base {
  
  var columnsLimit: Double = js.native
  
  def copy(): Unit = js.native
  
  var copyableRanges: js.Array[_] = js.native
  
  def cut(): Unit = js.native
  
  var focusableElement: FocusableWrapper = js.native
  
  def getRangedCopyableData(ranges: js.Array[RangeType]): String = js.native
  
  def getRangedData(ranges: js.Array[RangeType]): js.Array[_] = js.native
  
  def paste(): Unit = js.native
  def paste(pastableText: js.UndefOr[scala.Nothing], pastableHtml: String): Unit = js.native
  def paste(pastableText: String): Unit = js.native
  def paste(pastableText: String, pastableHtml: String): Unit = js.native
  
  var pasteMode: PasteModeType = js.native
  
  var rowsLimit: Double = js.native
  
  def setCopyableText(): Unit = js.native
  
  var uiContainer: HTMLElement = js.native
}
