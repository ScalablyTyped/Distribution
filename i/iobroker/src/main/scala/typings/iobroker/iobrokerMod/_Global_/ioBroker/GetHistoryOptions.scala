package typings.iobroker.iobrokerMod._Global_.ioBroker

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
    count: Int | Double = null,
    end: Int | Double = null,
    from: js.UndefOr[Boolean] = js.undefined,
    ignoreNull: js.UndefOr[Boolean] = js.undefined,
    instance: String = null,
    limit: Int | Double = null,
    q: js.UndefOr[Boolean] = js.undefined,
    sessionId: js.Any = null,
    start: Int | Double = null,
    step: Int | Double = null
  ): GetHistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.asInstanceOf[js.Any])
    if (!js.isUndefined(addID)) __obj.updateDynamic("addID")(addID.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNull)) __obj.updateDynamic("ignoreNull")(ignoreNull.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(q)) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistoryOptions]
  }
}

