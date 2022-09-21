package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNamespace extends StObject {
  
  /**
    * The name of the parent cluster.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the parent cluster. This may be a zone or region.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this namespace.
    */
  var namespaceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The project this resource lives in. For legacy services migrated from the Custom type, this may be a distinct project from the one parenting the service itself.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGkeNamespace {
  
  inline def apply(): SchemaGkeNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNamespace]
  }
  
  extension [Self <: SchemaGkeNamespace](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameNull: Self = StObject.set(x, "namespaceName", null)
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
