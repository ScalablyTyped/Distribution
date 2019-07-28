package typings.irc.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChannel extends js.Object {
  /** Channel name */
  var name: String
  /** Topic string */
  var topic: String
  /** User count */
  var users: String
}

object IChannel {
  @scala.inline
  def apply(name: String, topic: String, users: String): IChannel = {
    val __obj = js.Dynamic.literal(name = name, topic = topic, users = users)
  
    __obj.asInstanceOf[IChannel]
  }
}

