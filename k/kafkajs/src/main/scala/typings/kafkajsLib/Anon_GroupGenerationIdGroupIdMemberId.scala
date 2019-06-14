package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupGenerationIdGroupIdMemberId extends js.Object {
  var groupGenerationId: scala.Double
  var groupId: java.lang.String
  var memberId: java.lang.String
  var topics: js.Array[Anon_PartitionsTopic]
}

object Anon_GroupGenerationIdGroupIdMemberId {
  @scala.inline
  def apply(
    groupGenerationId: scala.Double,
    groupId: java.lang.String,
    memberId: java.lang.String,
    topics: js.Array[Anon_PartitionsTopic]
  ): Anon_GroupGenerationIdGroupIdMemberId = {
    val __obj = js.Dynamic.literal(groupGenerationId = groupGenerationId, groupId = groupId, memberId = memberId, topics = topics)
  
    __obj.asInstanceOf[Anon_GroupGenerationIdGroupIdMemberId]
  }
}

