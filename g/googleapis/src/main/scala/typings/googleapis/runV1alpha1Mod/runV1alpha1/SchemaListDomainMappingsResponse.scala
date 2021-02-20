package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListDomainMappingsResponse is a list of DomainMapping resources.
  */
@js.native
trait SchemaListDomainMappingsResponse extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * List of DomainMappings.
    */
  var items: js.UndefOr[js.Array[SchemaDomainMapping]] = js.native
  
  /**
    * The kind of this resource, in this case &quot;DomainMappingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Metadata associated with this DomainMapping list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.native
}
object SchemaListDomainMappingsResponse {
  
  @scala.inline
  def apply(): SchemaListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainMappingsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDomainMappingsResponseMutableBuilder[Self <: SchemaListDomainMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaDomainMapping]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaDomainMapping*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaListMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
