package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgValidator
  extends /**
	 * Option for igValidator
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets Credit Card number validation rule options.Note: This rule will only validate the checksum of the number using Luhn algorithm irregardless of card type.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid Credit Card number.
  	 * "object" A configuration object with optional error message (e.g. creditCard: { errorMessage: "Enter a valid card number"} )
  	 */
  var creditCard: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets a custom function to perform validation. Use 'this' to reference the calling validator and the value and optional field settings arguments to determine and return the state of the field.
  	 *
  	 *
  	 * Valid values:
  	 * "function" The function to call
  	 * "string" Function name, must be in global namespace (window["name"])
  	 * "object" A configuration object with method property being the function and optional error message.
  	 */
  var custom: js.UndefOr[js.Function | String | js.Object] = js.undefined
  /**
  	 * Gets/Sets date validation rule options. This can additionally help guide the [valueRange](ui.igvalidator#options:valueRange) validation.Note: Dependant on JavaScript Date parsing which will accept a wide range of values.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid JavaScript Date or can be parsed as one.
  	 * "object" A configuration object with optional error message (e.g. date: { errorMessage: "Enter a valid number"} )
  	 */
  var date: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets email validation rule options. Uses a RegExp defined in the "$.ui.igValidator.defaults" object.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be an email.
  	 * "object" A configuration object with optional error message (e.g. email: { errorMessage: "Enter a valid email"} )
  	 */
  var email: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets a requirement for the value in this field to be the same as another input element or editor control.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the target element
  	 * "object" A reference to the jQuery object for the target or an object with selector property and custom errorMessage.
  	 */
  var equalTo: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Event raised for invalid field after value was validated but before any action takes effect.
  	 * Function takes arguments evt and ui.
  	 */
  var error: js.UndefOr[ErrorEvent] = js.undefined
  /**
  	 * Event which is raised after error message was hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorHidden: js.UndefOr[ErrorHiddenEvent] = js.undefined
  /**
  	 * Event which is raised before error message is hidden.
  	 * Return false in order to keep the error message displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorHiding: js.UndefOr[ErrorHidingEvent] = js.undefined
  /**
  	 * Gets/Sets text for an error message to be used if none is set for the particular rule. Overrides default rule-specific error messages.
  	 *
  	 */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised before error message is displayed.
  	 * Return false in order to prevent error message display.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorShowing: js.UndefOr[ErrorShowingEvent] = js.undefined
  /**
  	 * Event which is raised after error message was displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorShown: js.UndefOr[ErrorShownEvent] = js.undefined
  /**
  	 * Gets/Sets if all rules for a field should be checked, so even if one fails the rest will continue executing.
  	 * Note: This will not force checks on an empty field for rules that don't normally execute without a value.
  	 *
  	 */
  var executeAllRules: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets a list of target field items describing each with validation options and a required selector. Fields can contain any of the validation rules and triggers but not other fields or event handlers.
  	 * Applicable options are also inherited from the global control configuration if not set.
  	 *
  	 */
  var fields: js.UndefOr[js.Array[IgValidatorField]] = js.undefined
  /**
  	 * Event triggered on Validator instance level after failed validation on form submit event.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formError: js.UndefOr[FormErrorEvent] = js.undefined
  /**
  	 * Event triggered on Validator instance level after successful validation on form submit event.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formSuccess: js.UndefOr[FormSuccessEvent] = js.undefined
  /**
  	 * Event triggered on Validator instance level after validation on form submit event..
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formValidated: js.UndefOr[FormValidatedEvent] = js.undefined
  /**
  	 * Event triggered on Validator instance level before handling a form submit event.
  	 * Return false to cancel to skip validating and potentially allow the submit if no other other validators return error.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formValidating: js.UndefOr[FormValidatingEvent] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets a minimum and/or maximum length of text or number of selected items. Null or 0 values are ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "array" An array of two numbers, where the first value is the minimum and the second is the maximum. (e.g. lengthRange: [ 1, 10] )
  	 * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Password must be at least {0} long and no more than {1}." } )
  	 */
  var lengthRange: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets a custom jQuery element to be used for validation messages. That inner HTML of the target is modified, can be a SPAN, LABEL or DIV.
  	 *
  	 */
  var messageTarget: js.UndefOr[Element] = js.undefined
  /**
  	 * Gets/Sets the options for the [igNotifier](ui.ignotifier#options) used to show error messages.
  	 *
  	 */
  var notificationOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets number validation rule options.Default separators for decimals and thousands are '.' and ',' respectively and are defined in the "$.ui.igValidator.defaults" object.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a number. Default separators are used.
  	 * "object" A configuration object with errorMessage, decimalSeparator and thousandsSeparator. Those properties are all optional.
  	 */
  var number: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when the editor loses focus.
  	 *
  	 */
  var onblur: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when the text in editor changes.
  	 * Note that this is more appropriate for selection controls such as checkbox, combo or rating.
  	 * As it can cause excessive messages with text-based fields, the initial validation can be delayed via the [threshold](ui.igvalidator#options:threshold) option.
  	 *
  	 */
  var onchange: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when a form containing validation targets is submitting. If any of the validations fail, the submit action will be prevented.
  	 * Note that this doesn't apply to the native JavaScript submit function, but will handle the jQuery equivalent and the browser default action.
  	 *
  	 */
  var onsubmit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the option to show a label indication next to optional fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var optionalIndication: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets regular expression validation rule options.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A string containing regular expression.
  	 * "object" A RegExp object or an object with expression and errorMessage properties.
  	 */
  var pattern: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets/Sets option to validate if a value was entered (not empty text, selected item, etc.)
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field is required.
  	 * "object" A configuration object with optional error message (e.g. required: { errorMessage: "Error!"} )
  	 */
  var required: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets the option to show an asterisks indication next to required fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var requiredIndication: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event raised for valid field after value was validated but before any action takes effect.
  	 * Function takes arguments evt and ui.
  	 */
  var success: js.UndefOr[SuccessEvent] = js.undefined
  /**
  	 * Event which is raised after success message was hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successHidden: js.UndefOr[SuccessHiddenEvent] = js.undefined
  /**
  	 * Event which is raised before success message is hidden.
  	 * Return false in order to keep success message displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successHiding: js.UndefOr[SuccessHidingEvent] = js.undefined
  /**
  	 * Gets/Sets text for a success message. Note that since there is no default, setting this message will enable showing success indication.
  	 *
  	 */
  var successMessage: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised before success message is displayed.
  	 * Return false in order to prevent success message display.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successShowing: js.UndefOr[SuccessShowingEvent] = js.undefined
  /**
  	 * Event which is raised after success message was displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successShown: js.UndefOr[SuccessShownEvent] = js.undefined
  /**
  	 * Gets/Sets validation minimum input length. Validation won't be triggered for input before that value is reached on change and focus loss.
  	 * Note: This will not affect required fields on form submit.
  	 *
  	 */
  var threshold: js.UndefOr[Double] = js.undefined
  /**
  	 * Event which is raised after value was validated but before any action takes effect.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var validated: js.UndefOr[ValidatedEvent] = js.undefined
  /**
  	 * Event which is raised on validation before default validation logic is applied.
  	 * Return false in order to cancel the event and consider the field valid.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var validating: js.UndefOr[ValidatingEvent] = js.undefined
  /**
  	 * Gets/Sets a minimum and/or maximum value. Null values are ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "array" An array of two numbers or dates, where the first is the minimum and the second is the maximum. (e.g. valueRange: [ 1, 10] )
  	 * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Value must be between {0} and {1}." } )
  	 */
  var valueRange: js.UndefOr[js.Array[_] | js.Object] = js.undefined
}

