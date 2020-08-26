package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessShowingEventUIParam extends js.Object {
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.native
  /**
    * Gets the text of message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to the target of the message.
    */
  var target: js.UndefOr[String] = js.native
}

object SuccessShowingEventUIParam {
  @scala.inline
  def apply(): SuccessShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessShowingEventUIParam]
  }
  @scala.inline
  implicit class SuccessShowingEventUIParamOps[Self <: SuccessShowingEventUIParam] (val x: Self) extends AnyVal {
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
    def setFieldOptions(value: js.Any): Self = this.set("fieldOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldOptions: Self = this.set("fieldOptions", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

