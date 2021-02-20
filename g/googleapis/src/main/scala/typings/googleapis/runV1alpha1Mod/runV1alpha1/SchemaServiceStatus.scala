package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current state of the Service. Output only.
  */
@js.native
trait SchemaServiceStatus extends StObject {
  
  /**
    * From RouteStatus. Similar to domain, information on where the service is
    * available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.native
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaServiceCondition]] = js.native
  
  /**
    * From RouteStatus. Domain holds the top-level domain that will distribute
    * traffic over the provided targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * From ConfigurationStatus. LatestCreatedRevisionName is the last revision
    * that was created from this Service&#39;s Configuration. It might not be
    * ready yet, for that use LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.native
  
  /**
    * From ConfigurationStatus. LatestReadyRevisionName holds the name of the
    * latest Revision stamped out from this Service&#39;s Configuration that
    * has had its &quot;Ready&quot; condition become &quot;True&quot;.
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.native
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Route that was last
    * processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * From RouteStatus. Traffic holds the configured traffic distribution.
    * These entries will always contain RevisionName references. When
    * ConfigurationName appears in the spec, this will hold the
    * LatestReadyRevisionName that we last observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.native
}
object SchemaServiceStatus {
  
  @scala.inline
  def apply(): SchemaServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceStatus]
  }
  
  @scala.inline
  implicit class SchemaServiceStatusMutableBuilder[Self <: SchemaServiceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SchemaAddressable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[SchemaServiceCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaServiceCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
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
    
    @scala.inline
    def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
