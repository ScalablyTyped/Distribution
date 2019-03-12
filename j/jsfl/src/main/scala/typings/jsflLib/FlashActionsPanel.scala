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
    getClassForObject: () => js.Any,
    getScriptAssistMode: () => js.Any,
    getSelectedText: () => js.Any,
    getText: () => js.Any,
    hasSelection: () => js.Any,
    replaceSelectedText: () => js.Any,
    setScriptAssistMode: () => js.Any,
    setSelection: () => js.Any,
    setText: () => js.Any
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal(getClassForObject = js.Any.fromFunction0(getClassForObject), getScriptAssistMode = js.Any.fromFunction0(getScriptAssistMode), getSelectedText = js.Any.fromFunction0(getSelectedText), getText = js.Any.fromFunction0(getText), hasSelection = js.Any.fromFunction0(hasSelection), replaceSelectedText = js.Any.fromFunction0(replaceSelectedText), setScriptAssistMode = js.Any.fromFunction0(setScriptAssistMode), setSelection = js.Any.fromFunction0(setSelection), setText = js.Any.fromFunction0(setText))
  
    __obj.asInstanceOf[FlashActionsPanel]
  }
}

