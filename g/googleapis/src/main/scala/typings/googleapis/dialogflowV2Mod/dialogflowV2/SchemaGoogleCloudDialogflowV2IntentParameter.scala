package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents intent parameters.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentParameter extends StObject {
  
  /**
    * Optional. The default value to use when the `value` yields an empty
    * result. Default values can be extracted from contexts by using the
    * following syntax: `#context_name.parameter_name`.
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the parameter.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the entity type, prefixed with `@`, that describes
    * values of the parameter. If the parameter is required, this must be
    * provided.
    */
  var entityTypeDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Optional. Indicates whether the parameter represents a list of values.
    */
  var isList: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Indicates whether the parameter is required. That is, whether
    * the intent cannot be completed without collecting the parameter value.
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique identifier of this parameter.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The collection of prompts that the agent can present to the
    * user in order to collect value for the parameter.
    */
  var prompts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The definition of the parameter value. It can be: - a constant
    * string, - a parameter value defined as `$parameter_name`, - an original
    * parameter value defined as `$parameter_name.original`, - a parameter
    * value from some context defined as   `#context_name.parameter_name`.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentParameter {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentParameter]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentParameterMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEntityTypeDisplayName(value: String): Self = StObject.set(x, "entityTypeDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeDisplayNameUndefined: Self = StObject.set(x, "entityTypeDisplayName", js.undefined)
    
    @scala.inline
    def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrompts(value: js.Array[String]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    
    @scala.inline
    def setPromptsVarargs(value: String*): Self = StObject.set(x, "prompts", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
