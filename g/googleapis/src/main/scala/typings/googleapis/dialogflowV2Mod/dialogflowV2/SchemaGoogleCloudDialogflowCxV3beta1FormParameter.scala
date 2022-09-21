package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FormParameter extends StObject {
  
  /**
    * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
    */
  var defaultValue: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the parameter, unique within the form.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
    */
  var entityType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Defines fill behavior for the parameter.
    */
  var fillBehavior: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior] = js.undefined
  
  /**
    * Indicates whether the parameter represents a list of values.
    */
  var isList: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
    */
  var redact: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FormParameter {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FormParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FormParameter]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FormParameter](x: Self) {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setFillBehavior(value: SchemaGoogleCloudDialogflowCxV3beta1FormParameterFillBehavior): Self = StObject.set(x, "fillBehavior", value.asInstanceOf[js.Any])
    
    inline def setFillBehaviorUndefined: Self = StObject.set(x, "fillBehavior", js.undefined)
    
    inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    inline def setIsListNull: Self = StObject.set(x, "isList", null)
    
    inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
    
    inline def setRedact(value: Boolean): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
    
    inline def setRedactNull: Self = StObject.set(x, "redact", null)
    
    inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
