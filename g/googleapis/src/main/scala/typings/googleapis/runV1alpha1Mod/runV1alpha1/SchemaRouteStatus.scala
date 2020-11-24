package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RouteStatus communicates the observed state of the Route (from the
  * controller).
  */
@js.native
trait SchemaRouteStatus extends js.Object {
  
  /**
    * Similar to domain, information on where the service is available on HTTP.
    */
  var address: js.UndefOr[SchemaAddressable] = js.native
  
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[SchemaRouteCondition]] = js.native
  
  /**
    * Domain holds the top-level domain that will distribute traffic over the
    * provided targets. It generally has the form
    * https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * For Cloud Run, identifical to domain.
    */
  var domainInternal: js.UndefOr[String] = js.native
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Route that was last
    * processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.  Note that
    * providing a trafficTarget that only has a configurationName will result
    * in a Route that does not increment either its metadata.generation or its
    * observedGeneration, as new &quot;latest ready&quot; revisions from the
    * Configuration are processed without an update to the Route&#39;s spec.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * Traffic holds the configured traffic distribution. These entries will
    * always contain RevisionName references. When ConfigurationName appears in
    * the spec, this will hold the LatestReadyRevisionName that we last
    * observed.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.native
}
object SchemaRouteStatus {
  
  @scala.inline
  def apply(): SchemaRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteStatus]
  }
  
  @scala.inline
  implicit class SchemaRouteStatusOps[Self <: SchemaRouteStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: SchemaAddressable): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaRouteCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[SchemaRouteCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainInternal(value: String): Self = this.set("domainInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainInternal: Self = this.set("domainInternal", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: SchemaTrafficTarget*): Self = this.set("traffic", js.Array(value :_*))
    
    @scala.inline
    def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = this.set("traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffic: Self = this.set("traffic", js.undefined)
  }
}
