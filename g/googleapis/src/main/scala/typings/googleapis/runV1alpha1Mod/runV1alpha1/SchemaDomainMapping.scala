package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource to hold the state and status of a user&#39;s domain mapping.
  */
@js.native
trait SchemaDomainMapping extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource, in this case &quot;DomainMapping&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Metadata associated with this BuildTemplate.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  
  /**
    * The spec for this DomainMapping.
    */
  var spec: js.UndefOr[SchemaDomainMappingSpec] = js.native
  
  /**
    * The current status of the DomainMapping.
    */
  var status: js.UndefOr[SchemaDomainMappingStatus] = js.native
}
object SchemaDomainMapping {
  
  @scala.inline
  def apply(): SchemaDomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMapping]
  }
  
  @scala.inline
  implicit class SchemaDomainMappingMutableBuilder[Self <: SchemaDomainMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: SchemaDomainMappingSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaDomainMappingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
