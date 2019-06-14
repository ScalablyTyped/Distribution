package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Broker extends js.Object {
  var broker: java.lang.String
  var clientId: java.lang.String
  var queueSize: scala.Double
}

object Anon_Broker {
  @scala.inline
  def apply(broker: java.lang.String, clientId: java.lang.String, queueSize: scala.Double): Anon_Broker = {
    val __obj = js.Dynamic.literal(broker = broker, clientId = clientId, queueSize = queueSize)
  
    __obj.asInstanceOf[Anon_Broker]
  }
}

