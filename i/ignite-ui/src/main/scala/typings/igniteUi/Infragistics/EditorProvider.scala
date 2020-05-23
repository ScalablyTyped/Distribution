package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProvider extends js.Object {
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit
  /**
    * Create handlers cache
    *
    * @param callbacks
    * @param key
    * @param editorOptions
    * @param tabIndex
    * @param format
    * @param element
    */
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
  def isValid(): Unit
  def keyDown(evt: js.Object, ui: js.Object): Unit
  def refreshValue(): Unit
  def removeFromParent(): Unit
  def requestValidate(evt: js.Object): Unit
  def setFocus(toggle: js.Object): Unit
  def setSize(width: js.Object, height: js.Object): Unit
  def setValue(`val`: js.Object): Unit
  def validate(): Unit
  def validator(): Unit
}

object EditorProvider {
  @scala.inline
  def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Unit,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getEditor: () => Unit,
    getValue: () => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    requestValidate: js.Object => Unit,
    setFocus: js.Object => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: js.Object => Unit,
    validate: () => Unit,
    validator: () => Unit
  ): EditorProvider = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3(attachErrorEvents), createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getEditor = js.Any.fromFunction0(getEditor), getValue = js.Any.fromFunction0(getValue), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), requestValidate = js.Any.fromFunction1(requestValidate), setFocus = js.Any.fromFunction1(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProvider]
  }
}

