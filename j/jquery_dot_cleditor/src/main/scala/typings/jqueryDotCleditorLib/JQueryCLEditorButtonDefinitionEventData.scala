package typings
package jqueryDotCleditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorButtonDefinitionEventData extends js.Object {
  var button: stdLib.HTMLElement
  var buttonName: java.lang.String
  var command: java.lang.String
  var editor: CLEditor
  var popup: stdLib.HTMLElement
  var popupName: java.lang.String
  var useCSS: scala.Boolean
  var value: js.Any
}

object JQueryCLEditorButtonDefinitionEventData {
  @scala.inline
  def apply(
    button: stdLib.HTMLElement,
    buttonName: java.lang.String,
    command: java.lang.String,
    editor: CLEditor,
    popup: stdLib.HTMLElement,
    popupName: java.lang.String,
    useCSS: scala.Boolean,
    value: js.Any
  ): JQueryCLEditorButtonDefinitionEventData = {
    val __obj = js.Dynamic.literal(button = button, buttonName = buttonName, command = command, editor = editor, popup = popup, popupName = popupName, useCSS = useCSS, value = value)
  
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
}

