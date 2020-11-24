package typings.irc.mod

import typings.node.tlsMod.SecureContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientOpts extends js.Object {
  
  /**
    * Should we auto-reconnect to networks?
    * @default true
    */
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  /**
    * Should we auto-rejoin channels?
    * @default false
    */
  var autoRejoin: js.UndefOr[Boolean] = js.native
  
  /**
    * Should we accept expired certificates?
    * @default false
    */
  var certExpired: js.UndefOr[Boolean] = js.native
  
  /**
    * Channel prefix
    * @default '&#'
    */
  var channelPrefixes: js.UndefOr[String] = js.native
  
  /**
    * Channels to join
    * @default []
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Should we output debug messages to STDOUT?
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Encoding to use. See
    * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * Should we queue our messages to ensure we don't get kicked?
    * @default false
    */
  var floodProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay between messages when flood protection is active
    * @default 1000
    */
  var floodProtectionDelay: js.UndefOr[Double] = js.native
  
  /**
    * Local interface to bind to for network connections. See
    * https://nodejs.org/api/net.html#net_socket_localaddress
    */
  var localAddress: js.UndefOr[String] = js.native
  
  /**
    * Characters to split a message at.
    * @default 512
    */
  var messageSplit: js.UndefOr[Double] = js.native
  
  /**
    * IRC username
    * @default ''
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * IRC connection port. See
    * https://nodejs.org/api/net.html#net_socket_remoteport
    * @default 6667
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * IRC "real name"
    * @default 'nodeJS IRC client'
    */
  var realName: js.UndefOr[String] = js.native
  
  /**
    * Should we use SASL authentication?
    * @default false
    */
  var sasl: js.UndefOr[Boolean] = js.native
  
  /**
    * Should SSL be used? Can either be true or crypto credentials.
    * @default false
    */
  var secure: js.UndefOr[Boolean | SecureContext] = js.native
  
  /**
    * Should we accept self-signed certificates?
    * @default false
    */
  var selfSigned: js.UndefOr[Boolean] = js.native
  
  /**
    * Should we output IRC errors?
    * @default false
    */
  var showErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * Should we strip mIRC colors from the output messages?
    * @default false
    */
  var stripColors: js.UndefOr[Boolean] = js.native
  
  /**
    * IRC username
    * @default 'nodebot'
    */
  var userName: js.UndefOr[String] = js.native
}
object IClientOpts {
  
  @scala.inline
  def apply(): IClientOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientOpts]
  }
  
  @scala.inline
  implicit class IClientOptsOps[Self <: IClientOpts] (val x: Self) extends AnyVal {
    
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
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setAutoRejoin(value: Boolean): Self = this.set("autoRejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRejoin: Self = this.set("autoRejoin", js.undefined)
    
    @scala.inline
    def setCertExpired(value: Boolean): Self = this.set("certExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertExpired: Self = this.set("certExpired", js.undefined)
    
    @scala.inline
    def setChannelPrefixes(value: String): Self = this.set("channelPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelPrefixes: Self = this.set("channelPrefixes", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFloodProtection(value: Boolean): Self = this.set("floodProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodProtection: Self = this.set("floodProtection", js.undefined)
    
    @scala.inline
    def setFloodProtectionDelay(value: Double): Self = this.set("floodProtectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodProtectionDelay: Self = this.set("floodProtectionDelay", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setMessageSplit(value: Double): Self = this.set("messageSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageSplit: Self = this.set("messageSplit", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRealName(value: String): Self = this.set("realName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealName: Self = this.set("realName", js.undefined)
    
    @scala.inline
    def setSasl(value: Boolean): Self = this.set("sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasl: Self = this.set("sasl", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean | SecureContext): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSelfSigned(value: Boolean): Self = this.set("selfSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfSigned: Self = this.set("selfSigned", js.undefined)
    
    @scala.inline
    def setShowErrors(value: Boolean): Self = this.set("showErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowErrors: Self = this.set("showErrors", js.undefined)
    
    @scala.inline
    def setStripColors(value: Boolean): Self = this.set("stripColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripColors: Self = this.set("stripColors", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
