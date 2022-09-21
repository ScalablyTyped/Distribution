package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainMappingStatus extends StObject {
  
  /**
    * Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * The name of the route that the mapping currently points to.
    */
  var mappedRouteName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.undefined
  
  /**
    * Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomainMappingStatus {
  
  inline def apply(): SchemaDomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingStatus]
  }
  
  extension [Self <: SchemaDomainMappingStatus](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setMappedRouteName(value: String): Self = StObject.set(x, "mappedRouteName", value.asInstanceOf[js.Any])
    
    inline def setMappedRouteNameNull: Self = StObject.set(x, "mappedRouteName", null)
    
    inline def setMappedRouteNameUndefined: Self = StObject.set(x, "mappedRouteName", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setResourceRecords(value: js.Array[SchemaResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    inline def setResourceRecordsVarargs(value: SchemaResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
