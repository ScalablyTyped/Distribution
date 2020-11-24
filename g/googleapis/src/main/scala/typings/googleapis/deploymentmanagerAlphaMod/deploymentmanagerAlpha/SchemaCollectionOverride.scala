package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
@js.native
trait SchemaCollectionOverride extends js.Object {
  
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.native
  
  /**
    * Custom verb method mappings to support unordered list API mappings.
    */
  var methodMap: js.UndefOr[SchemaMethodMap] = js.native
  
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}
object SchemaCollectionOverride {
  
  @scala.inline
  def apply(): SchemaCollectionOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionOverride]
  }
  
  @scala.inline
  implicit class SchemaCollectionOverrideOps[Self <: SchemaCollectionOverride] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setMethodMap(value: SchemaMethodMap): Self = this.set("methodMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodMap: Self = this.set("methodMap", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
