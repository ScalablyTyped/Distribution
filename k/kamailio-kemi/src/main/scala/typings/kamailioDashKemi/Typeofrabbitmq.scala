package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrabbitmq extends js.Object {
  def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double
  def publish_consume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double
}

object Typeofrabbitmq {
  @scala.inline
  def apply(
    publish: (String, String, String, String) => Double,
    publish_consume: (String, String, String, String, String) => Double
  ): Typeofrabbitmq = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction4(publish), publish_consume = js.Any.fromFunction5(publish_consume))
  
    __obj.asInstanceOf[Typeofrabbitmq]
  }
}

