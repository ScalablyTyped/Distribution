package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3IntentParameter extends StObject {
  
  /**
    * Required. The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example,
    * `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /** Required. The unique identifier of the parameter. This field is used by training phrases to annotate their parts. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the parameter represents a list of values. */
  var isList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the
    * parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
    */
  var redact: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3IntentParameter {
  
  inline def apply(): GoogleCloudDialogflowCxV3IntentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3IntentParameter]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3IntentParameter](x: Self) {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
    
    inline def setRedact(value: Boolean): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
    
    inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
  }
}
