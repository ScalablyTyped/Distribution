package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Earliest extends js.Object {
  var earliest: scala.Boolean
  var groupId: java.lang.String
  var topic: java.lang.String
}

object Anon_Earliest {
  @scala.inline
  def apply(earliest: scala.Boolean, groupId: java.lang.String, topic: java.lang.String): Anon_Earliest = {
    val __obj = js.Dynamic.literal(earliest = earliest, groupId = groupId, topic = topic)
  
    __obj.asInstanceOf[Anon_Earliest]
  }
}

