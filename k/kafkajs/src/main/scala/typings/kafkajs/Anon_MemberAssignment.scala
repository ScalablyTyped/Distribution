package typings.kafkajs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MemberAssignment extends js.Object {
  var memberAssignment: Buffer
  var memberId: Double
}

object Anon_MemberAssignment {
  @scala.inline
  def apply(memberAssignment: Buffer, memberId: Double): Anon_MemberAssignment = {
    val __obj = js.Dynamic.literal(memberAssignment = memberAssignment, memberId = memberId)
  
    __obj.asInstanceOf[Anon_MemberAssignment]
  }
}

