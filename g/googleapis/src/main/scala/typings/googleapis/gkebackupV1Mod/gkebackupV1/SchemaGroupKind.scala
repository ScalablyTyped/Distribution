package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupKind extends StObject {
  
  /**
    * API group string of a Kubernetes resource, e.g. "apiextensions.k8s.io", "storage.k8s.io", etc. Note: use empty string for core API group
    */
  var resourceGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of a Kubernetes resource, e.g. "CustomResourceDefinition", "StorageClass", etc.
    */
  var resourceKind: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupKind {
  
  inline def apply(): SchemaGroupKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupKind]
  }
  
  extension [Self <: SchemaGroupKind](x: Self) {
    
    inline def setResourceGroup(value: String): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNull: Self = StObject.set(x, "resourceGroup", null)
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
    
    inline def setResourceKind(value: String): Self = StObject.set(x, "resourceKind", value.asInstanceOf[js.Any])
    
    inline def setResourceKindNull: Self = StObject.set(x, "resourceKind", null)
    
    inline def setResourceKindUndefined: Self = StObject.set(x, "resourceKind", js.undefined)
  }
}
