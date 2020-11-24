package typings.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler functions for Client.
  */
@JSImport("irc", "handlers")
@js.native
object handlers extends js.Object {
  
  @js.native
  trait ICtcpSpecific extends js.Object {
    
    /**
      * @param from - sender
      * @param to - recievier
      * @param message - raw message
      */
    def apply(from: String, to: String, text: String, message: IMessage): Unit = js.native
    def apply(from: String, to: String, text: String, `type`: String, message: IMessage): Unit = js.native
  }
  
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
