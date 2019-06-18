package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMemberMetadata extends js.Object {
  var clientHost: java.lang.String
  var clientId: java.lang.String
  var memberAssignment: nodeLib.Buffer
  var memberId: java.lang.String
  var memberMetadata: nodeLib.Buffer
}

object GroupMemberMetadata {
  @scala.inline
  def apply(
    clientHost: java.lang.String,
    clientId: java.lang.String,
    memberAssignment: nodeLib.Buffer,
    memberId: java.lang.String,
    memberMetadata: nodeLib.Buffer
  ): GroupMemberMetadata = {
    val __obj = js.Dynamic.literal(clientHost = clientHost, clientId = clientId, memberAssignment = memberAssignment, memberId = memberId, memberMetadata = memberMetadata)
  
    __obj.asInstanceOf[GroupMemberMetadata]
  }
}

