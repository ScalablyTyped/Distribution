package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationConfiguration extends js.Object {
  /**
    * Allows HTML in validation messages
    */
  var allowHtmlMessages: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether css error classes are added only
    * when properties are modified or at all times
    * @type {[type]}
    */
  var decorateElementOnModified: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to assign an error class to the <input> tag
    * when your property is invalid
    */
  var decorateInputElement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If defined, the CSS class assigned to both <input> and validation message elements
    */
  var errorClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The CSS class assigned to validation error <input> elements, must have decorateInputElement set to true
    */
  var errorElementClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The CSS class assigned to validation error messages
    */
  var errorMessageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shows tooltips using input 'title' attribute. False hides them
    */
  var errorsAsTitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the error when hovering the input field (decorateElement must be true)
    */
  var errorsAsTitleOnModified: js.UndefOr[scala.Boolean] = js.undefined
  var grouping: js.UndefOr[KnockoutValidationGroupingOptions] = js.undefined
  /**
    * Supply the HTML5 input types validation will be
    * added to. Defaults to ["email", "number", "date"]
    */
  var html5InputTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If true validation will insert either a <span> element or the template
    * specified by messageTemplate after any element (e.g. <input>)
    * that uses a KO value binding with a validated field
    */
  var insertMessages: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The id of the <script type="text/html"></script>
    * that you want to use for all your validation messages
    */
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether validation messages are triggered only
    * when properties are modified or at all times
    */
  var messagesOnModified: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to assign validation rules to your ViewModel
    * using HTML5 validation attributes
    */
  var parseInputAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Register custom validation rules defined via ko.validation.rules
    */
  var registerExtenders: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[KnockoutValidationValidateOptions] = js.undefined
  /**
    * Add HTML5 input validation attributes to form elements
    * that ko observable's are bound to
    */
  var writeInputAttributes: js.UndefOr[scala.Boolean] = js.undefined
}

object KnockoutValidationConfiguration {
  @scala.inline
  def apply(
    allowHtmlMessages: js.UndefOr[scala.Boolean] = js.undefined,
    decorateElementOnModified: js.UndefOr[scala.Boolean] = js.undefined,
    decorateInputElement: js.UndefOr[scala.Boolean] = js.undefined,
    errorClass: java.lang.String = null,
    errorElementClass: java.lang.String = null,
    errorMessageClass: java.lang.String = null,
    errorsAsTitle: js.UndefOr[scala.Boolean] = js.undefined,
    errorsAsTitleOnModified: js.UndefOr[scala.Boolean] = js.undefined,
    grouping: KnockoutValidationGroupingOptions = null,
    html5InputTypes: js.Array[java.lang.String] = null,
    insertMessages: js.UndefOr[scala.Boolean] = js.undefined,
    messageTemplate: java.lang.String = null,
    messagesOnModified: js.UndefOr[scala.Boolean] = js.undefined,
    parseInputAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    registerExtenders: js.UndefOr[scala.Boolean] = js.undefined,
    validate: KnockoutValidationValidateOptions = null,
    writeInputAttributes: js.UndefOr[scala.Boolean] = js.undefined
  ): KnockoutValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtmlMessages)) __obj.updateDynamic("allowHtmlMessages")(allowHtmlMessages)
    if (!js.isUndefined(decorateElementOnModified)) __obj.updateDynamic("decorateElementOnModified")(decorateElementOnModified)
    if (!js.isUndefined(decorateInputElement)) __obj.updateDynamic("decorateInputElement")(decorateInputElement)
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass)
    if (errorElementClass != null) __obj.updateDynamic("errorElementClass")(errorElementClass)
    if (errorMessageClass != null) __obj.updateDynamic("errorMessageClass")(errorMessageClass)
    if (!js.isUndefined(errorsAsTitle)) __obj.updateDynamic("errorsAsTitle")(errorsAsTitle)
    if (!js.isUndefined(errorsAsTitleOnModified)) __obj.updateDynamic("errorsAsTitleOnModified")(errorsAsTitleOnModified)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (html5InputTypes != null) __obj.updateDynamic("html5InputTypes")(html5InputTypes)
    if (!js.isUndefined(insertMessages)) __obj.updateDynamic("insertMessages")(insertMessages)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    if (!js.isUndefined(messagesOnModified)) __obj.updateDynamic("messagesOnModified")(messagesOnModified)
    if (!js.isUndefined(parseInputAttributes)) __obj.updateDynamic("parseInputAttributes")(parseInputAttributes)
    if (!js.isUndefined(registerExtenders)) __obj.updateDynamic("registerExtenders")(registerExtenders)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (!js.isUndefined(writeInputAttributes)) __obj.updateDynamic("writeInputAttributes")(writeInputAttributes)
    __obj.asInstanceOf[KnockoutValidationConfiguration]
  }
}

