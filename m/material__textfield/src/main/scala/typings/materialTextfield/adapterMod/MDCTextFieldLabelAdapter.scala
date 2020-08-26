package typings.materialTextfield.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldLabelAdapter extends js.Object {
  /**
    * Only implement if label exists.
    * Floats the label above the input element if shouldFloat is true.
    */
  def floatLabel(shouldFloat: Boolean): Unit = js.native
  /**
    * Only implement if label exists.
    * @return width of label in pixels.
    */
  def getLabelWidth(): Double = js.native
  /**
    * @return true if label element exists, false if it doesn't.
    */
  def hasLabel(): Boolean = js.native
  /**
    * Only implement if label exists.
    * Styles the label as required.
    */
  def setLabelRequired(isRequired: Boolean): Unit = js.native
  /**
    * Only implement if label exists.
    * Shakes label if shouldShake is true.
    */
  def shakeLabel(shouldShake: Boolean): Unit = js.native
}

object MDCTextFieldLabelAdapter {
  @scala.inline
  def apply(
    floatLabel: Boolean => Unit,
    getLabelWidth: () => Double,
    hasLabel: () => Boolean,
    setLabelRequired: Boolean => Unit,
    shakeLabel: Boolean => Unit
  ): MDCTextFieldLabelAdapter = {
    val __obj = js.Dynamic.literal(floatLabel = js.Any.fromFunction1(floatLabel), getLabelWidth = js.Any.fromFunction0(getLabelWidth), hasLabel = js.Any.fromFunction0(hasLabel), setLabelRequired = js.Any.fromFunction1(setLabelRequired), shakeLabel = js.Any.fromFunction1(shakeLabel))
    __obj.asInstanceOf[MDCTextFieldLabelAdapter]
  }
  @scala.inline
  implicit class MDCTextFieldLabelAdapterOps[Self <: MDCTextFieldLabelAdapter] (val x: Self) extends AnyVal {
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
    def setFloatLabel(value: Boolean => Unit): Self = this.set("floatLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setHasLabel(value: () => Boolean): Self = this.set("hasLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLabelRequired(value: Boolean => Unit): Self = this.set("setLabelRequired", js.Any.fromFunction1(value))
    @scala.inline
    def setShakeLabel(value: Boolean => Unit): Self = this.set("shakeLabel", js.Any.fromFunction1(value))
  }
  
}

