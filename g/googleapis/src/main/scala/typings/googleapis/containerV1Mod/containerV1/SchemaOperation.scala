package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This operation resource represents operations that may have happened or are
  * happening on the cluster. All fields are output only.
  */
trait SchemaOperation extends StObject {
  
  /**
    * Which conditions caused the current cluster state.
    */
  var clusterConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.undefined
  
  /**
    * Detailed operation progress, if available.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The time the operation completed, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/regions-zones/regions-zones#available) or
    * [region](/compute/docs/regions-zones/regions-zones#available) in which
    * the cluster resides.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The server-assigned ID for the operation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Which conditions caused the current node pool state.
    */
  var nodepoolConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.undefined
  
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String] = js.undefined
  
  /**
    * Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The time the operation started, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the operation.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * If an error has occurred, a textual description of the error.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Server-defined URL for the target of the operation.
    */
  var targetLink: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation is taking
    * place. This field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setClusterConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "clusterConditions", value.asInstanceOf[js.Any])
    
    inline def setClusterConditionsUndefined: Self = StObject.set(x, "clusterConditions", js.undefined)
    
    inline def setClusterConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "clusterConditions", js.Array(value :_*))
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodepoolConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "nodepoolConditions", value.asInstanceOf[js.Any])
    
    inline def setNodepoolConditionsUndefined: Self = StObject.set(x, "nodepoolConditions", js.undefined)
    
    inline def setNodepoolConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "nodepoolConditions", js.Array(value :_*))
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
