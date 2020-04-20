package typings.jackrabbit

import typings.amqplib.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmqp extends js.Object {
  var amqp: js.Any
  var connection: Connection
}

object AnonAmqp {
  @scala.inline
  def apply(amqp: js.Any, connection: Connection): AnonAmqp = {
    val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmqp]
  }
}

