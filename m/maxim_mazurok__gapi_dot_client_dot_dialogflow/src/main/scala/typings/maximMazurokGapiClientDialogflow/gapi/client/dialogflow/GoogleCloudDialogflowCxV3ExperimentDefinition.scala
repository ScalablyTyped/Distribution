package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExperimentDefinition extends StObject {
  
  /**
    * The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. "query_input.language_code=en" See the [conditions
    * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /** The flow versions as the variants of this experiment. */
  var versionVariants: js.UndefOr[GoogleCloudDialogflowCxV3VersionVariants] = js.undefined
}
object GoogleCloudDialogflowCxV3ExperimentDefinition {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExperimentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExperimentDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ExperimentDefinition] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setVersionVariants(value: GoogleCloudDialogflowCxV3VersionVariants): Self = StObject.set(x, "versionVariants", value.asInstanceOf[js.Any])
    
    inline def setVersionVariantsUndefined: Self = StObject.set(x, "versionVariants", js.undefined)
  }
}
