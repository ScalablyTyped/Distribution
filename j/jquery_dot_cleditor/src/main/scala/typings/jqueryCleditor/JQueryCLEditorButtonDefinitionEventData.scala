package typings.jqueryCleditor

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
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonName = buttonName.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupName = popupName.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
}

