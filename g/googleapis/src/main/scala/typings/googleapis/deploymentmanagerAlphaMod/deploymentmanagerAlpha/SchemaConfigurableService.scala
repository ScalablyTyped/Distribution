package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BaseType that describes a service-backed Type.
  */
@js.native
trait SchemaConfigurableService extends js.Object {
  
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.native
  
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}
object SchemaConfigurableService {
  
  @scala.inline
  def apply(): SchemaConfigurableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurableService]
  }
  
  @scala.inline
  implicit class SchemaConfigurableServiceOps[Self <: SchemaConfigurableService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollectionOverridesVarargs(value: SchemaCollectionOverride*): Self = this.set("collectionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = this.set("collectionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionOverrides: Self = this.set("collectionOverrides", js.undefined)
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    
    @scala.inline
    def setDescriptorUrl(value: String): Self = this.set("descriptorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptorUrl: Self = this.set("descriptorUrl", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
