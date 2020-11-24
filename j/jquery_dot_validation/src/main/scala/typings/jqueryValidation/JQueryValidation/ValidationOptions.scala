package typings.jqueryValidation.JQueryValidation

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jqueryValidation.JQuery
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends js.Object {
  
  /**
    * Enables debug mode. If true, the form is not submitted and certain errors are displayed on the console
    * (will check if a window.console property exists). Try to enable when a form is just submitted instead of validation stopping the submit.
    *
    * default: false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Use this class to create error labels, to look for existing error labels and to add it to invalid elements.
    *
    * default: "error"
    */
  var errorClass: js.UndefOr[String] = js.native
  
  /**
    * Hide and show this container when validating.
    */
  var errorContainer: js.UndefOr[String] = js.native
  
  /**
    * Use this element type to create error messages and to look for existing error messages. The default, "label",
    * has the advantage of creating a meaningful link between error message and invalid field using the for attribute (which is always used, regardless of element type).
    *
    * default: "label"
    */
  var errorElement: js.UndefOr[String] = js.native
  
  /**
    * Hide and show this container when validating. (eg "#messageBox")
    */
  var errorLabelContainer: js.UndefOr[String] = js.native
  
  /**
    * Customize placement of created error labels. First argument: The created error label as a jQuery object. Second argument: The invalid element as a jQuery object.
    *
    * default: Places the error label after the invalid element
    */
  var errorPlacement: js.UndefOr[js.Function2[/* error */ JQuery, /* element */ JQuery, Unit]] = js.native
  
  /**
    * If enabled, removes the errorClass from the invalid elements and hides all error messages whenever the element is focused.
    * Avoid combination with focusInvalid.
    *
    * default: false
    */
  var focusCleanup: js.UndefOr[Boolean] = js.native
  
  /**
    * Focus the last active or first invalid element on submit via validator.focusInvalid(). The last active element is the one
    * that had focus when the form was submitted, avoiding stealing its focus. If there was no element focused, the first one
    * in the form gets it, unless this option is turned off.
    *
    * default: true
    */
  var focusInvalid: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify grouping of error messages. A group consists of an arbitrary group name as the key and a space separated list of
    * element names as the value. Use errorPlacement to control where the group message is placed.
    */
  var groups: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * How to highlight invalid fields. Override to decide which fields and how to highlight.
    *
    * default: Adds errorClass (see the option) to the element
    */
  var highlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.native
  
  /**
    * Elements to ignore when validating, simply filtering them out. jQuery's not-method is used, therefore everything that is
    * accepted by not() can be passed as this option. Inputs of type submit and reset are always ignored, so are disabled elements.
    */
  var ignore: js.UndefOr[String] = js.native
  
  /**
    * Set to skip reading messages from the title attribute, helps to avoid issues with Google Toolbar; default is false for compability,
    * the message-from-title is likely to be completely removed in a future release.
    *
    * default: false
    */
  var ignoreTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback for custom code when an invalid form is submitted. Called with an event object as the first argument, and the validator
    * as the second.
    */
  var invalidHandler: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* validator */ Validator, Unit]] = js.native
  
  /**
    * Key/value pairs defining custom messages. Key is the name of an element, value the message to display for that element. Instead
    * of a plain message, another map with specific messages for each rule can be used. Overrides the title attribute of an element or
    * the default message for the method (in that order). Each message can be a String or a Callback. The callback is called in the scope
    * of the validator, with the rule's parameters as the first argument and the element as the second, and must return a String to display
    * as the message.
    *
    * default: the default message for the method used
    */
  var messages: js.UndefOr[js.Object] = js.native
  
  var meta: js.UndefOr[String] = js.native
  
  /**
    * Boolean or Function. Validate checkboxes and radio buttons on click. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onclick: js.UndefOr[ShouldValidatePredicate] = js.native
  
  /**
    * Function. Validate elements when user focuses in. If omitted hides all other fields marked as invalid.
    *
    * Set to a custom Function to decide for yourself when to run validation.
    */
  var onfocusin: js.UndefOr[ValidatePredicate] = js.native
  
  /**
    * Boolean or Function. Validate elements (except checkboxes/radio buttons) on blur. If nothing is entered, all rules are skipped, except when the field was already marked as invalid.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onfocusout: js.UndefOr[ShouldValidatePredicate] = js.native
  
  /**
    * Boolean or Function. Validate elements on keyup. As long as the field is not marked as invalid, nothing happens.
    * Otherwise, all rules are checked on each key up event. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onkeyup: js.UndefOr[ShouldValidatePredicate] = js.native
  
  /**
    * Validate the form on submit. Set to false to use only other events for validation.
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    *
    * default: true
    */
  var onsubmit: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated,
    * which can be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages)
    * the default behaviour by calling this.defaultShowErrors().
    */
  var rules: js.UndefOr[RulesDictionary] = js.native
  
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated, which can
    * be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages) the default
    * behaviour by calling this.defaultShowErrors().
    */
  var showErrors: js.UndefOr[
    js.Function2[/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem], Unit]
  ] = js.native
  
  /**
    * Callback for handling the actual submit when the form is valid. Gets the form and the event object. Replaces the default submit.
    * The right place to submit a form via Ajax after it is validated.
    */
  var submitHandler: js.UndefOr[
    js.Function2[/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.native
  
  /**
    * String or Function. If specified, the error label is displayed to show a valid element. If a String is given, it is added as
    * a class to the label. If a Function is given, it is called with the label (as a jQuery object) and the validated input (as a DOM element).
    * The label can be used to add a text like "ok!".
    */
  var success: js.UndefOr[
    String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])
  ] = js.native
  
  /**
    * Called to revert changes made by option highlight, same arguments as highlight.
    *
    * default: Removes the errorClass
    */
  var unhighlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.native
  
  /**
    * This class is added to an element after it was validated and considered valid.
    *
    * default: "valid"
    */
  var validClass: js.UndefOr[String] = js.native
  
  /**
    * Wrap error labels with the specified element. Useful in combination with errorLabelContainer to create a list of error messages.
    *
    * default: window
    */
  var wrapper: js.UndefOr[String] = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setErrorClass(value: String): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorClass: Self = this.set("errorClass", js.undefined)
    
    @scala.inline
    def setErrorContainer(value: String): Self = this.set("errorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorContainer: Self = this.set("errorContainer", js.undefined)
    
    @scala.inline
    def setErrorElement(value: String): Self = this.set("errorElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorElement: Self = this.set("errorElement", js.undefined)
    
    @scala.inline
    def setErrorLabelContainer(value: String): Self = this.set("errorLabelContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorLabelContainer: Self = this.set("errorLabelContainer", js.undefined)
    
    @scala.inline
    def setErrorPlacement(value: (/* error */ JQuery, /* element */ JQuery) => Unit): Self = this.set("errorPlacement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteErrorPlacement: Self = this.set("errorPlacement", js.undefined)
    
    @scala.inline
    def setFocusCleanup(value: Boolean): Self = this.set("focusCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusCleanup: Self = this.set("focusCleanup", js.undefined)
    
    @scala.inline
    def setFocusInvalid(value: Boolean): Self = this.set("focusInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusInvalid: Self = this.set("focusInvalid", js.undefined)
    
    @scala.inline
    def setGroups(value: StringDictionary[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = this.set("highlight", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreTitle(value: Boolean): Self = this.set("ignoreTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTitle: Self = this.set("ignoreTitle", js.undefined)
    
    @scala.inline
    def setInvalidHandler(value: (/* event */ JQueryEventObject, /* validator */ Validator) => Unit): Self = this.set("invalidHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInvalidHandler: Self = this.set("invalidHandler", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Object): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setOnclickFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = this.set("onclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnclick(value: ShouldValidatePredicate): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOnfocusin(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = this.set("onfocusin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnfocusin: Self = this.set("onfocusin", js.undefined)
    
    @scala.inline
    def setOnfocusoutFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = this.set("onfocusout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnfocusout(value: ShouldValidatePredicate): Self = this.set("onfocusout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfocusout: Self = this.set("onfocusout", js.undefined)
    
    @scala.inline
    def setOnkeyupFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = this.set("onkeyup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnkeyup(value: ShouldValidatePredicate): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    
    @scala.inline
    def setOnsubmit(value: Boolean): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    
    @scala.inline
    def setRules(value: RulesDictionary): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setShowErrors(value: (/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem]) => Unit): Self = this.set("showErrors", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShowErrors: Self = this.set("showErrors", js.undefined)
    
    @scala.inline
    def setSubmitHandler(value: (/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = this.set("submitHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSubmitHandler: Self = this.set("submitHandler", js.undefined)
    
    @scala.inline
    def setSuccessFunction2(value: (/* $label */ JQuery, /* validatedInput */ HTMLElement) => Unit): Self = this.set("success", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setUnhighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = this.set("unhighlight", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnhighlight: Self = this.set("unhighlight", js.undefined)
    
    @scala.inline
    def setValidClass(value: String): Self = this.set("validClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidClass: Self = this.set("validClass", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
