package typings
package ircLib.ircMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChannel extends js.Object {
  /** Channel name */
  var name: java.lang.String
  /** Topic string */
  var topic: java.lang.String
  /** User count */
  var users: java.lang.String
}

object IChannel {
  @scala.inline
  def apply(name: java.lang.String, topic: java.lang.String, users: java.lang.String): IChannel = {
    val __obj = js.Dynamic.literal(name = name, topic = topic, users = users)
  
    __obj.asInstanceOf[IChannel]
  }
}

