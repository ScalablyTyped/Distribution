package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Members extends js.Object {
  var members: js.Array[kafkajsLib.kafkajsMod.GroupMember]
  var topics: js.Array[java.lang.String]
  var userData: nodeLib.Buffer
}

object Anon_Members {
  @scala.inline
  def apply(
    members: js.Array[kafkajsLib.kafkajsMod.GroupMember],
    topics: js.Array[java.lang.String],
    userData: nodeLib.Buffer
  ): Anon_Members = {
    val __obj = js.Dynamic.literal(members = members, topics = topics, userData = userData)
  
    __obj.asInstanceOf[Anon_Members]
  }
}

