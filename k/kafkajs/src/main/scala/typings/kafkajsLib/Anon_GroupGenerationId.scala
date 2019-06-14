package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupGenerationId extends js.Object {
  var groupGenerationId: scala.Double
  var groupId: java.lang.String
  var memberId: java.lang.String
  var retentionTime: js.UndefOr[scala.Double] = js.undefined
  var topics: js.Array[Anon_Partitions]
}

object Anon_GroupGenerationId {
  @scala.inline
  def apply(
    groupGenerationId: scala.Double,
    groupId: java.lang.String,
    memberId: java.lang.String,
    topics: js.Array[Anon_Partitions],
    retentionTime: scala.Int | scala.Double = null
  ): Anon_GroupGenerationId = {
    val __obj = js.Dynamic.literal(groupGenerationId = groupGenerationId, groupId = groupId, memberId = memberId, topics = topics)
    if (retentionTime != null) __obj.updateDynamic("retentionTime")(retentionTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupGenerationId]
  }
}

