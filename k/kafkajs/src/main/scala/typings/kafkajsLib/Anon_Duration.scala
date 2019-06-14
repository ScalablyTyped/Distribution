package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var groupId: java.lang.String
  var groupProtocol: java.lang.String
  var isLeader: scala.Boolean
  var leaderId: java.lang.String
  var memberAssignment: kafkajsLib.kafkajsMod.IMemberAssignment
  var memberId: java.lang.String
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    groupId: java.lang.String,
    groupProtocol: java.lang.String,
    isLeader: scala.Boolean,
    leaderId: java.lang.String,
    memberAssignment: kafkajsLib.kafkajsMod.IMemberAssignment,
    memberId: java.lang.String
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, groupId = groupId, groupProtocol = groupProtocol, isLeader = isLeader, leaderId = leaderId, memberAssignment = memberAssignment, memberId = memberId)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

