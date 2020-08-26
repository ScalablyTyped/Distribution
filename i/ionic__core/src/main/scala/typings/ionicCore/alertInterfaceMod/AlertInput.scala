package typings.ionicCore.alertInterfaceMod

import typings.ionicCore.ionicCoreStrings.checkbox
import typings.ionicCore.ionicCoreStrings.radio
import typings.ionicCore.ionicCoreStrings.textarea
import typings.ionicCore.mod.TextFieldTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertInput extends js.Object {
  var attributes: js.UndefOr[AlertInputAttributes | AlertTextareaAttributes] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var handler: js.UndefOr[js.Function1[/* input */ this.type, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var max: js.UndefOr[String | Double] = js.native
  var min: js.UndefOr[String | Double] = js.native
  var name: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[TextFieldTypes | checkbox | radio | textarea] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object AlertInput {
  @scala.inline
  def apply(): AlertInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertInput]
  }
  @scala.inline
  implicit class AlertInputOps[Self <: AlertInput] (val x: Self) extends AnyVal {
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
    def setAttributes(value: AlertInputAttributes | AlertTextareaAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHandler(value: AlertInput => Unit): Self = this.set("handler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMax(value: String | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setType(value: TextFieldTypes | checkbox | radio | textarea): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

