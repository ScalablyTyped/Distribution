package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProviderText extends js.Object {
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  def destroy(): Unit = js.native
  def isValid(): Unit = js.native
  def keyDown(evt: js.Object, ui: js.Object): Unit = js.native
  def refreshValue(): Unit = js.native
  def removeFromParent(): Unit = js.native
  def setFocus(): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def textChanged(evt: js.Object, ui: js.Object): Unit = js.native
  def validator(): Unit = js.native
}

object EditorProviderText {
  @scala.inline
  def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    textChanged: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): EditorProviderText = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), textChanged = js.Any.fromFunction2(textChanged), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderText]
  }
  @scala.inline
  implicit class EditorProviderTextOps[Self <: EditorProviderText] (val x: Self) extends AnyVal {
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
    def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = this.set("createEditor", js.Any.fromFunction6(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValid(value: () => Unit): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def setKeyDown(value: (js.Object, js.Object) => Unit): Self = this.set("keyDown", js.Any.fromFunction2(value))
    @scala.inline
    def setRefreshValue(value: () => Unit): Self = this.set("refreshValue", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFromParent(value: () => Unit): Self = this.set("removeFromParent", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFocus(value: () => Unit): Self = this.set("setFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSize(value: (js.Object, js.Object) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def setTextChanged(value: (js.Object, js.Object) => Unit): Self = this.set("textChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setValidator(value: () => Unit): Self = this.set("validator", js.Any.fromFunction0(value))
  }
  
}

