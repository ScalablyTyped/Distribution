package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrabbitmq extends js.Object {
  def publish(
    exchange: java.lang.String,
    routingkey: java.lang.String,
    contenttype: java.lang.String,
    messagebody: java.lang.String
  ): scala.Double
  def publish_consume(
    exchange: java.lang.String,
    routingkey: java.lang.String,
    contenttype: java.lang.String,
    messagebody: java.lang.String,
    dpv: java.lang.String
  ): scala.Double
}

object Typeofrabbitmq {
  @scala.inline
  def apply(
    publish: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    publish_consume: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Typeofrabbitmq = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction4(publish), publish_consume = js.Any.fromFunction5(publish_consume))
  
    __obj.asInstanceOf[Typeofrabbitmq]
  }
}

