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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttonName")(buttonName)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("popup")(popup)
    __obj.updateDynamic("popupName")(popupName)
    __obj.updateDynamic("useCSS")(useCSS)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
}

