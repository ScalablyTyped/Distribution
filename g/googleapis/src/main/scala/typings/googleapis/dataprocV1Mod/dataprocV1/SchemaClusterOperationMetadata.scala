package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing the operation.
  */
trait SchemaClusterOperationMetadata extends StObject {
  
  /**
    * Output only. Name of the cluster for the operation.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Cluster UUID for the operation.
    */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Short description of operation.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Labels associated with the operation
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Output only. The operation type.
    */
  var operationType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Current operation status.
    */
  var status: js.UndefOr[SchemaClusterOperationStatus] = js.undefined
  
  /**
    * Output only. The previous operation status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaClusterOperationStatus]] = js.undefined
  
  /**
    * Output only. Errors encountered during operation execution.
    */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaClusterOperationMetadata {
  
  inline def apply(): SchemaClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperationMetadata]
  }
  
  extension [Self <: SchemaClusterOperationMetadata](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStatus(value: SchemaClusterOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[SchemaClusterOperationStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: SchemaClusterOperationStatus*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
