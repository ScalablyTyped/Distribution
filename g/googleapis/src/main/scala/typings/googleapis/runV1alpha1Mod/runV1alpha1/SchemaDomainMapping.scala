package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource to hold the state and status of a user&#39;s domain mapping.
  */
trait SchemaDomainMapping extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of resource, in this case &quot;DomainMapping&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata associated with this BuildTemplate.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.undefined
  
  /**
    * The spec for this DomainMapping.
    */
  var spec: js.UndefOr[SchemaDomainMappingSpec] = js.undefined
  
  /**
    * The current status of the DomainMapping.
    */
  var status: js.UndefOr[SchemaDomainMappingStatus] = js.undefined
}
object SchemaDomainMapping {
  
  inline def apply(): SchemaDomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMapping]
  }
  
  extension [Self <: SchemaDomainMapping](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: SchemaDomainMappingSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: SchemaDomainMappingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
