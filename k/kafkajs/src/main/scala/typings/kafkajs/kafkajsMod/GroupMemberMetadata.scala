package typings.kafkajs.kafkajsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMemberMetadata extends js.Object {
  var clientHost: String
  var clientId: String
  var memberAssignment: Buffer
  var memberId: String
  var memberMetadata: Buffer
}

object GroupMemberMetadata {
  @scala.inline
  def apply(
    clientHost: String,
    clientId: String,
    memberAssignment: Buffer,
    memberId: String,
    memberMetadata: Buffer
  ): GroupMemberMetadata = {
    val __obj = js.Dynamic.literal(clientHost = clientHost, clientId = clientId, memberAssignment = memberAssignment, memberId = memberId, memberMetadata = memberMetadata)
  
    __obj.asInstanceOf[GroupMemberMetadata]
  }
}

