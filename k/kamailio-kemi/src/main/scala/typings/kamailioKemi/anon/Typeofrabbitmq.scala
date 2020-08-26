package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrabbitmq extends js.Object {
  def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double = js.native
  def publish_consume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double = js.native
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
  @scala.inline
  implicit class TypeofrabbitmqOps[Self <: Typeofrabbitmq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPublish(value: (String, String, String, String) => Double): Self = this.set("publish", js.Any.fromFunction4(value))
    @scala.inline
    def setPublish_consume(value: (String, String, String, String, String) => Double): Self = this.set("publish_consume", js.Any.fromFunction5(value))
  }
  
}

