package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProviderCombo extends js.Object {
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit
  def destroy(): Unit
  def getEditor(): Unit
  def getValue(): Unit
  def internalSelectionChanged(evt: js.Object, ui: js.Object): Unit
  def isValid(): Unit
  def keyDown(evt: js.Object, ui: js.Object): Unit
  def refreshValue(): Unit
  def removeFromParent(): Unit
  def requestValidate(evt: js.Object): Unit
  def selectionChanged(evt: js.Object, ui: js.Object): Unit
  def setFocus(): Unit
  def setSize(width: js.Object, height: js.Object): Unit
  def setValue(`val`: js.Object, fire: js.Object): Unit
  def validate(): Unit
  def validator(): Unit
}

object EditorProviderCombo {
  @scala.inline
  def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Unit,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getEditor: () => Unit,
    getValue: () => Unit,
    internalSelectionChanged: (js.Object, js.Object) => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    requestValidate: js.Object => Unit,
    selectionChanged: (js.Object, js.Object) => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: (js.Object, js.Object) => Unit,
    validate: () => Unit,
    validator: () => Unit
  ): EditorProviderCombo = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3(attachErrorEvents), createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getEditor = js.Any.fromFunction0(getEditor), getValue = js.Any.fromFunction0(getValue), internalSelectionChanged = js.Any.fromFunction2(internalSelectionChanged), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), requestValidate = js.Any.fromFunction1(requestValidate), selectionChanged = js.Any.fromFunction2(selectionChanged), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction2(setValue), validate = js.Any.fromFunction0(validate), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderCombo]
  }
}

