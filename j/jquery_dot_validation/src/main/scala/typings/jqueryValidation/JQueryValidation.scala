package typings.jqueryValidation

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryValidation {
  
  type ErrorDictionary = StringDictionary[String]
  
  trait ErrorListItem extends StObject {
    
    var element: HTMLElement
    
    var message: String
  }
  object ErrorListItem {
    
    inline def apply(element: HTMLElement, message: String): ErrorListItem = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorListItem]
    }
    
    extension [Self <: ErrorListItem](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type RulesDictionary = StringDictionary[Any]
  
  type ShouldValidatePredicate = Boolean | ValidatePredicate
  
  type ValidatePredicate = js.Function2[/* element */ HTMLElement, /* event */ JQueryEventObject, Unit]
  
  trait ValidationOptions extends StObject {
    
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
    
    inline def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    extension [Self <: ValidationOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
      
      inline def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
      
      inline def setErrorContainer(value: String): Self = StObject.set(x, "errorContainer", value.asInstanceOf[js.Any])
      
      inline def setErrorContainerUndefined: Self = StObject.set(x, "errorContainer", js.undefined)
      
      inline def setErrorElement(value: String): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setErrorLabelContainer(value: String): Self = StObject.set(x, "errorLabelContainer", value.asInstanceOf[js.Any])
      
      inline def setErrorLabelContainerUndefined: Self = StObject.set(x, "errorLabelContainer", js.undefined)
      
      inline def setErrorPlacement(value: (/* error */ JQuery, /* element */ JQuery) => Unit): Self = StObject.set(x, "errorPlacement", js.Any.fromFunction2(value))
      
      inline def setErrorPlacementUndefined: Self = StObject.set(x, "errorPlacement", js.undefined)
      
      inline def setFocusCleanup(value: Boolean): Self = StObject.set(x, "focusCleanup", value.asInstanceOf[js.Any])
      
      inline def setFocusCleanupUndefined: Self = StObject.set(x, "focusCleanup", js.undefined)
      
      inline def setFocusInvalid(value: Boolean): Self = StObject.set(x, "focusInvalid", value.asInstanceOf[js.Any])
      
      inline def setFocusInvalidUndefined: Self = StObject.set(x, "focusInvalid", js.undefined)
      
      inline def setGroups(value: StringDictionary[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setHighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTitle(value: Boolean): Self = StObject.set(x, "ignoreTitle", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTitleUndefined: Self = StObject.set(x, "ignoreTitle", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setInvalidHandler(value: (/* event */ JQueryEventObject, /* validator */ Validator) => Unit): Self = StObject.set(x, "invalidHandler", js.Any.fromFunction2(value))
      
      inline def setInvalidHandlerUndefined: Self = StObject.set(x, "invalidHandler", js.undefined)
      
      inline def setMessages(value: js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOnclick(value: ShouldValidatePredicate): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOnfocusin(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onfocusin", js.Any.fromFunction2(value))
      
      inline def setOnfocusinUndefined: Self = StObject.set(x, "onfocusin", js.undefined)
      
      inline def setOnfocusout(value: ShouldValidatePredicate): Self = StObject.set(x, "onfocusout", value.asInstanceOf[js.Any])
      
      inline def setOnfocusoutFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onfocusout", js.Any.fromFunction2(value))
      
      inline def setOnfocusoutUndefined: Self = StObject.set(x, "onfocusout", js.undefined)
      
      inline def setOnkeyup(value: ShouldValidatePredicate): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onkeyup", js.Any.fromFunction2(value))
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnsubmit(value: Boolean): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setRules(value: RulesDictionary): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setShowErrors(value: (/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem]) => Unit): Self = StObject.set(x, "showErrors", js.Any.fromFunction2(value))
      
      inline def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      inline def setSubmitHandler(value: (/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = StObject.set(x, "submitHandler", js.Any.fromFunction2(value))
      
      inline def setSubmitHandlerUndefined: Self = StObject.set(x, "submitHandler", js.undefined)
      
      inline def setSuccess(value: String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessFunction2(value: (/* $label */ JQuery, /* validatedInput */ HTMLElement) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setUnhighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = StObject.set(x, "unhighlight", js.Any.fromFunction3(value))
      
      inline def setUnhighlightUndefined: Self = StObject.set(x, "unhighlight", js.undefined)
      
      inline def setValidClass(value: String): Self = StObject.set(x, "validClass", value.asInstanceOf[js.Any])
      
      inline def setValidClassUndefined: Self = StObject.set(x, "validClass", js.undefined)
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Validator extends StObject {
    
    def checkForm(): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def element(element: String): Boolean = js.native
    def element(element: JQuery): Boolean = js.native
    
    def elementValue(element: Element): Any = js.native
    
    var errorList: js.Array[ErrorListItem] = js.native
    
    var errorMap: ErrorDictionary = js.native
    
    def focusInvalid(): Unit = js.native
    
    /**
      * Validates the form, returns true if it is valid, false otherwise.
      */
    def form(): Boolean = js.native
    
    def hideErrors(): Unit = js.native
    
    def invalidElements(): js.Array[HTMLElement] = js.native
    
    /**
      * Returns the number of invalid fields.
      */
    def numberOfInvalids(): Double = js.native
    
    /**
      * Resets the controlled form.
      */
    def resetForm(): Unit = js.native
    
    var settings: ValidationOptions = js.native
    
    /**
      * Show the specified messages.
      *
      * @param errors One or more key/value pairs of input names and messages.
      */
    def showErrors(errors: Any): Unit = js.native
    
    def size(): Double = js.native
    
    def valid(): Boolean = js.native
    
    def validElements(): js.Array[HTMLElement] = js.native
  }
  
  @js.native
  trait ValidatorStatic extends StObject {
    
    /**
      * Add a compound class method - useful to refactor common combinations of rules into a single class.
      *
      * @param name The name of the class rule to add
      * @param rules The compound rules
      */
    def addClassRules(name: String, rules: RulesDictionary): Unit = js.native
    /**
      * Add a compound class method - useful to refactor common combinations of rules into a single class.
      *
      * @param rules A map of className-rules pairs
      */
    def addClassRules(rules: RulesDictionary): Unit = js.native
    
    /**
      * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
      *
      * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
      * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
      * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
      */
    def addMethod(
      name: String,
      method: js.Function3[/* value */ Any, /* element */ HTMLElement, /* params */ Any, Boolean]
    ): Unit = js.native
    def addMethod(
      name: String,
      method: js.Function3[/* value */ Any, /* element */ HTMLElement, /* params */ Any, Boolean],
      message: String
    ): Unit = js.native
    def addMethod(
      name: String,
      method: js.Function3[/* value */ Any, /* element */ HTMLElement, /* params */ Any, Boolean],
      message: js.Function2[/* params */ Any, /* element */ HTMLElement, String]
    ): Unit = js.native
    
    /**
      * Replaces {n} placeholders with arguments.
      *
      * @param template The string to format.
      */
    def format(template: String): js.Function1[/* repeated */ Any, String] = js.native
    def format(template: String, args: Any*): String = js.native
    
    var messages: StringDictionary[String] = js.native
    
    var methods: StringDictionary[js.Function] = js.native
    
    /**
      * Modify default settings for validation.
      *
      * @param options Options to set as default.
      */
    def setDefaults(defaults: ValidationOptions): Unit = js.native
  }
}
