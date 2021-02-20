package typings.grpcGrpcJs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xdsBootstrapMod {
  
  @JSImport("@grpc/grpc-js/build/src/xds-bootstrap", "loadBootstrapInfo")
  @js.native
  def loadBootstrapInfo(): js.Promise[BootstrapInfo] = js.native
  
  @js.native
  trait BootstrapInfo extends StObject {
    
    var node: Node = js.native
    
    var xdsServers: js.Array[XdsServerConfig] = js.native
  }
  object BootstrapInfo {
    
    @scala.inline
    def apply(node: Node, xdsServers: js.Array[XdsServerConfig]): BootstrapInfo = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], xdsServers = xdsServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapInfo]
    }
    
    @scala.inline
    implicit class BootstrapInfoMutableBuilder[Self <: BootstrapInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXdsServers(value: js.Array[XdsServerConfig]): Self = StObject.set(x, "xdsServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXdsServersVarargs(value: XdsServerConfig*): Self = StObject.set(x, "xdsServers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ChannelCredsConfig extends StObject {
    
    var config: js.UndefOr[js.Object] = js.native
    
    var `type`: String = js.native
  }
  object ChannelCredsConfig {
    
    @scala.inline
    def apply(`type`: String): ChannelCredsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelCredsConfig]
    }
    
    @scala.inline
    implicit class ChannelCredsConfigMutableBuilder[Self <: ChannelCredsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XdsServerConfig extends StObject {
    
    var channelCreds: js.Array[ChannelCredsConfig] = js.native
    
    var serverUri: String = js.native
  }
  object XdsServerConfig {
    
    @scala.inline
    def apply(channelCreds: js.Array[ChannelCredsConfig], serverUri: String): XdsServerConfig = {
      val __obj = js.Dynamic.literal(channelCreds = channelCreds.asInstanceOf[js.Any], serverUri = serverUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[XdsServerConfig]
    }
    
    @scala.inline
    implicit class XdsServerConfigMutableBuilder[Self <: XdsServerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelCreds(value: js.Array[ChannelCredsConfig]): Self = StObject.set(x, "channelCreds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCredsVarargs(value: ChannelCredsConfig*): Self = StObject.set(x, "channelCreds", js.Array(value :_*))
      
      @scala.inline
      def setServerUri(value: String): Self = StObject.set(x, "serverUri", value.asInstanceOf[js.Any])
    }
  }
}
