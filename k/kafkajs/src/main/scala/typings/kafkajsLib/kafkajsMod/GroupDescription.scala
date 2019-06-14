package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupDescription extends js.Object {
  var groupId: java.lang.String
  var members: js.Array[MemberDescription]
  var protocol: java.lang.String
  var protocolType: java.lang.String
  var state: java.lang.String
}

object GroupDescription {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    members: js.Array[MemberDescription],
    protocol: java.lang.String,
    protocolType: java.lang.String,
    state: java.lang.String
  ): GroupDescription = {
    val __obj = js.Dynamic.literal(groupId = groupId, members = members, protocol = protocol, protocolType = protocolType, state = state)
  
    __obj.asInstanceOf[GroupDescription]
  }
}

