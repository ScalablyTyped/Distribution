package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BaseType that describes a service-backed Type.
  */
trait SchemaConfigurableService extends StObject {
  
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.undefined
  
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.undefined
  
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
}
object SchemaConfigurableService {
  
  @scala.inline
  def apply(): SchemaConfigurableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurableService]
  }
  
  @scala.inline
  implicit class SchemaConfigurableServiceMutableBuilder[Self <: SchemaConfigurableService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = StObject.set(x, "collectionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionOverridesUndefined: Self = StObject.set(x, "collectionOverrides", js.undefined)
    
    @scala.inline
    def setCollectionOverridesVarargs(value: SchemaCollectionOverride*): Self = StObject.set(x, "collectionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDescriptorUrl(value: String): Self = StObject.set(x, "descriptorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUrlUndefined: Self = StObject.set(x, "descriptorUrl", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
