package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.average
import typings.iobroker.iobrokerStrings.count
import typings.iobroker.iobrokerStrings.max
import typings.iobroker.iobrokerStrings.min
import typings.iobroker.iobrokerStrings.minmax
import typings.iobroker.iobrokerStrings.none
import typings.iobroker.iobrokerStrings.total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHistoryOptions extends js.Object {
  var ack: js.UndefOr[Boolean] = js.undefined
  var addID: js.UndefOr[Boolean] = js.undefined
  var aggregate: js.UndefOr[minmax | min | max | average | total | count | none] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Boolean] = js.undefined
  var ignoreNull: js.UndefOr[Boolean] = js.undefined
  var instance: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var q: js.UndefOr[Boolean] = js.undefined
  var sessionId: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object GetHistoryOptions {
  @scala.inline
  def apply(
    ack: js.UndefOr[Boolean] = js.undefined,
    addID: js.UndefOr[Boolean] = js.undefined,
    aggregate: minmax | min | max | average | total | count | none = null,
    count: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Boolean] = js.undefined,
    ignoreNull: js.UndefOr[Boolean] = js.undefined,
    instance: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    q: js.UndefOr[Boolean] = js.undefined,
    sessionId: js.Any = null,
    start: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): GetHistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addID)) __obj.updateDynamic("addID")(addID.get.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNull)) __obj.updateDynamic("ignoreNull")(ignoreNull.get.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q)) __obj.updateDynamic("q")(q.get.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistoryOptions]
  }
}

