package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Topic extends js.Object {
  var topic: java.lang.String
}

object Anon_Topic {
  @scala.inline
  def apply(topic: java.lang.String): Anon_Topic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_Topic]
  }
}

