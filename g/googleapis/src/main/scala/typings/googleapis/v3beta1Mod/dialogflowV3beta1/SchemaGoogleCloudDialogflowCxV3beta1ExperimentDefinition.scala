package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ExperimentDefinition extends StObject {
  
  /**
    * The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. "query_input.language_code=en" See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The flow versions as the variants of this experiment.
    */
  var versionVariants: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1VersionVariants] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ExperimentDefinition {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ExperimentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ExperimentDefinition]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ExperimentDefinition](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setVersionVariants(value: SchemaGoogleCloudDialogflowCxV3beta1VersionVariants): Self = StObject.set(x, "versionVariants", value.asInstanceOf[js.Any])
    
    inline def setVersionVariantsUndefined: Self = StObject.set(x, "versionVariants", js.undefined)
  }
}
