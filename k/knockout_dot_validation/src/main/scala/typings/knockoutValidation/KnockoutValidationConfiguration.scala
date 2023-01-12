package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationConfiguration extends StObject {
  
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
  
  inline def apply(): KnockoutValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutValidationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowHtmlMessages(value: Boolean): Self = StObject.set(x, "allowHtmlMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowHtmlMessagesUndefined: Self = StObject.set(x, "allowHtmlMessages", js.undefined)
    
    inline def setDecorateElementOnModified(value: Boolean): Self = StObject.set(x, "decorateElementOnModified", value.asInstanceOf[js.Any])
    
    inline def setDecorateElementOnModifiedUndefined: Self = StObject.set(x, "decorateElementOnModified", js.undefined)
    
    inline def setDecorateInputElement(value: Boolean): Self = StObject.set(x, "decorateInputElement", value.asInstanceOf[js.Any])
    
    inline def setDecorateInputElementUndefined: Self = StObject.set(x, "decorateInputElement", js.undefined)
    
    inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
    
    inline def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
    
    inline def setErrorElementClass(value: String): Self = StObject.set(x, "errorElementClass", value.asInstanceOf[js.Any])
    
    inline def setErrorElementClassUndefined: Self = StObject.set(x, "errorElementClass", js.undefined)
    
    inline def setErrorMessageClass(value: String): Self = StObject.set(x, "errorMessageClass", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageClassUndefined: Self = StObject.set(x, "errorMessageClass", js.undefined)
    
    inline def setErrorsAsTitle(value: Boolean): Self = StObject.set(x, "errorsAsTitle", value.asInstanceOf[js.Any])
    
    inline def setErrorsAsTitleOnModified(value: Boolean): Self = StObject.set(x, "errorsAsTitleOnModified", value.asInstanceOf[js.Any])
    
    inline def setErrorsAsTitleOnModifiedUndefined: Self = StObject.set(x, "errorsAsTitleOnModified", js.undefined)
    
    inline def setErrorsAsTitleUndefined: Self = StObject.set(x, "errorsAsTitle", js.undefined)
    
    inline def setGrouping(value: KnockoutValidationGroupingOptions): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setHtml5InputTypes(value: js.Array[String]): Self = StObject.set(x, "html5InputTypes", value.asInstanceOf[js.Any])
    
    inline def setHtml5InputTypesUndefined: Self = StObject.set(x, "html5InputTypes", js.undefined)
    
    inline def setHtml5InputTypesVarargs(value: String*): Self = StObject.set(x, "html5InputTypes", js.Array(value*))
    
    inline def setInsertMessages(value: Boolean): Self = StObject.set(x, "insertMessages", value.asInstanceOf[js.Any])
    
    inline def setInsertMessagesUndefined: Self = StObject.set(x, "insertMessages", js.undefined)
    
    inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
    
    inline def setMessagesOnModified(value: Boolean): Self = StObject.set(x, "messagesOnModified", value.asInstanceOf[js.Any])
    
    inline def setMessagesOnModifiedUndefined: Self = StObject.set(x, "messagesOnModified", js.undefined)
    
    inline def setParseInputAttributes(value: Boolean): Self = StObject.set(x, "parseInputAttributes", value.asInstanceOf[js.Any])
    
    inline def setParseInputAttributesUndefined: Self = StObject.set(x, "parseInputAttributes", js.undefined)
    
    inline def setRegisterExtenders(value: Boolean): Self = StObject.set(x, "registerExtenders", value.asInstanceOf[js.Any])
    
    inline def setRegisterExtendersUndefined: Self = StObject.set(x, "registerExtenders", js.undefined)
    
    inline def setValidate(value: KnockoutValidationValidateOptions): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setWriteInputAttributes(value: Boolean): Self = StObject.set(x, "writeInputAttributes", value.asInstanceOf[js.Any])
    
    inline def setWriteInputAttributesUndefined: Self = StObject.set(x, "writeInputAttributes", js.undefined)
  }
}
