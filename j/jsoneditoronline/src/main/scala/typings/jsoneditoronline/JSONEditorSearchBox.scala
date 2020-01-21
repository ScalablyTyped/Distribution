package typings.jsoneditoronline

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorSearchBox")
@js.native
class JSONEditorSearchBox protected () extends js.Object {
  def this(editor: JSONEditor, container: HTMLElement) = this()
  def clearDelay(): Unit = js.native
  def focusActiveResult(): Unit = js.native
  def next(): Unit = js.native
  def onDelayedSearch(event: Event_): Unit = js.native
  def onKeyDown(event: Event_): Unit = js.native
  def onKeyUp(event: Event_): Unit = js.native
  def onSearch(event: Event_, forcedSearch: Boolean): Unit = js.native
  def previous(): Unit = js.native
  def setActiveResult(index: Double): Unit = js.native
}

