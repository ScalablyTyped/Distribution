package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMemberAssignment extends js.Object {
  var memberAssignment: nodeLib.Buffer
  var memberId: java.lang.String
}

object GroupMemberAssignment {
  @scala.inline
  def apply(memberAssignment: nodeLib.Buffer, memberId: java.lang.String): GroupMemberAssignment = {
    val __obj = js.Dynamic.literal(memberAssignment = memberAssignment, memberId = memberId)
  
    __obj.asInstanceOf[GroupMemberAssignment]
  }
}

