package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorSearchBox")
@js.native
class JSONEditorSearchBox protected () extends js.Object {
  def this(editor: JSONEditor, container: stdLib.HTMLElement) = this()
  def clearDelay(): scala.Unit = js.native
  def focusActiveResult(): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def onDelayedSearch(event: stdLib.Event): scala.Unit = js.native
  def onKeyDown(event: stdLib.Event): scala.Unit = js.native
  def onKeyUp(event: stdLib.Event): scala.Unit = js.native
  def onSearch(event: stdLib.Event, forcedSearch: scala.Boolean): scala.Unit = js.native
  def previous(): scala.Unit = js.native
  def setActiveResult(index: scala.Double): scala.Unit = js.native
}

