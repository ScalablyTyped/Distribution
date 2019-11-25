package typings.jackrabbit

import typings.amqplib.amqplibMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amqp extends js.Object {
  var amqp: js.Any
  var connection: Connection
}

object Anon_Amqp {
  @scala.inline
  def apply(amqp: js.Any, connection: Connection): Anon_Amqp = {
    val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Amqp]
  }
}

