package typings.jqueryCleditor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCLEditorButtonDefinitionEventData extends js.Object {
  var button: HTMLElement = js.native
  var buttonName: String = js.native
  var command: String = js.native
  var editor: CLEditor = js.native
  var popup: HTMLElement = js.native
  var popupName: String = js.native
  var useCSS: Boolean = js.native
  var value: js.Any = js.native
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
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionEventDataOps[Self <: JQueryCLEditorButtonDefinitionEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButton(value: HTMLElement): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonName(value: String): Self = this.set("buttonName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditor(value: CLEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopup(value: HTMLElement): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupName(value: String): Self = this.set("popupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

