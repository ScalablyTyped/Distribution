package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidator
  extends /**
  * Option for JSONPDataSourceSettings
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
  var creditCard: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * Gets/Sets a custom function to perform validation. Use 'this' to reference the calling validator and the value and optional field settings arguments to determine and return the state of the field.
    *
    *
    * Valid values:
    * "function" The function to call
    * "string" Function name, must be in global namespace (window["name"])
    * "object" A configuration object with method property being the function and optional error message.
    */
  var custom: js.UndefOr[js.Function | String | js.Object] = js.native
  
  /**
    * Gets/Sets date validation rule options. This can additionally help guide the [valueRange](ui.igvalidator#options:valueRange) validation.Note: Dependant on JavaScript Date parsing which will accept a wide range of values.
    *
    *
    * Valid values:
    * "boolean" A boolean value indicating if the field should be a valid JavaScript Date or can be parsed as one.
    * "object" A configuration object with optional error message (e.g. date: { errorMessage: "Enter a valid number"} )
    */
  var date: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * Gets/Sets email validation rule options. Uses a RegExp defined in the "$.ui.igValidator.defaults" object.
    *
    *
    * Valid values:
    * "boolean" A boolean value indicating if the field should be an email.
    * "object" A configuration object with optional error message (e.g. email: { errorMessage: "Enter a valid email"} )
    */
  var email: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * Gets/Sets a requirement for the value in this field to be the same as another input element or editor control.
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the target element
    * "object" A reference to the jQuery object for the target or an object with selector property and custom errorMessage.
    */
  var equalTo: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Event raised for invalid field after value was validated but before any action takes effect.
    * Function takes arguments evt and ui.
    */
  var error: js.UndefOr[ErrorEvent] = js.native
  
  /**
    * Event which is raised after error message was hidden.
    *
    * Function takes arguments evt and ui.
    */
  var errorHidden: js.UndefOr[ErrorHiddenEvent] = js.native
  
  /**
    * Event which is raised before error message is hidden.
    * Return false in order to keep the error message displayed.
    *
    * Function takes arguments evt and ui.
    */
  var errorHiding: js.UndefOr[ErrorHidingEvent] = js.native
  
  /**
    * Gets/Sets text for an error message to be used if none is set for the particular rule. Overrides default rule-specific error messages.
    *
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * Event which is raised before error message is displayed.
    * Return false in order to prevent error message display.
    *
    * Function takes arguments evt and ui.
    */
  var errorShowing: js.UndefOr[ErrorShowingEvent] = js.native
  
  /**
    * Event which is raised after error message was displayed.
    *
    * Function takes arguments evt and ui.
    */
  var errorShown: js.UndefOr[ErrorShownEvent] = js.native
  
  /**
    * Gets/Sets if all rules for a field should be checked, so even if one fails the rest will continue executing.
    * Note: This will not force checks on an empty field for rules that don't normally execute without a value.
    *
    */
  var executeAllRules: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a list of target field items describing each with validation options and a required selector. Fields can contain any of the validation rules and triggers but not other fields or event handlers.
    * Applicable options are also inherited from the global control configuration if not set.
    *
    */
  var fields: js.UndefOr[js.Array[IgValidatorField]] = js.native
  
  /**
    * Event triggered on Validator instance level after failed validation on form submit event.
    *
    * Function takes arguments evt and ui.
    */
  var formError: js.UndefOr[FormErrorEvent] = js.native
  
  /**
    * Event triggered on Validator instance level after successful validation on form submit event.
    *
    * Function takes arguments evt and ui.
    */
  var formSuccess: js.UndefOr[FormSuccessEvent] = js.native
  
  /**
    * Event triggered on Validator instance level after validation on form submit event..
    *
    * Function takes arguments evt and ui.
    */
  var formValidated: js.UndefOr[FormValidatedEvent] = js.native
  
  /**
    * Event triggered on Validator instance level before handling a form submit event.
    * Return false to cancel to skip validating and potentially allow the submit if no other other validators return error.
    *
    * Function takes arguments evt and ui.
    */
  var formValidating: js.UndefOr[FormValidatingEvent] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets a minimum and/or maximum length of text or number of selected items. Null or 0 values are ignored.
    *
    *
    * Valid values:
    * "array" An array of two numbers, where the first value is the minimum and the second is the maximum. (e.g. lengthRange: [ 1, 10] )
    * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Password must be at least {0} long and no more than {1}." } )
    */
  var lengthRange: js.UndefOr[js.Array[_] | js.Object] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets a custom jQuery element to be used for validation messages. That inner HTML of the target is modified, can be a SPAN, LABEL or DIV.
    *
    */
  var messageTarget: js.UndefOr[Element] = js.native
  
  /**
    * Gets/Sets the options for the [igNotifier](ui.ignotifier#options) used to show error messages.
    *
    */
  var notificationOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets number validation rule options.Default separators for decimals and thousands are '.' and ',' respectively and are defined in the "$.ui.igValidator.defaults" object.
    *
    *
    * Valid values:
    * "boolean" A boolean value indicating if the field should be a number. Default separators are used.
    * "object" A configuration object with errorMessage, decimalSeparator and thousandsSeparator. Those properties are all optional.
    */
  var number: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * Gets/Sets whether validation is triggered when the editor loses focus.
    *
    */
  var onblur: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether validation is triggered when the text in editor changes.
    * Note that this is more appropriate for selection controls such as checkbox, combo or rating.
    * As it can cause excessive messages with text-based fields, the initial validation can be delayed via the [threshold](ui.igvalidator#options:threshold) option.
    *
    */
  var onchange: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether validation is triggered when a form containing validation targets is submitting. If any of the validations fail, the submit action will be prevented.
    * Note that this doesn't apply to the native JavaScript submit function, but will handle the jQuery equivalent and the browser default action.
    *
    */
  var onsubmit: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the option to show a label indication next to optional fields.
    * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
    *
    */
  var optionalIndication: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets regular expression validation rule options.
    *
    *
    * Valid values:
    * "string" A string containing regular expression.
    * "object" A RegExp object or an object with expression and errorMessage properties.
    */
  var pattern: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Gets/Sets option to validate if a value was entered (not empty text, selected item, etc.)
    *
    *
    * Valid values:
    * "boolean" A boolean value indicating if the field is required.
    * "object" A configuration object with optional error message (e.g. required: { errorMessage: "Error!"} )
    */
  var required: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * Gets/Sets the option to show an asterisks indication next to required fields.
    * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
    *
    */
  var requiredIndication: js.UndefOr[Boolean] = js.native
  
  /**
    * Event raised for valid field after value was validated but before any action takes effect.
    * Function takes arguments evt and ui.
    */
  var success: js.UndefOr[SuccessEvent] = js.native
  
  /**
    * Event which is raised after success message was hidden.
    *
    * Function takes arguments evt and ui.
    */
  var successHidden: js.UndefOr[SuccessHiddenEvent] = js.native
  
  /**
    * Event which is raised before success message is hidden.
    * Return false in order to keep success message displayed.
    *
    * Function takes arguments evt and ui.
    */
  var successHiding: js.UndefOr[SuccessHidingEvent] = js.native
  
  /**
    * Gets/Sets text for a success message. Note that since there is no default, setting this message will enable showing success indication.
    *
    */
  var successMessage: js.UndefOr[String] = js.native
  
  /**
    * Event which is raised before success message is displayed.
    * Return false in order to prevent success message display.
    *
    * Function takes arguments evt and ui.
    */
  var successShowing: js.UndefOr[SuccessShowingEvent] = js.native
  
  /**
    * Event which is raised after success message was displayed.
    *
    * Function takes arguments evt and ui.
    */
  var successShown: js.UndefOr[SuccessShownEvent] = js.native
  
  /**
    * Gets/Sets validation minimum input length. Validation won't be triggered for input before that value is reached on change and focus loss.
    * Note: This will not affect required fields on form submit.
    *
    */
  var threshold: js.UndefOr[Double] = js.native
  
  /**
    * Event which is raised after value was validated but before any action takes effect.
    *
    * Function takes arguments evt and ui.
    */
  var validated: js.UndefOr[ValidatedEvent] = js.native
  
  /**
    * Event which is raised on validation before default validation logic is applied.
    * Return false in order to cancel the event and consider the field valid.
    *
    * Function takes arguments evt and ui.
    */
  var validating: js.UndefOr[ValidatingEvent] = js.native
  
  /**
    * Gets/Sets a minimum and/or maximum value. Null values are ignored.
    *
    *
    * Valid values:
    * "array" An array of two numbers or dates, where the first is the minimum and the second is the maximum. (e.g. valueRange: [ 1, 10] )
    * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Value must be between {0} and {1}." } )
    */
  var valueRange: js.UndefOr[js.Array[_] | js.Object] = js.native
}
object IgValidator {
  
