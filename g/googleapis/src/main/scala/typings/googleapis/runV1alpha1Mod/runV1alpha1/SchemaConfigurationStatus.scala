package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigurationStatus communicates the observed state of the Configuration
  * (from the controller).
  */
trait SchemaConfigurationStatus extends StObject {
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaConfigurationCondition]] = js.undefined
  
  /**
    * LatestCreatedRevisionName is the last revision that was created from this
    * Configuration. It might not be ready yet, for that use
    * LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.undefined
  
  /**
    * LatestReadyRevisionName holds the name of the latest Revision stamped out
    * from this Configuration that has had its &quot;Ready&quot; condition
    * become &quot;True&quot;.
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.undefined
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Configuration that
    * was last processed by the controller. The observed generation is updated
    * even if the controller failed to process the spec and create the
    * Revision.  Clients polling for completed reconciliation should poll until
    * observedGeneration = metadata.generation, and the Ready condition&#39;s
    * status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.undefined
}
object SchemaConfigurationStatus {
  
  @scala.inline
  def apply(): SchemaConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationStatus]
  }
  
  @scala.inline
  implicit class SchemaConfigurationStatusMutableBuilder[Self <: SchemaConfigurationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[SchemaConfigurationCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaConfigurationCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setLatestCreatedRevisionName(value: String): Self = StObject.set(x, "latestCreatedRevisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCreatedRevisionNameUndefined: Self = StObject.set(x, "latestCreatedRevisionName", js.undefined)
    
    @scala.inline
    def setLatestReadyRevisionName(value: String): Self = StObject.set(x, "latestReadyRevisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestReadyRevisionNameUndefined: Self = StObject.set(x, "latestReadyRevisionName", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
