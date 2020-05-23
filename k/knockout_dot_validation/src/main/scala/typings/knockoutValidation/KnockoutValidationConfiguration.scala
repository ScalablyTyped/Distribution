package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationConfiguration extends js.Object {
  /**
    * Allows HTML in validation messages
    */
  var allowHtmlMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether css error classes are added only
    * when properties are modified or at all times
    * @type {[type]}
    */
  var decorateElementOnModified: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to assign an error class to the <input> tag
    * when your property is invalid
    */
  var decorateInputElement: js.UndefOr[Boolean] = js.undefined
  /**
    * If defined, the CSS class assigned to both <input> and validation message elements
    */
  var errorClass: js.UndefOr[String] = js.undefined
  /**
    * The CSS class assigned to validation error <input> elements, must have decorateInputElement set to true
    */
  var errorElementClass: js.UndefOr[String] = js.undefined
  /**
    * The CSS class assigned to validation error messages
    */
  var errorMessageClass: js.UndefOr[String] = js.undefined
  /**
    * Shows tooltips using input 'title' attribute. False hides them
    */
  var errorsAsTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the error when hovering the input field (decorateElement must be true)
    */
  var errorsAsTitleOnModified: js.UndefOr[Boolean] = js.undefined
  var grouping: js.UndefOr[KnockoutValidationGroupingOptions] = js.undefined
  /**
    * Supply the HTML5 input types validation will be
    * added to. Defaults to ["email", "number", "date"]
    */
  var html5InputTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If true validation will insert either a <span> element or the template
    * specified by messageTemplate after any element (e.g. <input>)
    * that uses a KO value binding with a validated field
    */
  var insertMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of the <script type="text/html"></script>
    * that you want to use for all your validation messages
    */
  var messageTemplate: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether validation messages are triggered only
    * when properties are modified or at all times
    */
  var messagesOnModified: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to assign validation rules to your ViewModel
    * using HTML5 validation attributes
    */
  var parseInputAttributes: js.UndefOr[Boolean] = js.undefined
  /**
    * Register custom validation rules defined via ko.validation.rules
    */
  var registerExtenders: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[KnockoutValidationValidateOptions] = js.undefined
  /**
    * Add HTML5 input validation attributes to form elements
    * that ko observable's are bound to
    */
  var writeInputAttributes: js.UndefOr[Boolean] = js.undefined
}

object KnockoutValidationConfiguration {
  @scala.inline
  def apply(
    allowHtmlMessages: js.UndefOr[Boolean] = js.undefined,
    decorateElementOnModified: js.UndefOr[Boolean] = js.undefined,
    decorateInputElement: js.UndefOr[Boolean] = js.undefined,
    errorClass: String = null,
    errorElementClass: String = null,
    errorMessageClass: String = null,
    errorsAsTitle: js.UndefOr[Boolean] = js.undefined,
    errorsAsTitleOnModified: js.UndefOr[Boolean] = js.undefined,
    grouping: KnockoutValidationGroupingOptions = null,
    html5InputTypes: js.Array[String] = null,
    insertMessages: js.UndefOr[Boolean] = js.undefined,
    messageTemplate: String = null,
    messagesOnModified: js.UndefOr[Boolean] = js.undefined,
    parseInputAttributes: js.UndefOr[Boolean] = js.undefined,
    registerExtenders: js.UndefOr[Boolean] = js.undefined,
    validate: KnockoutValidationValidateOptions = null,
    writeInputAttributes: js.UndefOr[Boolean] = js.undefined
  ): KnockoutValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtmlMessages)) __obj.updateDynamic("allowHtmlMessages")(allowHtmlMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decorateElementOnModified)) __obj.updateDynamic("decorateElementOnModified")(decorateElementOnModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decorateInputElement)) __obj.updateDynamic("decorateInputElement")(decorateInputElement.get.asInstanceOf[js.Any])
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass.asInstanceOf[js.Any])
    if (errorElementClass != null) __obj.updateDynamic("errorElementClass")(errorElementClass.asInstanceOf[js.Any])
    if (errorMessageClass != null) __obj.updateDynamic("errorMessageClass")(errorMessageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(errorsAsTitle)) __obj.updateDynamic("errorsAsTitle")(errorsAsTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorsAsTitleOnModified)) __obj.updateDynamic("errorsAsTitleOnModified")(errorsAsTitleOnModified.get.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (html5InputTypes != null) __obj.updateDynamic("html5InputTypes")(html5InputTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(insertMessages)) __obj.updateDynamic("insertMessages")(insertMessages.get.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesOnModified)) __obj.updateDynamic("messagesOnModified")(messagesOnModified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputAttributes)) __obj.updateDynamic("parseInputAttributes")(parseInputAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(registerExtenders)) __obj.updateDynamic("registerExtenders")(registerExtenders.get.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (!js.isUndefined(writeInputAttributes)) __obj.updateDynamic("writeInputAttributes")(writeInputAttributes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationConfiguration]
  }
}

