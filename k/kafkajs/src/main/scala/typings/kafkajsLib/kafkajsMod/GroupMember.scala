package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMember extends js.Object {
  var memberId: java.lang.String
}

object GroupMember {
  @scala.inline
  def apply(memberId: java.lang.String): GroupMember = {
    val __obj = js.Dynamic.literal(memberId = memberId)
  
    __obj.asInstanceOf[GroupMember]
  }
}

