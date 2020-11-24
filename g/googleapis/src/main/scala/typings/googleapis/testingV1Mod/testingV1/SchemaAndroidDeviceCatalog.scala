package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently supported Android devices.
  */
@js.native
trait SchemaAndroidDeviceCatalog extends js.Object {
  
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[SchemaAndroidModel]] = js.native
  
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaAndroidRuntimeConfiguration] = js.native
  
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[SchemaAndroidVersion]] = js.native
}
object SchemaAndroidDeviceCatalog {
  
  @scala.inline
  def apply(): SchemaAndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceCatalog]
  }
  
  @scala.inline
  implicit class SchemaAndroidDeviceCatalogOps[Self <: SchemaAndroidDeviceCatalog] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: SchemaAndroidModel*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[SchemaAndroidModel]): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setRuntimeConfiguration(value: SchemaAndroidRuntimeConfiguration): Self = this.set("runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaAndroidVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[SchemaAndroidVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
