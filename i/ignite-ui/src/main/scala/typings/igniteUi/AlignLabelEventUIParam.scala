package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignLabelEventUIParam extends js.Object {
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the height of the label.
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the X offset of the label on the bullet graph scale.
    */
  var offsetX: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the Y offset of the label on the bullet graph scale.
    */
  var offsetY: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to gauge widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain the width of the label.
    */
  var width: js.UndefOr[js.Any] = js.native
}

object AlignLabelEventUIParam {
  @scala.inline
  def apply(): AlignLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignLabelEventUIParam]
  }
  @scala.inline
  implicit class AlignLabelEventUIParamOps[Self <: AlignLabelEventUIParam] (val x: Self) extends AnyVal {
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
    def setActualMaximumValue(value: js.Any): Self = this.set("actualMaximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualMaximumValue: Self = this.set("actualMaximumValue", js.undefined)
    @scala.inline
    def setActualMinimumValue(value: js.Any): Self = this.set("actualMinimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualMinimumValue: Self = this.set("actualMinimumValue", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOffsetX(value: js.Any): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: js.Any): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

