package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormValidatedEventUIParam extends js.Object {
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to the event target form.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.native
}

object FormValidatedEventUIParam {
  @scala.inline
  def apply(): FormValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormValidatedEventUIParam]
  }
  @scala.inline
  implicit class FormValidatedEventUIParamOps[Self <: FormValidatedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

