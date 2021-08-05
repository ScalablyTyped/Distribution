package typings.irc

import org.scalablytyped.runtime.StringDictionary
import typings.irc.anon.Channel
import typings.irc.anon.Created
import typings.irc.mod.handlers.IJoinChannel
import typings.irc.mod.handlers.IPartChannel
import typings.irc.mod.handlers.IRaw
import typings.irc.mod.handlers.IWhois
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("irc", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    /**
      * Connect to an IRC server
      * @param server - server hostname
      * @param nick - nickname
      * @param opts
      */
    def this(server: String, nick: String) = this()
    def this(server: String, nick: String, opts: IClientOpts) = this()
    
    /**
      * Send an action to the specified target
      * @param target - target
      * @param message - message
      */
    def action(target: String, message: String): Unit = js.native
    
    /**
      * Activate flood protection “after the fact”. You can also use
      * floodProtection while instantiating the Client to enable flood
      * protection, and floodProtectionDelay to set the default message
      * interval.
      * @param interval - ms to wait between messages
      */
    def activateFloodProtection(interval: Double): Unit = js.native
    
    /** Channel listing data. */
    var channellist: js.Array[IChannel] = js.native
    
    /**
      * Channels joined. Includes channel modes, user list, and topic
      * information. Only updated after the server recognizes the join.
      */
    var chans: StringDictionary[Created] = js.native
    
    /**
      * Socket to the server. Rarely, if ever needed. Use Client#send
      * instead.
      */
    var conn: Socket = js.native
    
    /**
      * Connect to the server. Use when `autoConnect` is false.
      * @param retryCount - times to retry
      * @param callback
      */
    def connect(): Unit = js.native
    def connect(retryCount: Double): Unit = js.native
    def connect(retryCount: Double, callback: IRaw): Unit = js.native
    def connect(retryCount: Unit, callback: IRaw): Unit = js.native
    def connect(retryCount: IRaw): Unit = js.native
    def connect(retryCount: IRaw, callback: IRaw): Unit = js.native
    
    /**
      * Send a CTCP message to the specified target
      * @param target - nick or channel
      * @param type - "privmsg" for PRIVMSG, anything else for NOTICE
      * @param text - CTCP message
      */
    def ctcp(target: String, `type`: String, text: String): Unit = js.native
    
    /**
      * Disconnect from the IRC server
      * @param message - message to send
      * @param callback
      */
    def disconnect(message: String, callback: js.Function0[Unit]): Unit = js.native
    
    /** Host mask */
    var hostMask: String = js.native
    
    /**
      * Join the specified channel
      * @param channel - channel to join
      * @param callback
      */
    def join(channel: String): Unit = js.native
    def join(channel: String, callback: IJoinChannel): Unit = js.native
    
    /**
      * Request a channel listing from the server. The arguments for this
      * are farily server specific, this method passes them as specified.
      *
      * Responses from the server are available via `channellist_start`,
      * `channellist_item`, and `channellist` events.
      *
      * @param args - arguments
      */
    def list(args: String*): Unit = js.native
    
    /** Maximum line length */
    var maxLineLength: Double = js.native
    
    /** IRC server MOTD */
    var motd: String = js.native
    
    /**
      * The current nick of the client. Updated if the nick changes
      */
    var nick: String = js.native
    
    /**
      * Send a notice to the specified target.
      * @param target - nick or channel
      * @param message - message to send
      */
    def notice(target: String, message: String): Unit = js.native
    
    /** Bot options */
    var opt: IClientOpts = js.native
    
    /**
      * Part the specified channel
      * @param channel - channel to part
      * @param message - optional message to send
      * @param callback
      */
    def part(channel: String, message: String, callback: IPartChannel): Unit = js.native
    
    /**
      * Send a message to the specified target
      * @param target - nick or channel
      * @param message - message to send
      */
    def say(target: String, message: String): Unit = js.native
    
    /**
      * Send a raw message to the server; generally speaking, it’s best
      * not to use this method unless you know what you’re doing.
      * @param command - irc command
      * @param args - command arguments (splat)
      */
    def send(command: String, args: String*): Unit = js.native
    
    /** Features supported by the server */
    var supported: Channel = js.native
    
    /**
      * Request a whois for the specified nick
      * @param nick - nickname
      * @param callback
      */
    def whois(nick: String, callback: IWhois): Unit = js.native
  }
  
  @js.native
  sealed trait CommandType extends StObject
  @JSImport("irc", "CommandType")
  @js.native
  object CommandType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandType & Double] = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with CommandType
    /* 2 */ val error: typings.irc.mod.CommandType.error & Double = js.native
    
    @js.native
    sealed trait normal
      extends StObject
         with CommandType
    /* 0 */ val normal: typings.irc.mod.CommandType.normal & Double = js.native
    
    @js.native
    sealed trait reply
      extends StObject
         with CommandType
    /* 1 */ val reply: typings.irc.mod.CommandType.reply & Double = js.native
  }
  
  /** Colors */
  object colors {
    
    @JSImport("irc", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def wrap(color: String, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(color.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def wrap(color: String, text: String, reset_color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(color.asInstanceOf[js.Any], text.asInstanceOf[js.Any], reset_color.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait IChannel extends StObject {
    
    /** Channel name */
    var name: String
    
    /** Topic string */
    var topic: String
    
    /** User count */
    var users: String
  }
  object IChannel {
    
    inline def apply(name: String, topic: String, users: String): IChannel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChannel]
    }
    
    extension [Self <: IChannel](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait IClientOpts extends StObject {
    
    /**
      * Should we auto-reconnect to networks?
      * @default true
      */
    var autoConnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should we auto-rejoin channels?
      * @default false
      */
    var autoRejoin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should we accept expired certificates?
      * @default false
      */
    var certExpired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Channel prefix
      * @default '&#'
      */
    var channelPrefixes: js.UndefOr[String] = js.undefined
    
    /**
      * Channels to join
      * @default []
      */
    var channels: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Should we output debug messages to STDOUT?
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encoding to use. See
      * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Should we queue our messages to ensure we don't get kicked?
      * @default false
      */
    var floodProtection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delay between messages when flood protection is active
      * @default 1000
      */
    var floodProtectionDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Local interface to bind to for network connections. See
      * https://nodejs.org/api/net.html#net_socket_localaddress
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Characters to split a message at.
      * @default 512
      */
    var messageSplit: js.UndefOr[Double] = js.undefined
    
    /**
      * IRC username
      * @default ''
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * IRC connection port. See
      * https://nodejs.org/api/net.html#net_socket_remoteport
      * @default 6667
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * IRC "real name"
      * @default 'nodeJS IRC client'
      */
    var realName: js.UndefOr[String] = js.undefined
    
    /**
      * Should we use SASL authentication?
      * @default false
      */
    var sasl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should SSL be used? Can either be true or crypto credentials.
      * @default false
      */
    var secure: js.UndefOr[Boolean | SecureContext] = js.undefined
    
    /**
      * Should we accept self-signed certificates?
      * @default false
      */
    var selfSigned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should we output IRC errors?
      * @default false
      */
    var showErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should we strip mIRC colors from the output messages?
      * @default false
      */
    var stripColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * IRC username
      * @default 'nodebot'
      */
    var userName: js.UndefOr[String] = js.undefined
  }
  object IClientOpts {
    
    inline def apply(): IClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOpts]
    }
    
    extension [Self <: IClientOpts](x: Self) {
      
      inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      inline def setAutoRejoin(value: Boolean): Self = StObject.set(x, "autoRejoin", value.asInstanceOf[js.Any])
      
      inline def setAutoRejoinUndefined: Self = StObject.set(x, "autoRejoin", js.undefined)
      
      inline def setCertExpired(value: Boolean): Self = StObject.set(x, "certExpired", value.asInstanceOf[js.Any])
      
      inline def setCertExpiredUndefined: Self = StObject.set(x, "certExpired", js.undefined)
      
      inline def setChannelPrefixes(value: String): Self = StObject.set(x, "channelPrefixes", value.asInstanceOf[js.Any])
      
      inline def setChannelPrefixesUndefined: Self = StObject.set(x, "channelPrefixes", js.undefined)
      
      inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFloodProtection(value: Boolean): Self = StObject.set(x, "floodProtection", value.asInstanceOf[js.Any])
      
      inline def setFloodProtectionDelay(value: Double): Self = StObject.set(x, "floodProtectionDelay", value.asInstanceOf[js.Any])
      
      inline def setFloodProtectionDelayUndefined: Self = StObject.set(x, "floodProtectionDelay", js.undefined)
      
      inline def setFloodProtectionUndefined: Self = StObject.set(x, "floodProtection", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMessageSplit(value: Double): Self = StObject.set(x, "messageSplit", value.asInstanceOf[js.Any])
      
      inline def setMessageSplitUndefined: Self = StObject.set(x, "messageSplit", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRealName(value: String): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
      
      inline def setRealNameUndefined: Self = StObject.set(x, "realName", js.undefined)
      
      inline def setSasl(value: Boolean): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
      
      inline def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
      
      inline def setSecure(value: Boolean | SecureContext): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSelfSigned(value: Boolean): Self = StObject.set(x, "selfSigned", value.asInstanceOf[js.Any])
      
      inline def setSelfSignedUndefined: Self = StObject.set(x, "selfSigned", js.undefined)
      
      inline def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      inline def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      inline def setStripColors(value: Boolean): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      inline def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
  
  trait IMessage extends StObject {
    
    /** Command arguments */
    var args: js.Array[String]
    
    /** Mapped IRC command */
    var command: String
    
    /** Command type */
    var commandType: CommandType
    
    /** Prefix */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** Raw IRC command */
    var rawCommand: String
  }
  object IMessage {
    
    inline def apply(args: js.Array[String], command: String, commandType: CommandType, rawCommand: String): IMessage = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandType = commandType.asInstanceOf[js.Any], rawCommand = rawCommand.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    extension [Self <: IMessage](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandType(value: CommandType): Self = StObject.set(x, "commandType", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRawCommand(value: String): Self = StObject.set(x, "rawCommand", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWhoisData extends StObject {
    
    /** Channels */
    var channels: js.Array[String]
    
    /** Hostnamej */
    var host: String
    
    /** Nickname */
    var nick: String
    
    /** Is this user an operator? */
    var operator: String
    
    /** Real name" */
    var realname: String
    
    /** Server */
    var server: String
    
    /** Server description string */
    var serverinfo: String
    
    /** Username */
    var user: String
  }
  object IWhoisData {
    
    inline def apply(
      channels: js.Array[String],
      host: String,
      nick: String,
      operator: String,
      realname: String,
      server: String,
      serverinfo: String,
      user: String
    ): IWhoisData = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], realname = realname.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], serverinfo = serverinfo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWhoisData]
    }
    
    extension [Self <: IWhoisData](x: Self) {
      
      inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setRealname(value: String): Self = StObject.set(x, "realname", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerinfo(value: String): Self = StObject.set(x, "serverinfo", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Handler functions for Client.
    */
  object handlers {
    
    type IAction = js.Function4[/* from */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IChannelList = js.Function1[/* list */ js.Array[IChannel], Unit]
    
    type ICtcp = js.Function5[
        /* from */ String, 
        /* to */ String, 
        /* text */ String, 
        /* type */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    @js.native
    trait ICtcpSpecific extends StObject {
      
      /**
        * @param from - sender
        * @param to - recievier
        * @param message - raw message
        */
      def apply(from: String, to: String, text: String, message: IMessage): Unit = js.native
      def apply(from: String, to: String, text: String, `type`: String, message: IMessage): Unit = js.native
    }
    
    type IError = js.Function1[/* message */ IMessage, Unit]
    
    type IInvite = js.Function3[/* channel */ String, /* from */ String, /* message */ IMessage, Unit]
    
    type IJoin = js.Function3[/* channel */ String, /* nick */ String, /* message */ IMessage, Unit]
    
    type IJoinChannel = js.Function2[/* nick */ String, /* message */ IMessage, Unit]
    
    type IKick = js.Function5[
        /* channel */ String, 
        /* nick */ String, 
        /* by */ String, 
        /* reason */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IKickChannel = js.Function4[/* nick */ String, /* by */ String, /* reason */ String, /* message */ IMessage, Unit]
    
    type IMessageAllChannels = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IMessageChannel = js.Function3[/* nick */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IModeChange = js.Function5[
        /* channel */ String, 
        /* by */ String, 
        /* mode */ String, 
        /* argument */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IMotd = js.Function1[/* motd */ String, Unit]
    
    type INames = js.Function2[/* channel */ String, /* nicks */ js.Array[String], Unit]
    
    type INamesChannel = js.Function1[/* nicks */ js.Array[String], Unit]
    
    type INick = js.Function4[
        /* oldnick */ String, 
        /* newnick */ String, 
        /* channels */ js.Array[String], 
        /* message */ IMessage, 
        Unit
      ]
    
    type INotice = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IPart = js.Function4[
        /* channel */ String, 
        /* nick */ String, 
        /* reason */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IPartChannel = js.Function3[/* nick */ String, /* reason */ String, /* message */ IMessage, Unit]
    
    type IPing = js.Function1[/* server */ String, Unit]
    
    type IPm = js.Function3[/* nick */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IRaw = js.Function1[/* message */ IMessage, Unit]
    
    type IRecievedMessage = js.Function4[/* nick */ String, /* to */ String, /* text */ String, /* message */ IMessage, Unit]
    
    type IRegistered = js.Function1[/* message */ IMessage, Unit]
    
    type ISelfMessage = js.Function2[/* to */ String, /* text */ String, Unit]
    
    type ITopic = js.Function4[
        /* channel */ String, 
        /* topic */ String, 
        /* nick */ String, 
        /* message */ IMessage, 
        Unit
      ]
    
    type IWhois = js.Function1[/* info */ IWhoisData, Unit]
  }
}
