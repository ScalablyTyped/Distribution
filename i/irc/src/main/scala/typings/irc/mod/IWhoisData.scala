package typings.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWhoisData extends js.Object {
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
  @scala.inline
  def apply(
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
}

