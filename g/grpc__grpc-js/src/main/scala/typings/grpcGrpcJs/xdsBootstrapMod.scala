package typings.grpcGrpcJs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xdsBootstrapMod {
  
  @JSImport("@grpc/grpc-js/build/src/xds-bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadBootstrapInfo(): js.Promise[BootstrapInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadBootstrapInfo")().asInstanceOf[js.Promise[BootstrapInfo]]
  
  trait BootstrapInfo extends StObject {
    
    var node: Node
    
    var xdsServers: js.Array[XdsServerConfig]
  }
  object BootstrapInfo {
    
    inline def apply(node: Node, xdsServers: js.Array[XdsServerConfig]): BootstrapInfo = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], xdsServers = xdsServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapInfo]
    }
    
    extension [Self <: BootstrapInfo](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setXdsServers(value: js.Array[XdsServerConfig]): Self = StObject.set(x, "xdsServers", value.asInstanceOf[js.Any])
      
      inline def setXdsServersVarargs(value: XdsServerConfig*): Self = StObject.set(x, "xdsServers", js.Array(value :_*))
    }
  }
  
  trait ChannelCredsConfig extends StObject {
    
    var config: js.UndefOr[js.Object] = js.undefined
    
    var `type`: String
  }
  object ChannelCredsConfig {
    
    inline def apply(`type`: String): ChannelCredsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelCredsConfig]
    }
    
    extension [Self <: ChannelCredsConfig](x: Self) {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XdsServerConfig extends StObject {
    
    var channelCreds: js.Array[ChannelCredsConfig]
    
    var serverUri: String
  }
  object XdsServerConfig {
    
    inline def apply(channelCreds: js.Array[ChannelCredsConfig], serverUri: String): XdsServerConfig = {
      val __obj = js.Dynamic.literal(channelCreds = channelCreds.asInstanceOf[js.Any], serverUri = serverUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[XdsServerConfig]
    }
    
    extension [Self <: XdsServerConfig](x: Self) {
      
      inline def setChannelCreds(value: js.Array[ChannelCredsConfig]): Self = StObject.set(x, "channelCreds", value.asInstanceOf[js.Any])
      
      inline def setChannelCredsVarargs(value: ChannelCredsConfig*): Self = StObject.set(x, "channelCreds", js.Array(value :_*))
      
      inline def setServerUri(value: String): Self = StObject.set(x, "serverUri", value.asInstanceOf[js.Any])
    }
  }
}
