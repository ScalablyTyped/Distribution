package typings
package ircLib.ircMod.NodeIRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWhoisData extends js.Object {
  /** Channels */
  var channels: js.Array[java.lang.String]
  /** Hostnamej */
  var host: java.lang.String
  /** Nickname */
  var nick: java.lang.String
  /** Is this user an operator? */
  var operator: java.lang.String
  /** Real name" */
  var realname: java.lang.String
  /** Server */
  var server: java.lang.String
  /** Server description string */
  var serverinfo: java.lang.String
  /** Username */
  var user: java.lang.String
}

object IWhoisData {
  @scala.inline
  def apply(
    channels: js.Array[java.lang.String],
    host: java.lang.String,
    nick: java.lang.String,
    operator: java.lang.String,
    realname: java.lang.String,
    server: java.lang.String,
    serverinfo: java.lang.String,
    user: java.lang.String
  ): IWhoisData = {
    val __obj = js.Dynamic.literal(channels = channels, host = host, nick = nick, operator = operator, realname = realname, server = server, serverinfo = serverinfo, user = user)
  
    __obj.asInstanceOf[IWhoisData]
  }
}

