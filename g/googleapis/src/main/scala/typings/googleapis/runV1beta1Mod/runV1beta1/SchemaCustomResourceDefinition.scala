package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceDefinition extends StObject {
  
  /**
    * The API version for this call such as "k8s.apiextensions.io/v1beta1".
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of resource, in this case always "CustomResourceDefinition".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata associated with this CustomResourceDefinition.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * Spec describes how the user wants the resources to appear
    */
  var spec: js.UndefOr[SchemaCustomResourceDefinitionSpec] = js.undefined
}
object SchemaCustomResourceDefinition {
  
  inline def apply(): SchemaCustomResourceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceDefinition]
  }
  
  extension [Self <: SchemaCustomResourceDefinition](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaCustomResourceDefinitionSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
