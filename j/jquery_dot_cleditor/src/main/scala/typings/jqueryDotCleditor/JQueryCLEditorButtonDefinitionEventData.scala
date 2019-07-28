package typings.jqueryDotCleditor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinitionEventData extends js.Object {
  var button: HTMLElement
  var buttonName: String
  var command: String
  var editor: CLEditor
  var popup: HTMLElement
  var popupName: String
  var useCSS: Boolean
  var value: js.Any
}

object JQueryCLEditorButtonDefinitionEventData {
  @scala.inline
  def apply(
    button: HTMLElement,
    buttonName: String,
    command: String,
    editor: CLEditor,
    popup: HTMLElement,
    popupName: String,
    useCSS: Boolean,
    value: js.Any
  ): JQueryCLEditorButtonDefinitionEventData = {
    val __obj = js.Dynamic.literal(button = button, buttonName = buttonName, command = command, editor = editor, popup = popup, popupName = popupName, useCSS = useCSS, value = value)
  
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
}

