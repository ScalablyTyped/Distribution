package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigurationStatus extends StObject {
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * LatestCreatedRevisionName is the last revision that was created from this Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * LatestReadyRevisionName holds the name of the latest Revision stamped out from this Configuration that has had its "Ready" condition become "True".
    */
  var latestReadyRevisionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the Configuration that was last processed by the controller. The observed generation is updated even if the controller failed to process the spec and create the Revision. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation, and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
}
object SchemaConfigurationStatus {
  
  inline def apply(): SchemaConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationStatus]
  }
  
  extension [Self <: SchemaConfigurationStatus](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLatestCreatedRevisionName(value: String): Self = StObject.set(x, "latestCreatedRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedRevisionNameNull: Self = StObject.set(x, "latestCreatedRevisionName", null)
    
    inline def setLatestCreatedRevisionNameUndefined: Self = StObject.set(x, "latestCreatedRevisionName", js.undefined)
    
    inline def setLatestReadyRevisionName(value: String): Self = StObject.set(x, "latestReadyRevisionName", value.asInstanceOf[js.Any])
    
    inline def setLatestReadyRevisionNameNull: Self = StObject.set(x, "latestReadyRevisionName", null)
    
    inline def setLatestReadyRevisionNameUndefined: Self = StObject.set(x, "latestReadyRevisionName", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
