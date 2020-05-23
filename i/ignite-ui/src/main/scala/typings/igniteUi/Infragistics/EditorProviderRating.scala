package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProviderRating extends js.Object {
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
  def internalValueChange(evt: js.Object, ui: js.Object): Unit
  def isValid(): Unit
  def keyDown(evt: js.Object, ui: js.Object): Unit
  def refreshValue(): Unit
  def removeFromParent(): Unit
  def requestValidate(evt: js.Object): Unit
  def setFocus(): Unit
  def setSize(width: js.Object, height: js.Object): Unit
  def setValue(`val`: js.Object): Unit
  def validate(): Unit
  def validator(): Unit
  def valueChange(evt: js.Object, ui: js.Object): Unit
}

object EditorProviderRating {
  @scala.inline
  def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Unit,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getEditor: () => Unit,
    getValue: () => Unit,
    internalValueChange: (js.Object, js.Object) => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    requestValidate: js.Object => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: js.Object => Unit,
    validate: () => Unit,
    validator: () => Unit,
    valueChange: (js.Object, js.Object) => Unit
  ): EditorProviderRating = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3(attachErrorEvents), createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getEditor = js.Any.fromFunction0(getEditor), getValue = js.Any.fromFunction0(getValue), internalValueChange = js.Any.fromFunction2(internalValueChange), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), requestValidate = js.Any.fromFunction1(requestValidate), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate), validator = js.Any.fromFunction0(validator), valueChange = js.Any.fromFunction2(valueChange))
    __obj.asInstanceOf[EditorProviderRating]
  }
}

