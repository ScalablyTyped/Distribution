package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServerConfig extends StObject {
  
  /**
    * List of release channel configurations.
    */
  var channels: js.UndefOr[js.Array[SchemaReleaseChannelConfig]] = js.undefined
  
  /**
    * Version of Kubernetes the service deploys by default.
    */
  var defaultClusterVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Default image type.
    */
  var defaultImageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of valid image types.
    */
  var validImageTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of valid master versions, in descending order.
    */
  var validMasterVersions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of valid node upgrade target versions, in descending order.
    */
  var validNodeVersions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaServerConfig {
  
  inline def apply(): SchemaServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerConfig]
  }
  
  extension [Self <: SchemaServerConfig](x: Self) {
    
    inline def setChannels(value: js.Array[SchemaReleaseChannelConfig]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaReleaseChannelConfig*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setDefaultClusterVersion(value: String): Self = StObject.set(x, "defaultClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultClusterVersionNull: Self = StObject.set(x, "defaultClusterVersion", null)
    
    inline def setDefaultClusterVersionUndefined: Self = StObject.set(x, "defaultClusterVersion", js.undefined)
    
    inline def setDefaultImageType(value: String): Self = StObject.set(x, "defaultImageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultImageTypeNull: Self = StObject.set(x, "defaultImageType", null)
    
    inline def setDefaultImageTypeUndefined: Self = StObject.set(x, "defaultImageType", js.undefined)
    
    inline def setValidImageTypes(value: js.Array[String]): Self = StObject.set(x, "validImageTypes", value.asInstanceOf[js.Any])
    
    inline def setValidImageTypesNull: Self = StObject.set(x, "validImageTypes", null)
    
    inline def setValidImageTypesUndefined: Self = StObject.set(x, "validImageTypes", js.undefined)
    
    inline def setValidImageTypesVarargs(value: String*): Self = StObject.set(x, "validImageTypes", js.Array(value*))
    
    inline def setValidMasterVersions(value: js.Array[String]): Self = StObject.set(x, "validMasterVersions", value.asInstanceOf[js.Any])
    
    inline def setValidMasterVersionsNull: Self = StObject.set(x, "validMasterVersions", null)
    
    inline def setValidMasterVersionsUndefined: Self = StObject.set(x, "validMasterVersions", js.undefined)
    
    inline def setValidMasterVersionsVarargs(value: String*): Self = StObject.set(x, "validMasterVersions", js.Array(value*))
    
    inline def setValidNodeVersions(value: js.Array[String]): Self = StObject.set(x, "validNodeVersions", value.asInstanceOf[js.Any])
    
    inline def setValidNodeVersionsNull: Self = StObject.set(x, "validNodeVersions", null)
    
    inline def setValidNodeVersionsUndefined: Self = StObject.set(x, "validNodeVersions", js.undefined)
    
    inline def setValidNodeVersionsVarargs(value: String*): Self = StObject.set(x, "validNodeVersions", js.Array(value*))
  }
}
