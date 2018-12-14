package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgValidator
  extends /**
	 * Option for igValidator
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets Credit Card number validation rule options.Note: This rule will only validate the checksum of the number using Luhn algorithm irregardless of card type.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid Credit Card number.
  	 * "object" A configuration object with optional error message (e.g. creditCard: { errorMessage: "Enter a valid card number"} )
  	 */
  var creditCard: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets a custom function to perform validation. Use 'this' to reference the calling validator and the value and optional field settings arguments to determine and return the state of the field.
  	 *
  	 *
  	 * Valid values:
  	 * "function" The function to call
  	 * "string" Function name, must be in global namespace (window["name"])
  	 * "object" A configuration object with method property being the function and optional error message.
  	 */
  var custom: js.UndefOr[js.Function | java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets/Sets date validation rule options. This can additionally help guide the [valueRange](ui.igvalidator#options:valueRange) validation.Note: Dependant on JavaScript Date parsing which will accept a wide range of values.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid JavaScript Date or can be parsed as one.
  	 * "object" A configuration object with optional error message (e.g. date: { errorMessage: "Enter a valid number"} )
  	 */
  var date: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets email validation rule options. Uses a RegExp defined in the "$.ui.igValidator.defaults" object.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be an email.
  	 * "object" A configuration object with optional error message (e.g. email: { errorMessage: "Enter a valid email"} )
  	 */
  var email: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets a requirement for the value in this field to be the same as another input element or editor control.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the target element
  	 * "object" A reference to the jQuery object for the target or an object with selector property and custom errorMessage.
  	 */
  var equalTo: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
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
  var executeAllRules: js.UndefOr[scala.Boolean] = js.undefined
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
  var language: js.UndefOr[java.lang.String] = js.undefined
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
  var messageTarget: js.UndefOr[stdLib.Element] = js.undefined
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
  var number: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when the editor loses focus.
  	 *
  	 */
  var onblur: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when the text in editor changes.
  	 * Note that this is more appropriate for selection controls such as checkbox, combo or rating.
  	 * As it can cause excessive messages with text-based fields, the initial validation can be delayed via the [threshold](ui.igvalidator#options:threshold) option.
  	 *
  	 */
  var onchange: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether validation is triggered when a form containing validation targets is submitting. If any of the validations fail, the submit action will be prevented.
  	 * Note that this doesn't apply to the native JavaScript submit function, but will handle the jQuery equivalent and the browser default action.
  	 *
  	 */
  var onsubmit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the option to show a label indication next to optional fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var optionalIndication: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets regular expression validation rule options.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A string containing regular expression.
  	 * "object" A RegExp object or an object with expression and errorMessage properties.
  	 */
  var pattern: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets/Sets option to validate if a value was entered (not empty text, selected item, etc.)
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field is required.
  	 * "object" A configuration object with optional error message (e.g. required: { errorMessage: "Error!"} )
  	 */
  var required: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
  	 * Gets/Sets the option to show an asterisks indication next to required fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var requiredIndication: js.UndefOr[scala.Boolean] = js.undefined
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
  var successMessage: js.UndefOr[java.lang.String] = js.undefined
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
  var threshold: js.UndefOr[scala.Double] = js.undefined
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

