package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatedEventUIParam extends js.Object {
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.native
  /**
    * Get the formatted message text, if any.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Get all messages, if any. May be more than one if [executeAllRules](ui.igvalidator#options:executeAllRules) is enabled.
    */
  var messages: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Deprecated. Populated with the name of the rule that failed validation, if any.
    */
  var rule: js.UndefOr[String] = js.native
  /**
    * Populated with the names of rule that failed validation, if any.
    */
  var rules: js.UndefOr[js.Array[_]] = js.native
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.native
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object ValidatedEventUIParam {
  @scala.inline
  def apply(): ValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatedEventUIParam]
  }
  @scala.inline
  implicit class ValidatedEventUIParamOps[Self <: ValidatedEventUIParam] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: js.Any*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[_]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setRulesVarargs(value: js.Any*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[_]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

