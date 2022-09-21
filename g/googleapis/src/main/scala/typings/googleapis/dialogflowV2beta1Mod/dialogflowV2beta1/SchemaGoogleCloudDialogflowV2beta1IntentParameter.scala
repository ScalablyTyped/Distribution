package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentParameter extends StObject {
  
  /**
    * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
    */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the parameter.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
    */
  var entityTypeDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates whether the parameter represents a list of values.
    */
  var isList: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
    */
  var mandatory: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The unique identifier of this parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
    */
  var prompts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentParameter {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentParameter]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentParameter](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityTypeDisplayName(value: String): Self = StObject.set(x, "entityTypeDisplayName", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeDisplayNameNull: Self = StObject.set(x, "entityTypeDisplayName", null)
    
    inline def setEntityTypeDisplayNameUndefined: Self = StObject.set(x, "entityTypeDisplayName", js.undefined)
    
    inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    inline def setIsListNull: Self = StObject.set(x, "isList", null)
    
    inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setMandatoryNull: Self = StObject.set(x, "mandatory", null)
    
    inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrompts(value: js.Array[String]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
    
    inline def setPromptsNull: Self = StObject.set(x, "prompts", null)
    
    inline def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    
    inline def setPromptsVarargs(value: String*): Self = StObject.set(x, "prompts", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
