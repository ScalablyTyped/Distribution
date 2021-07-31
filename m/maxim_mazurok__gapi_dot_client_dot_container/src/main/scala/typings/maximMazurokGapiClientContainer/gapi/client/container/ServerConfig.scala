package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerConfig extends StObject {
  
  /** List of release channel configurations. */
  var channels: js.UndefOr[js.Array[ReleaseChannelConfig]] = js.undefined
  
  /** Version of Kubernetes the service deploys by default. */
  var defaultClusterVersion: js.UndefOr[String] = js.undefined
  
  /** Default image type. */
  var defaultImageType: js.UndefOr[String] = js.undefined
  
  /** List of valid image types. */
  var validImageTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of valid master versions, in descending order. */
  var validMasterVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of valid node upgrade target versions, in descending order. */
  var validNodeVersions: js.UndefOr[js.Array[String]] = js.undefined
}
object ServerConfig {
  
  @scala.inline
  def apply(): ServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerConfig]
  }
  
  @scala.inline
  implicit class ServerConfigMutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[ReleaseChannelConfig]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: ReleaseChannelConfig*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
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
