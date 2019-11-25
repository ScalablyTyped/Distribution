package typings.jqueryDotValidation.JQueryValidation

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jqueryDotValidation.JQuery
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * Enables debug mode. If true, the form is not submitted and certain errors are displayed on the console
    * (will check if a window.console property exists). Try to enable when a form is just submitted instead of validation stopping the submit.
    *
    * default: false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Use this class to create error labels, to look for existing error labels and to add it to invalid elements.
    *
    * default: "error"
    */
  var errorClass: js.UndefOr[String] = js.undefined
  /**
    * Hide and show this container when validating.
    */
  var errorContainer: js.UndefOr[String] = js.undefined
  /**
    * Use this element type to create error messages and to look for existing error messages. The default, "label",
    * has the advantage of creating a meaningful link between error message and invalid field using the for attribute (which is always used, regardless of element type).
    *
    * default: "label"
    */
  var errorElement: js.UndefOr[String] = js.undefined
  /**
    * Hide and show this container when validating. (eg "#messageBox")
    */
  var errorLabelContainer: js.UndefOr[String] = js.undefined
  /**
    * Customize placement of created error labels. First argument: The created error label as a jQuery object. Second argument: The invalid element as a jQuery object.
    *
    * default: Places the error label after the invalid element
    */
  var errorPlacement: js.UndefOr[js.Function2[/* error */ JQuery, /* element */ JQuery, Unit]] = js.undefined
  /**
    * If enabled, removes the errorClass from the invalid elements and hides all error messages whenever the element is focused.
    * Avoid combination with focusInvalid.
    *
    * default: false
    */
  var focusCleanup: js.UndefOr[Boolean] = js.undefined
  /**
    * Focus the last active or first invalid element on submit via validator.focusInvalid(). The last active element is the one
    * that had focus when the form was submitted, avoiding stealing its focus. If there was no element focused, the first one
    * in the form gets it, unless this option is turned off.
    *
    * default: true
    */
  var focusInvalid: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify grouping of error messages. A group consists of an arbitrary group name as the key and a space separated list of
    * element names as the value. Use errorPlacement to control where the group message is placed.
    */
  var groups: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * How to highlight invalid fields. Override to decide which fields and how to highlight.
    *
    * default: Adds errorClass (see the option) to the element
    */
  var highlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.undefined
  /**
    * Elements to ignore when validating, simply filtering them out. jQuery's not-method is used, therefore everything that is
    * accepted by not() can be passed as this option. Inputs of type submit and reset are always ignored, so are disabled elements.
    */
  var ignore: js.UndefOr[String] = js.undefined
  /**
    * Set to skip reading messages from the title attribute, helps to avoid issues with Google Toolbar; default is false for compability,
    * the message-from-title is likely to be completely removed in a future release.
    *
    * default: false
    */
  var ignoreTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback for custom code when an invalid form is submitted. Called with an event object as the first argument, and the validator
    * as the second.
    */
  var invalidHandler: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* validator */ Validator, Unit]] = js.undefined
  /**
    * Key/value pairs defining custom messages. Key is the name of an element, value the message to display for that element. Instead
    * of a plain message, another map with specific messages for each rule can be used. Overrides the title attribute of an element or
    * the default message for the method (in that order). Each message can be a String or a Callback. The callback is called in the scope
    * of the validator, with the rule's parameters as the first argument and the element as the second, and must return a String to display
    * as the message.
    *
    * default: the default message for the method used
    */
  var messages: js.UndefOr[js.Object] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
  /**
    * Boolean or Function. Validate checkboxes and radio buttons on click. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onclick: js.UndefOr[ShouldValidatePredicate] = js.undefined
  /**
    * Function. Validate elements when user focuses in. If omitted hides all other fields marked as invalid.
    *
    * Set to a custom Function to decide for yourself when to run validation.
    */
  var onfocusin: js.UndefOr[ValidatePredicate] = js.undefined
  /**
    * Boolean or Function. Validate elements (except checkboxes/radio buttons) on blur. If nothing is entered, all rules are skipped, except when the field was already marked as invalid.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onfocusout: js.UndefOr[ShouldValidatePredicate] = js.undefined
  /**
    * Boolean or Function. Validate elements on keyup. As long as the field is not marked as invalid, nothing happens.
    * Otherwise, all rules are checked on each key up event. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onkeyup: js.UndefOr[ShouldValidatePredicate] = js.undefined
  /**
    * Validate the form on submit. Set to false to use only other events for validation.
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    *
    * default: true
    */
  var onsubmit: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated,
    * which can be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages)
    * the default behaviour by calling this.defaultShowErrors().
    */
  var rules: js.UndefOr[RulesDictionary] = js.undefined
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated, which can
    * be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages) the default
    * behaviour by calling this.defaultShowErrors().
    */
  var showErrors: js.UndefOr[
    js.Function2[/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem], Unit]
  ] = js.undefined
  /**
    * Callback for handling the actual submit when the form is valid. Gets the form and the event object. Replaces the default submit.
    * The right place to submit a form via Ajax after it is validated.
    */
  var submitHandler: js.UndefOr[
    js.Function2[/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.undefined
  /**
    * String or Function. If specified, the error label is displayed to show a valid element. If a String is given, it is added as
    * a class to the label. If a Function is given, it is called with the label (as a jQuery object) and the validated input (as a DOM element).
    * The label can be used to add a text like "ok!".
    */
  var success: js.UndefOr[
    String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])
  ] = js.undefined
  /**
    * Called to revert changes made by option highlight, same arguments as highlight.
    *
    * default: Removes the errorClass
    */
  var unhighlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.undefined
  /**
    * This class is added to an element after it was validated and considered valid.
    *
    * default: "valid"
    */
  var validClass: js.UndefOr[String] = js.undefined
  /**
    * Wrap error labels with the specified element. Useful in combination with errorLabelContainer to create a list of error messages.
    *
    * default: window
    */
  var wrapper: js.UndefOr[String] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    errorClass: String = null,
    errorContainer: String = null,
    errorElement: String = null,
    errorLabelContainer: String = null,
    errorPlacement: (/* error */ JQuery, /* element */ JQuery) => Unit = null,
    focusCleanup: js.UndefOr[Boolean] = js.undefined,
    focusInvalid: js.UndefOr[Boolean] = js.undefined,
    groups: StringDictionary[String] = null,
    highlight: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit = null,
    ignore: String = null,
    ignoreTitle: js.UndefOr[Boolean] = js.undefined,
    invalidHandler: (/* event */ JQueryEventObject, /* validator */ Validator) => Unit = null,
    messages: js.Object = null,
    meta: String = null,
    onclick: ShouldValidatePredicate = null,
    onfocusin: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit = null,
    onfocusout: ShouldValidatePredicate = null,
    onkeyup: ShouldValidatePredicate = null,
    onsubmit: js.UndefOr[Boolean] = js.undefined,
    rules: RulesDictionary = null,
    showErrors: (/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem]) => Unit = null,
    submitHandler: (/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject]) => Unit = null,
    success: String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit]) = null,
    unhighlight: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit = null,
    validClass: String = null,
    wrapper: String = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass.asInstanceOf[js.Any])
    if (errorContainer != null) __obj.updateDynamic("errorContainer")(errorContainer.asInstanceOf[js.Any])
    if (errorElement != null) __obj.updateDynamic("errorElement")(errorElement.asInstanceOf[js.Any])
    if (errorLabelContainer != null) __obj.updateDynamic("errorLabelContainer")(errorLabelContainer.asInstanceOf[js.Any])
    if (errorPlacement != null) __obj.updateDynamic("errorPlacement")(js.Any.fromFunction2(errorPlacement))
    if (!js.isUndefined(focusCleanup)) __obj.updateDynamic("focusCleanup")(focusCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInvalid)) __obj.updateDynamic("focusInvalid")(focusInvalid.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction3(highlight))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTitle)) __obj.updateDynamic("ignoreTitle")(ignoreTitle.asInstanceOf[js.Any])
    if (invalidHandler != null) __obj.updateDynamic("invalidHandler")(js.Any.fromFunction2(invalidHandler))
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onfocusin != null) __obj.updateDynamic("onfocusin")(js.Any.fromFunction2(onfocusin))
    if (onfocusout != null) __obj.updateDynamic("onfocusout")(onfocusout.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (!js.isUndefined(onsubmit)) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (showErrors != null) __obj.updateDynamic("showErrors")(js.Any.fromFunction2(showErrors))
    if (submitHandler != null) __obj.updateDynamic("submitHandler")(js.Any.fromFunction2(submitHandler))
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (unhighlight != null) __obj.updateDynamic("unhighlight")(js.Any.fromFunction3(unhighlight))
    if (validClass != null) __obj.updateDynamic("validClass")(validClass.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

