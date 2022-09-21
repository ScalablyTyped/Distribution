package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeshIstio extends StObject {
  
  /**
    * Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
    */
  var meshUid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
    */
  var serviceNamespace: js.UndefOr[String | Null] = js.undefined
}
object SchemaMeshIstio {
  
  inline def apply(): SchemaMeshIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeshIstio]
  }
  
  extension [Self <: SchemaMeshIstio](x: Self) {
    
    inline def setMeshUid(value: String): Self = StObject.set(x, "meshUid", value.asInstanceOf[js.Any])
    
    inline def setMeshUidNull: Self = StObject.set(x, "meshUid", null)
    
    inline def setMeshUidUndefined: Self = StObject.set(x, "meshUid", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNamespace(value: String): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespaceNull: Self = StObject.set(x, "serviceNamespace", null)
    
    inline def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
  }
}
