package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTask extends StObject {
  
  /**
    * Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources +optional
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata +optional
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Optional. Specification of the desired behavior of an execution. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
    */
  var spec: js.UndefOr[SchemaTaskSpec] = js.undefined
  
  /**
    * Output only. Current status of an execution. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
    */
  var status: js.UndefOr[SchemaTaskStatus] = js.undefined
}
object SchemaTask {
  
  inline def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  extension [Self <: SchemaTask](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaTaskSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: SchemaTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
