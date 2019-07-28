package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerOptions extends js.Object {
  var allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined
  var groupId: String
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var maxBytes: js.UndefOr[Double] = js.undefined
  var maxBytesPerPartition: js.UndefOr[Double] = js.undefined
  var maxWaitTimeInMs: js.UndefOr[Double] = js.undefined
  var metadataMaxAge: js.UndefOr[Double] = js.undefined
  var minBytes: js.UndefOr[Double] = js.undefined
  var partitionAssigners: js.UndefOr[js.Array[PartitionAssigner]] = js.undefined
  var readUncommitted: js.UndefOr[Boolean] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
}

object ConsumerOptions {
  @scala.inline
  def apply(
    groupId: String,
    allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined,
    heartbeatInterval: Int | Double = null,
    maxBytes: Int | Double = null,
    maxBytesPerPartition: Int | Double = null,
    maxWaitTimeInMs: Int | Double = null,
    metadataMaxAge: Int | Double = null,
    minBytes: Int | Double = null,
    partitionAssigners: js.Array[PartitionAssigner] = null,
    readUncommitted: js.UndefOr[Boolean] = js.undefined,
    retry: RetryOptions = null,
    sessionTimeout: Int | Double = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId)
    if (!js.isUndefined(allowAutoTopicCreation)) __obj.updateDynamic("allowAutoTopicCreation")(allowAutoTopicCreation)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxBytesPerPartition != null) __obj.updateDynamic("maxBytesPerPartition")(maxBytesPerPartition.asInstanceOf[js.Any])
    if (maxWaitTimeInMs != null) __obj.updateDynamic("maxWaitTimeInMs")(maxWaitTimeInMs.asInstanceOf[js.Any])
    if (metadataMaxAge != null) __obj.updateDynamic("metadataMaxAge")(metadataMaxAge.asInstanceOf[js.Any])
    if (minBytes != null) __obj.updateDynamic("minBytes")(minBytes.asInstanceOf[js.Any])
    if (partitionAssigners != null) __obj.updateDynamic("partitionAssigners")(partitionAssigners)
    if (!js.isUndefined(readUncommitted)) __obj.updateDynamic("readUncommitted")(readUncommitted)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