  @scala.inline
  def apply(): IgValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgValidator]
  }
  
  @scala.inline
  implicit class IgValidatorMutableBuilder[Self <: IgValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreditCard(value: Boolean | js.Object): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Function | String | js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDate(value: Boolean | js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEmail(value: Boolean | js.Object): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEqualTo(value: String | js.Object): Self = StObject.set(x, "equalTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualToUndefined: Self = StObject.set(x, "equalTo", js.undefined)
    
    @scala.inline
    def setError(value: (/* event */ Event, /* ui */ ErrorEventUIParam) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHidden(value: (/* event */ Event, /* ui */ ErrorHiddenEventUIParam) => Unit): Self = StObject.set(x, "errorHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHiddenUndefined: Self = StObject.set(x, "errorHidden", js.undefined)
    
    @scala.inline
    def setErrorHiding(value: (/* event */ Event, /* ui */ ErrorHidingEventUIParam) => Unit): Self = StObject.set(x, "errorHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHidingUndefined: Self = StObject.set(x, "errorHiding", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorShowing(value: (/* event */ Event, /* ui */ ErrorShowingEventUIParam) => Unit): Self = StObject.set(x, "errorShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorShowingUndefined: Self = StObject.set(x, "errorShowing", js.undefined)
    
    @scala.inline
    def setErrorShown(value: (/* event */ Event, /* ui */ ErrorShownEventUIParam) => Unit): Self = StObject.set(x, "errorShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorShownUndefined: Self = StObject.set(x, "errorShown", js.undefined)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExecuteAllRules(value: Boolean): Self = StObject.set(x, "executeAllRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteAllRulesUndefined: Self = StObject.set(x, "executeAllRules", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[IgValidatorField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: IgValidatorField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFormError(value: (/* event */ Event, /* ui */ FormErrorEventUIParam) => Unit): Self = StObject.set(x, "formError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormErrorUndefined: Self = StObject.set(x, "formError", js.undefined)
    
    @scala.inline
    def setFormSuccess(value: (/* event */ Event, /* ui */ FormSuccessEventUIParam) => Unit): Self = StObject.set(x, "formSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormSuccessUndefined: Self = StObject.set(x, "formSuccess", js.undefined)
    
    @scala.inline
    def setFormValidated(value: (/* event */ Event, /* ui */ FormValidatedEventUIParam) => Unit): Self = StObject.set(x, "formValidated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormValidatedUndefined: Self = StObject.set(x, "formValidated", js.undefined)
    
    @scala.inline
    def setFormValidating(value: (/* event */ Event, /* ui */ FormValidatingEventUIParam) => Unit): Self = StObject.set(x, "formValidating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormValidatingUndefined: Self = StObject.set(x, "formValidating", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLengthRange(value: js.Array[_] | js.Object): Self = StObject.set(x, "lengthRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthRangeUndefined: Self = StObject.set(x, "lengthRange", js.undefined)
    
    @scala.inline
    def setLengthRangeVarargs(value: js.Any*): Self = StObject.set(x, "lengthRange", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMessageTarget(value: Element): Self = StObject.set(x, "messageTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTargetUndefined: Self = StObject.set(x, "messageTarget", js.undefined)
    
    @scala.inline
    def setNotificationOptions(value: js.Any): Self = StObject.set(x, "notificationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationOptionsUndefined: Self = StObject.set(x, "notificationOptions", js.undefined)
    
    @scala.inline
    def setNumber(value: Boolean | js.Object): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOnblur(value: Boolean): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    @scala.inline
    def setOnchange(value: Boolean): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    @scala.inline
    def setOnsubmit(value: Boolean): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
    
    @scala.inline
    def setOptionalIndication(value: Boolean): Self = StObject.set(x, "optionalIndication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalIndicationUndefined: Self = StObject.set(x, "optionalIndication", js.undefined)
    
    @scala.inline
    def setPattern(value: String | js.Object): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean | js.Object): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredIndication(value: Boolean): Self = StObject.set(x, "requiredIndication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredIndicationUndefined: Self = StObject.set(x, "requiredIndication", js.undefined)
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* event */ Event, /* ui */ SuccessEventUIParam) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccessHidden(value: (/* event */ Event, /* ui */ SuccessHiddenEventUIParam) => Unit): Self = StObject.set(x, "successHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccessHiddenUndefined: Self = StObject.set(x, "successHidden", js.undefined)
    
    @scala.inline
    def setSuccessHiding(value: (/* event */ Event, /* ui */ SuccessHidingEventUIParam) => Unit): Self = StObject.set(x, "successHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccessHidingUndefined: Self = StObject.set(x, "successHiding", js.undefined)
    
    @scala.inline
    def setSuccessMessage(value: String): Self = StObject.set(x, "successMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessMessageUndefined: Self = StObject.set(x, "successMessage", js.undefined)
    
    @scala.inline
    def setSuccessShowing(value: (/* event */ Event, /* ui */ SuccessShowingEventUIParam) => Unit): Self = StObject.set(x, "successShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccessShowingUndefined: Self = StObject.set(x, "successShowing", js.undefined)
    
    @scala.inline
    def setSuccessShown(value: (/* event */ Event, /* ui */ SuccessShownEventUIParam) => Unit): Self = StObject.set(x, "successShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccessShownUndefined: Self = StObject.set(x, "successShown", js.undefined)
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setValidated(value: (/* event */ Event, /* ui */ ValidatedEventUIParam) => Unit): Self = StObject.set(x, "validated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
    
    @scala.inline
    def setValidating(value: (/* event */ Event, /* ui */ ValidatingEventUIParam) => Unit): Self = StObject.set(x, "validating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
    
    @scala.inline
    def setValueRange(value: js.Array[_] | js.Object): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    @scala.inline
    def setValueRangeVarargs(value: js.Any*): Self = StObject.set(x, "valueRange", js.Array(value :_*))
  }
}
