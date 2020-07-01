package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader[T /* <: MessageType */] extends js.Object {
  /**
    * ISO 8601 timestamp for when the message is created
    */
  var date: String
  /**
    * Message id, typically UUID, must be unique per message
    */
  var msg_id: String
  /**
    * Message type
    */
  var msg_type: T
  /**
    * Session id, typically UUID, should be unique per session.
    */
  var session: String
  /**
    * The user sending the message
    */
  var username: String
  /**
    * The message protocol version, should be 5.1, 5.2, 5.3, etc.
    */
  var version: String
}

object IHeader {
  @scala.inline
  def apply[/* <: typings.jupyterlabServices.messagesMod.MessageType */ T](date: String, msg_id: String, msg_type: T, session: String, username: String, version: String): IHeader[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader[T]]
  }
}

