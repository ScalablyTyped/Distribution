package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgValidatorOps[Self <: IgValidator] (val x: Self) extends AnyVal {
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
    def setCreditCard(value: Boolean | js.Object): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCard: Self = this.set("creditCard", js.undefined)
    @scala.inline
    def setCustom(value: js.Function | String | js.Object): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDate(value: Boolean | js.Object): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEmail(value: Boolean | js.Object): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEqualTo(value: String | js.Object): Self = this.set("equalTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualTo: Self = this.set("equalTo", js.undefined)
    @scala.inline
    def setError(value: (/* event */ Event, /* ui */ ErrorEventUIParam) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorHidden(value: (/* event */ Event, /* ui */ ErrorHiddenEventUIParam) => Unit): Self = this.set("errorHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHidden: Self = this.set("errorHidden", js.undefined)
    @scala.inline
    def setErrorHiding(value: (/* event */ Event, /* ui */ ErrorHidingEventUIParam) => Unit): Self = this.set("errorHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHiding: Self = this.set("errorHiding", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorShowing(value: (/* event */ Event, /* ui */ ErrorShowingEventUIParam) => Unit): Self = this.set("errorShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorShowing: Self = this.set("errorShowing", js.undefined)
    @scala.inline
    def setErrorShown(value: (/* event */ Event, /* ui */ ErrorShownEventUIParam) => Unit): Self = this.set("errorShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorShown: Self = this.set("errorShown", js.undefined)
    @scala.inline
    def setExecuteAllRules(value: Boolean): Self = this.set("executeAllRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteAllRules: Self = this.set("executeAllRules", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: IgValidatorField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[IgValidatorField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormError(value: (/* event */ Event, /* ui */ FormErrorEventUIParam) => Unit): Self = this.set("formError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormError: Self = this.set("formError", js.undefined)
    @scala.inline
    def setFormSuccess(value: (/* event */ Event, /* ui */ FormSuccessEventUIParam) => Unit): Self = this.set("formSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormSuccess: Self = this.set("formSuccess", js.undefined)
    @scala.inline
    def setFormValidated(value: (/* event */ Event, /* ui */ FormValidatedEventUIParam) => Unit): Self = this.set("formValidated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormValidated: Self = this.set("formValidated", js.undefined)
    @scala.inline
    def setFormValidating(value: (/* event */ Event, /* ui */ FormValidatingEventUIParam) => Unit): Self = this.set("formValidating", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormValidating: Self = this.set("formValidating", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLengthRangeVarargs(value: js.Any*): Self = this.set("lengthRange", js.Array(value :_*))
    @scala.inline
    def setLengthRange(value: js.Array[_] | js.Object): Self = this.set("lengthRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthRange: Self = this.set("lengthRange", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMessageTarget(value: Element): Self = this.set("messageTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTarget: Self = this.set("messageTarget", js.undefined)
    @scala.inline
    def setNotificationOptions(value: js.Any): Self = this.set("notificationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationOptions: Self = this.set("notificationOptions", js.undefined)
    @scala.inline
    def setNumber(value: Boolean | js.Object): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOnblur(value: Boolean): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOnchange(value: Boolean): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnsubmit(value: Boolean): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOptionalIndication(value: Boolean): Self = this.set("optionalIndication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalIndication: Self = this.set("optionalIndication", js.undefined)
    @scala.inline
    def setPattern(value: String | js.Object): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRequired(value: Boolean | js.Object): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRequiredIndication(value: Boolean): Self = this.set("requiredIndication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredIndication: Self = this.set("requiredIndication", js.undefined)
    @scala.inline
    def setSuccess(value: (/* event */ Event, /* ui */ SuccessEventUIParam) => Unit): Self = this.set("success", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setSuccessHidden(value: (/* event */ Event, /* ui */ SuccessHiddenEventUIParam) => Unit): Self = this.set("successHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccessHidden: Self = this.set("successHidden", js.undefined)
    @scala.inline
    def setSuccessHiding(value: (/* event */ Event, /* ui */ SuccessHidingEventUIParam) => Unit): Self = this.set("successHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccessHiding: Self = this.set("successHiding", js.undefined)
    @scala.inline
    def setSuccessMessage(value: String): Self = this.set("successMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessMessage: Self = this.set("successMessage", js.undefined)
    @scala.inline
    def setSuccessShowing(value: (/* event */ Event, /* ui */ SuccessShowingEventUIParam) => Unit): Self = this.set("successShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccessShowing: Self = this.set("successShowing", js.undefined)
    @scala.inline
    def setSuccessShown(value: (/* event */ Event, /* ui */ SuccessShownEventUIParam) => Unit): Self = this.set("successShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccessShown: Self = this.set("successShown", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setValidated(value: (/* event */ Event, /* ui */ ValidatedEventUIParam) => Unit): Self = this.set("validated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidated: Self = this.set("validated", js.undefined)
    @scala.inline
    def setValidating(value: (/* event */ Event, /* ui */ ValidatingEventUIParam) => Unit): Self = this.set("validating", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidating: Self = this.set("validating", js.undefined)
    @scala.inline
    def setValueRangeVarargs(value: js.Any*): Self = this.set("valueRange", js.Array(value :_*))
    @scala.inline
    def setValueRange(value: js.Array[_] | js.Object): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
  
}

