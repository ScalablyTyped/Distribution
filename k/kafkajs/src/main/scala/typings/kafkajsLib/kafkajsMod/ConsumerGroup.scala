package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerGroup extends js.Object {
  var coordinator: Broker
  var generationId: scala.Double
  var groupId: java.lang.String
  var memberId: java.lang.String
}

object ConsumerGroup {
  @scala.inline
  def apply(
    coordinator: Broker,
    generationId: scala.Double,
    groupId: java.lang.String,
    memberId: java.lang.String
  ): ConsumerGroup = {
    val __obj = js.Dynamic.literal(coordinator = coordinator, generationId = generationId, groupId = groupId, memberId = memberId)
  
    __obj.asInstanceOf[ConsumerGroup]
  }
}

