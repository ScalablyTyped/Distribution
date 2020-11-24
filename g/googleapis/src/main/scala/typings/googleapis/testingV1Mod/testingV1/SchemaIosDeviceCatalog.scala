package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently supported iOS devices.
  */
@js.native
trait SchemaIosDeviceCatalog extends js.Object {
  
  /**
    * The set of supported iOS device models.
    */
  var models: js.UndefOr[js.Array[SchemaIosModel]] = js.native
  
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaIosRuntimeConfiguration] = js.native
  
  /**
    * The set of supported iOS software versions.
    */
  var versions: js.UndefOr[js.Array[SchemaIosVersion]] = js.native
  
  /**
    * The set of supported Xcode versions.
    */
  var xcodeVersions: js.UndefOr[js.Array[SchemaXcodeVersion]] = js.native
}
object SchemaIosDeviceCatalog {
  
  @scala.inline
  def apply(): SchemaIosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceCatalog]
  }
  
  @scala.inline
  implicit class SchemaIosDeviceCatalogOps[Self <: SchemaIosDeviceCatalog] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: SchemaIosModel*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[SchemaIosModel]): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setRuntimeConfiguration(value: SchemaIosRuntimeConfiguration): Self = this.set("runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaIosVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[SchemaIosVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    
    @scala.inline
    def setXcodeVersionsVarargs(value: SchemaXcodeVersion*): Self = this.set("xcodeVersions", js.Array(value :_*))
    
    @scala.inline
    def setXcodeVersions(value: js.Array[SchemaXcodeVersion]): Self = this.set("xcodeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXcodeVersions: Self = this.set("xcodeVersions", js.undefined)
  }
}
