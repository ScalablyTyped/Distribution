package typings
package jackrabbitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amqp extends js.Object {
  var amqp: js.Any
  var connection: amqplibLib.amqplibMod.Connection
}

object Anon_Amqp {
  @scala.inline
  def apply(amqp: js.Any, connection: amqplibLib.amqplibMod.Connection): Anon_Amqp = {
    val __obj = js.Dynamic.literal(amqp = amqp, connection = connection)
  
    __obj.asInstanceOf[Anon_Amqp]
  }
}

