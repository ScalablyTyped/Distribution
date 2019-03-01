package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashActionsPanel extends js.Object {
  def getClassForObject(): js.Any
  def getScriptAssistMode(): js.Any
  def getSelectedText(): js.Any
  def getText(): js.Any
  def hasSelection(): js.Any
  def replaceSelectedText(): js.Any
  def setScriptAssistMode(): js.Any
  def setSelection(): js.Any
  def setText(): js.Any
}

object FlashActionsPanel {
  @scala.inline
  def apply(
    getClassForObject: js.Function0[js.Any],
    getScriptAssistMode: js.Function0[js.Any],
    getSelectedText: js.Function0[js.Any],
    getText: js.Function0[js.Any],
    hasSelection: js.Function0[js.Any],
    replaceSelectedText: js.Function0[js.Any],
    setScriptAssistMode: js.Function0[js.Any],
    setSelection: js.Function0[js.Any],
    setText: js.Function0[js.Any]
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClassForObject")(getClassForObject)
    __obj.updateDynamic("getScriptAssistMode")(getScriptAssistMode)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("hasSelection")(hasSelection)
    __obj.updateDynamic("replaceSelectedText")(replaceSelectedText)
    __obj.updateDynamic("setScriptAssistMode")(setScriptAssistMode)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[FlashActionsPanel]
  }
}

