package typings.hlsParser.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var classId: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var endOnNext: js.UndefOr[Boolean] = js.undefined
  var id: String
  var plannedDuration: js.UndefOr[Double] = js.undefined
  var start: Date
}

object Attributes {
  @scala.inline
  def apply(
    id: String,
    start: Date,
    attributes: js.Object = null,
    classId: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    end: Date = null,
    endOnNext: js.UndefOr[Boolean] = js.undefined,
    plannedDuration: js.UndefOr[Double] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classId != null) __obj.updateDynamic("classId")(classId.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnNext)) __obj.updateDynamic("endOnNext")(endOnNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plannedDuration)) __obj.updateDynamic("plannedDuration")(plannedDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

