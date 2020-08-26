package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationConfiguration extends js.Object {
  /**
    * Allows HTML in validation messages
    */
  var allowHtmlMessages: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether css error classes are added only
    * when properties are modified or at all times
    * @type {[type]}
    */
  var decorateElementOnModified: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to assign an error class to the <input> tag
    * when your property is invalid
    */
  var decorateInputElement: js.UndefOr[Boolean] = js.native
  /**
    * If defined, the CSS class assigned to both <input> and validation message elements
    */
  var errorClass: js.UndefOr[String] = js.native
  /**
    * The CSS class assigned to validation error <input> elements, must have decorateInputElement set to true
    */
  var errorElementClass: js.UndefOr[String] = js.native
  /**
    * The CSS class assigned to validation error messages
    */
  var errorMessageClass: js.UndefOr[String] = js.native
  /**
    * Shows tooltips using input 'title' attribute. False hides them
    */
  var errorsAsTitle: js.UndefOr[Boolean] = js.native
  /**
    * Shows the error when hovering the input field (decorateElement must be true)
    */
  var errorsAsTitleOnModified: js.UndefOr[Boolean] = js.native
  var grouping: js.UndefOr[KnockoutValidationGroupingOptions] = js.native
  /**
    * Supply the HTML5 input types validation will be
    * added to. Defaults to ["email", "number", "date"]
    */
  var html5InputTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true validation will insert either a <span> element or the template
    * specified by messageTemplate after any element (e.g. <input>)
    * that uses a KO value binding with a validated field
    */
  var insertMessages: js.UndefOr[Boolean] = js.native
  /**
    * The id of the <script type="text/html"></script>
    * that you want to use for all your validation messages
    */
  var messageTemplate: js.UndefOr[String] = js.native
  /**
    * Indicates whether validation messages are triggered only
    * when properties are modified or at all times
    */
  var messagesOnModified: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to assign validation rules to your ViewModel
    * using HTML5 validation attributes
    */
  var parseInputAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Register custom validation rules defined via ko.validation.rules
    */
  var registerExtenders: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[KnockoutValidationValidateOptions] = js.native
  /**
    * Add HTML5 input validation attributes to form elements
    * that ko observable's are bound to
    */
  var writeInputAttributes: js.UndefOr[Boolean] = js.native
}

object KnockoutValidationConfiguration {
  @scala.inline
  def apply(): KnockoutValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationConfiguration]
  }
  @scala.inline
  implicit class KnockoutValidationConfigurationOps[Self <: KnockoutValidationConfiguration] (val x: Self) extends AnyVal {
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
    def setAllowHtmlMessages(value: Boolean): Self = this.set("allowHtmlMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHtmlMessages: Self = this.set("allowHtmlMessages", js.undefined)
    @scala.inline
    def setDecorateElementOnModified(value: Boolean): Self = this.set("decorateElementOnModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorateElementOnModified: Self = this.set("decorateElementOnModified", js.undefined)
    @scala.inline
    def setDecorateInputElement(value: Boolean): Self = this.set("decorateInputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorateInputElement: Self = this.set("decorateInputElement", js.undefined)
    @scala.inline
    def setErrorClass(value: String): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorClass: Self = this.set("errorClass", js.undefined)
    @scala.inline
    def setErrorElementClass(value: String): Self = this.set("errorElementClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorElementClass: Self = this.set("errorElementClass", js.undefined)
    @scala.inline
    def setErrorMessageClass(value: String): Self = this.set("errorMessageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessageClass: Self = this.set("errorMessageClass", js.undefined)
    @scala.inline
    def setErrorsAsTitle(value: Boolean): Self = this.set("errorsAsTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorsAsTitle: Self = this.set("errorsAsTitle", js.undefined)
    @scala.inline
    def setErrorsAsTitleOnModified(value: Boolean): Self = this.set("errorsAsTitleOnModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorsAsTitleOnModified: Self = this.set("errorsAsTitleOnModified", js.undefined)
    @scala.inline
    def setGrouping(value: KnockoutValidationGroupingOptions): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setHtml5InputTypesVarargs(value: String*): Self = this.set("html5InputTypes", js.Array(value :_*))
    @scala.inline
    def setHtml5InputTypes(value: js.Array[String]): Self = this.set("html5InputTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5InputTypes: Self = this.set("html5InputTypes", js.undefined)
    @scala.inline
    def setInsertMessages(value: Boolean): Self = this.set("insertMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertMessages: Self = this.set("insertMessages", js.undefined)
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
    @scala.inline
    def setMessagesOnModified(value: Boolean): Self = this.set("messagesOnModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesOnModified: Self = this.set("messagesOnModified", js.undefined)
    @scala.inline
    def setParseInputAttributes(value: Boolean): Self = this.set("parseInputAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseInputAttributes: Self = this.set("parseInputAttributes", js.undefined)
    @scala.inline
    def setRegisterExtenders(value: Boolean): Self = this.set("registerExtenders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterExtenders: Self = this.set("registerExtenders", js.undefined)
    @scala.inline
    def setValidate(value: KnockoutValidationValidateOptions): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setWriteInputAttributes(value: Boolean): Self = this.set("writeInputAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteInputAttributes: Self = this.set("writeInputAttributes", js.undefined)
  }
  
}

