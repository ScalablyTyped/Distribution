package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfiguration extends StObject {
  
  /**
    * The API version for this call such as "serving.knative.dev/v1".
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of resource, in this case always "Configuration".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata associated with this Configuration, including name, namespace, labels, and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Spec holds the desired state of the Configuration (from the client).
    */
  var spec: js.UndefOr[SchemaConfigurationSpec] = js.undefined
  
  /**
    * Status communicates the observed state of the Configuration (from the controller).
    */
  var status: js.UndefOr[SchemaConfigurationStatus] = js.undefined
}
object SchemaConfiguration {
  
  inline def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  
  extension [Self <: SchemaConfiguration](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaConfigurationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: SchemaConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
