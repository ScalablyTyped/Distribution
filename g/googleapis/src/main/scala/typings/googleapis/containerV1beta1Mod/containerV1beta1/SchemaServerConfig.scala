package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Kubernetes Engine service configuration.
  */
@js.native
trait SchemaServerConfig extends js.Object {
  
  /**
    * Version of Kubernetes the service deploys by default.
    */
  var defaultClusterVersion: js.UndefOr[String] = js.native
  
  /**
    * Default image type.
    */
  var defaultImageType: js.UndefOr[String] = js.native
  
  /**
    * List of valid image types.
    */
  var validImageTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of valid master versions.
    */
  var validMasterVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of valid node upgrade target versions.
    */
  var validNodeVersions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaServerConfig {
  
  @scala.inline
  def apply(): SchemaServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerConfig]
  }
  
  @scala.inline
  implicit class SchemaServerConfigOps[Self <: SchemaServerConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultClusterVersion(value: String): Self = this.set("defaultClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClusterVersion: Self = this.set("defaultClusterVersion", js.undefined)
    
    @scala.inline
    def setDefaultImageType(value: String): Self = this.set("defaultImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultImageType: Self = this.set("defaultImageType", js.undefined)
    
    @scala.inline
    def setValidImageTypesVarargs(value: String*): Self = this.set("validImageTypes", js.Array(value :_*))
    
    @scala.inline
    def setValidImageTypes(value: js.Array[String]): Self = this.set("validImageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidImageTypes: Self = this.set("validImageTypes", js.undefined)
    
    @scala.inline
    def setValidMasterVersionsVarargs(value: String*): Self = this.set("validMasterVersions", js.Array(value :_*))
    
    @scala.inline
    def setValidMasterVersions(value: js.Array[String]): Self = this.set("validMasterVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidMasterVersions: Self = this.set("validMasterVersions", js.undefined)
    
    @scala.inline
    def setValidNodeVersionsVarargs(value: String*): Self = this.set("validNodeVersions", js.Array(value :_*))
    
    @scala.inline
    def setValidNodeVersions(value: js.Array[String]): Self = this.set("validNodeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidNodeVersions: Self = this.set("validNodeVersions", js.undefined)
  }
}
