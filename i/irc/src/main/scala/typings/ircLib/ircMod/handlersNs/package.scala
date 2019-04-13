package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlersNs {
  type IAction = js.Function4[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IChannelList = js.Function1[/* list */ js.Array[ircLib.ircMod.IChannel], scala.Unit]
  type ICtcp = js.Function5[
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    /* text */ java.lang.String, 
    /* type */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IError = js.Function1[/* message */ ircLib.ircMod.IMessage, scala.Unit]
  type IInvite = js.Function3[
    /* channel */ java.lang.String, 
    /* from */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IJoin = js.Function3[
    /* channel */ java.lang.String, 
    /* nick */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IJoinChannel = js.Function2[/* nick */ java.lang.String, /* message */ ircLib.ircMod.IMessage, scala.Unit]
  type IKick = js.Function5[
    /* channel */ java.lang.String, 
    /* nick */ java.lang.String, 
    /* by */ java.lang.String, 
    /* reason */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IKickChannel = js.Function4[
    /* nick */ java.lang.String, 
    /* by */ java.lang.String, 
    /* reason */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IMessageAllChannels = js.Function4[
    /* nick */ java.lang.String, 
    /* to */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IMessageChannel = js.Function3[
    /* nick */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IModeChange = js.Function5[
    /* channel */ java.lang.String, 
    /* by */ java.lang.String, 
    /* mode */ java.lang.String, 
    /* argument */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IMotd = js.Function1[/* motd */ java.lang.String, scala.Unit]
  type INames = js.Function2[/* channel */ java.lang.String, /* nicks */ js.Array[java.lang.String], scala.Unit]
  type INamesChannel = js.Function1[/* nicks */ js.Array[java.lang.String], scala.Unit]
  type INick = js.Function4[
    /* oldnick */ java.lang.String, 
    /* newnick */ java.lang.String, 
    /* channels */ js.Array[java.lang.String], 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type INotice = js.Function4[
    /* nick */ java.lang.String, 
    /* to */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IPart = js.Function4[
    /* channel */ java.lang.String, 
    /* nick */ java.lang.String, 
    /* reason */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IPartChannel = js.Function3[
    /* nick */ java.lang.String, 
    /* reason */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IPing = js.Function1[/* server */ java.lang.String, scala.Unit]
  type IPm = js.Function3[
    /* nick */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IRaw = js.Function1[/* message */ ircLib.ircMod.IMessage, scala.Unit]
  type IRecievedMessage = js.Function4[
    /* nick */ java.lang.String, 
    /* to */ java.lang.String, 
    /* text */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IRegistered = js.Function1[/* message */ ircLib.ircMod.IMessage, scala.Unit]
  type ISelfMessage = js.Function2[/* to */ java.lang.String, /* text */ java.lang.String, scala.Unit]
  type ITopic = js.Function4[
    /* channel */ java.lang.String, 
    /* topic */ java.lang.String, 
    /* nick */ java.lang.String, 
    /* message */ ircLib.ircMod.IMessage, 
    scala.Unit
  ]
  type IWhois = js.Function1[/* info */ ircLib.ircMod.IWhoisData, scala.Unit]
}
