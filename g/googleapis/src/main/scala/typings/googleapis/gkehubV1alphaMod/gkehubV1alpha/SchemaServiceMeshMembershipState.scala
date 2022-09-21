package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshMembershipState extends StObject {
  
  /**
    * Output only. Results of running Service Mesh analyzers.
    */
  var analysisMessages: js.UndefOr[js.Array[SchemaServiceMeshAnalysisMessage]] = js.undefined
  
  /**
    * The API version (i.e. Istio CRD version) for configuring service mesh in this cluster. This version is influenced by the `default_channel` field.
    */
  var configApiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Status of control plane management
    */
  var controlPlaneManagement: js.UndefOr[SchemaServiceMeshControlPlaneManagement] = js.undefined
  
  /**
    * Output only. Status of data plane management.
    */
  var dataPlaneManagement: js.UndefOr[SchemaServiceMeshDataPlaneManagement] = js.undefined
}
object SchemaServiceMeshMembershipState {
  
  inline def apply(): SchemaServiceMeshMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshMembershipState]
  }
  
  extension [Self <: SchemaServiceMeshMembershipState](x: Self) {
    
    inline def setAnalysisMessages(value: js.Array[SchemaServiceMeshAnalysisMessage]): Self = StObject.set(x, "analysisMessages", value.asInstanceOf[js.Any])
    
    inline def setAnalysisMessagesUndefined: Self = StObject.set(x, "analysisMessages", js.undefined)
    
    inline def setAnalysisMessagesVarargs(value: SchemaServiceMeshAnalysisMessage*): Self = StObject.set(x, "analysisMessages", js.Array(value*))
    
    inline def setConfigApiVersion(value: String): Self = StObject.set(x, "configApiVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigApiVersionNull: Self = StObject.set(x, "configApiVersion", null)
    
    inline def setConfigApiVersionUndefined: Self = StObject.set(x, "configApiVersion", js.undefined)
    
    inline def setControlPlaneManagement(value: SchemaServiceMeshControlPlaneManagement): Self = StObject.set(x, "controlPlaneManagement", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneManagementUndefined: Self = StObject.set(x, "controlPlaneManagement", js.undefined)
    
    inline def setDataPlaneManagement(value: SchemaServiceMeshDataPlaneManagement): Self = StObject.set(x, "dataPlaneManagement", value.asInstanceOf[js.Any])
    
    inline def setDataPlaneManagementUndefined: Self = StObject.set(x, "dataPlaneManagement", js.undefined)
  }
}
