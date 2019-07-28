package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMetadata extends js.Object {
  var errorCode: Double
  var groupId: String
  var members: js.Array[GroupMemberMetadata]
  var protocol: String
  var protocolType: String
  var state: String
}

object GroupMetadata {
  @scala.inline
  def apply(
    errorCode: Double,
    groupId: String,
    members: js.Array[GroupMemberMetadata],
    protocol: String,
    protocolType: String,
    state: String
  ): GroupMetadata = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, groupId = groupId, members = members, protocol = protocol, protocolType = protocolType, state = state)
  
    __obj.asInstanceOf[GroupMetadata]
  }
}

