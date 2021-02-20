package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Kubernetes Engine service configuration.
  */
@js.native
trait SchemaServerConfig extends StObject {
  
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
  implicit class SchemaServerConfigMutableBuilder[Self <: SchemaServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultClusterVersion(value: String): Self = StObject.set(x, "defaultClusterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClusterVersionUndefined: Self = StObject.set(x, "defaultClusterVersion", js.undefined)
    
    @scala.inline
    def setDefaultImageType(value: String): Self = StObject.set(x, "defaultImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultImageTypeUndefined: Self = StObject.set(x, "defaultImageType", js.undefined)
    
    @scala.inline
    def setValidImageTypes(value: js.Array[String]): Self = StObject.set(x, "validImageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidImageTypesUndefined: Self = StObject.set(x, "validImageTypes", js.undefined)
    
    @scala.inline
    def setValidImageTypesVarargs(value: String*): Self = StObject.set(x, "validImageTypes", js.Array(value :_*))
    
    @scala.inline
    def setValidMasterVersions(value: js.Array[String]): Self = StObject.set(x, "validMasterVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidMasterVersionsUndefined: Self = StObject.set(x, "validMasterVersions", js.undefined)
    
    @scala.inline
    def setValidMasterVersionsVarargs(value: String*): Self = StObject.set(x, "validMasterVersions", js.Array(value :_*))
    
    @scala.inline
    def setValidNodeVersions(value: js.Array[String]): Self = StObject.set(x, "validNodeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidNodeVersionsUndefined: Self = StObject.set(x, "validNodeVersions", js.undefined)
    
    @scala.inline
    def setValidNodeVersionsVarargs(value: String*): Self = StObject.set(x, "validNodeVersions", js.Array(value :_*))
  }
}
