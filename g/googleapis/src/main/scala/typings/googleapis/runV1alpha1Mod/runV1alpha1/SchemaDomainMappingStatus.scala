package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current state of the Domain Mapping.
  */
@js.native
trait SchemaDomainMappingStatus extends StObject {
  
  /**
    * Array of observed DomainMappingConditions, indicating the current state
    * of the DomainMapping.
    */
  var conditions: js.UndefOr[js.Array[SchemaDomainMappingCondition]] = js.native
  
  /**
    * The name of the route that the mapping currently points to.
    */
  var mappedRouteName: js.UndefOr[String] = js.native
  
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the DomainMapping that
    * was last processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  
  /**
    * The resource records required to configure this domain mapping. These
    * records must be added to the domain&#39;s DNS configuration in order to
    * serve the application via this domain mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.native
}
object SchemaDomainMappingStatus {
  
  @scala.inline
  def apply(): SchemaDomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingStatus]
  }
  
  @scala.inline
  implicit class SchemaDomainMappingStatusMutableBuilder[Self <: SchemaDomainMappingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[SchemaDomainMappingCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaDomainMappingCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setMappedRouteName(value: String): Self = StObject.set(x, "mappedRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappedRouteNameUndefined: Self = StObject.set(x, "mappedRouteName", js.undefined)
    
    @scala.inline
    def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    @scala.inline
    def setResourceRecords(value: js.Array[SchemaResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    @scala.inline
    def setResourceRecordsVarargs(value: SchemaResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value :_*))
  }
}
