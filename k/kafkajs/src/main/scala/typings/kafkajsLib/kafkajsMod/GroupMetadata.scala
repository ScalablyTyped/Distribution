package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMetadata extends js.Object {
  var errorCode: scala.Double
  var groupId: java.lang.String
  var members: js.Array[GroupMemberMetadata]
  var protocol: java.lang.String
  var protocolType: java.lang.String
  var state: java.lang.String
}

object GroupMetadata {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    groupId: java.lang.String,
    members: js.Array[GroupMemberMetadata],
    protocol: java.lang.String,
    protocolType: java.lang.String,
    state: java.lang.String
  ): GroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("groupId")(groupId)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("protocolType")(protocolType)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GroupMetadata]
  }
}