object IgValidator {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igValidator
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    creditCard: Boolean | js.Object = null,
    custom: js.Function | String | js.Object = null,
    date: Boolean | js.Object = null,
    email: Boolean | js.Object = null,
    equalTo: String | js.Object = null,
    error: (/* event */ Event_, /* ui */ ErrorEventUIParam) => Unit = null,
    errorHidden: (/* event */ Event_, /* ui */ ErrorHiddenEventUIParam) => Unit = null,
    errorHiding: (/* event */ Event_, /* ui */ ErrorHidingEventUIParam) => Unit = null,
    errorMessage: String = null,
    errorShowing: (/* event */ Event_, /* ui */ ErrorShowingEventUIParam) => Unit = null,
    errorShown: (/* event */ Event_, /* ui */ ErrorShownEventUIParam) => Unit = null,
    executeAllRules: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[IgValidatorField] = null,
    formError: (/* event */ Event_, /* ui */ FormErrorEventUIParam) => Unit = null,
    formSuccess: (/* event */ Event_, /* ui */ FormSuccessEventUIParam) => Unit = null,
    formValidated: (/* event */ Event_, /* ui */ FormValidatedEventUIParam) => Unit = null,
    formValidating: (/* event */ Event_, /* ui */ FormValidatingEventUIParam) => Unit = null,
    language: String = null,
    lengthRange: js.Array[_] | js.Object = null,
    locale: js.Any = null,
    messageTarget: Element = null,
    notificationOptions: js.Any = null,
    number: Boolean | js.Object = null,
    onblur: js.UndefOr[Boolean] = js.undefined,
    onchange: js.UndefOr[Boolean] = js.undefined,
    onsubmit: js.UndefOr[Boolean] = js.undefined,
    optionalIndication: js.UndefOr[Boolean] = js.undefined,
    pattern: String | js.Object = null,
    regional: String | js.Object = null,
    required: Boolean | js.Object = null,
    requiredIndication: js.UndefOr[Boolean] = js.undefined,
    success: (/* event */ Event_, /* ui */ SuccessEventUIParam) => Unit = null,
    successHidden: (/* event */ Event_, /* ui */ SuccessHiddenEventUIParam) => Unit = null,
    successHiding: (/* event */ Event_, /* ui */ SuccessHidingEventUIParam) => Unit = null,
    successMessage: String = null,
    successShowing: (/* event */ Event_, /* ui */ SuccessShowingEventUIParam) => Unit = null,
    successShown: (/* event */ Event_, /* ui */ SuccessShownEventUIParam) => Unit = null,
    threshold: Int | Double = null,
    validated: (/* event */ Event_, /* ui */ ValidatedEventUIParam) => Unit = null,
    validating: (/* event */ Event_, /* ui */ ValidatingEventUIParam) => Unit = null,
    valueRange: js.Array[_] | js.Object = null
  ): IgValidator = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (creditCard != null) __obj.updateDynamic("creditCard")(creditCard.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (equalTo != null) __obj.updateDynamic("equalTo")(equalTo.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (errorHidden != null) __obj.updateDynamic("errorHidden")(js.Any.fromFunction2(errorHidden))
    if (errorHiding != null) __obj.updateDynamic("errorHiding")(js.Any.fromFunction2(errorHiding))
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorShowing != null) __obj.updateDynamic("errorShowing")(js.Any.fromFunction2(errorShowing))
    if (errorShown != null) __obj.updateDynamic("errorShown")(js.Any.fromFunction2(errorShown))
    if (!js.isUndefined(executeAllRules)) __obj.updateDynamic("executeAllRules")(executeAllRules.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (formError != null) __obj.updateDynamic("formError")(js.Any.fromFunction2(formError))
    if (formSuccess != null) __obj.updateDynamic("formSuccess")(js.Any.fromFunction2(formSuccess))
    if (formValidated != null) __obj.updateDynamic("formValidated")(js.Any.fromFunction2(formValidated))
    if (formValidating != null) __obj.updateDynamic("formValidating")(js.Any.fromFunction2(formValidating))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lengthRange != null) __obj.updateDynamic("lengthRange")(lengthRange.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (messageTarget != null) __obj.updateDynamic("messageTarget")(messageTarget.asInstanceOf[js.Any])
    if (notificationOptions != null) __obj.updateDynamic("notificationOptions")(notificationOptions.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (!js.isUndefined(onblur)) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (!js.isUndefined(onchange)) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (!js.isUndefined(onsubmit)) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(optionalIndication)) __obj.updateDynamic("optionalIndication")(optionalIndication.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(requiredIndication)) __obj.updateDynamic("requiredIndication")(requiredIndication.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    if (successHidden != null) __obj.updateDynamic("successHidden")(js.Any.fromFunction2(successHidden))
    if (successHiding != null) __obj.updateDynamic("successHiding")(js.Any.fromFunction2(successHiding))
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successShowing != null) __obj.updateDynamic("successShowing")(js.Any.fromFunction2(successShowing))
    if (successShown != null) __obj.updateDynamic("successShown")(js.Any.fromFunction2(successShown))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(js.Any.fromFunction2(validated))
    if (validating != null) __obj.updateDynamic("validating")(js.Any.fromFunction2(validating))
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgValidator]
  }
}

