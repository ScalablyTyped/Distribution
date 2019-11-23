package typings.hlsDashParser

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var classId: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var endOnNext: js.UndefOr[Boolean] = js.undefined
  var id: String
  var plannedDuration: js.UndefOr[Double] = js.undefined
  var start: Date
}

object Anon_Attributes {
  @scala.inline
  def apply(
    id: String,
    start: Date,
    attributes: js.Object = null,
    classId: String = null,
    duration: Int | Double = null,
    end: Date = null,
    endOnNext: js.UndefOr[Boolean] = js.undefined,
    plannedDuration: Int | Double = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(id = id, start = start)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classId != null) __obj.updateDynamic("classId")(classId)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(endOnNext)) __obj.updateDynamic("endOnNext")(endOnNext)
    if (plannedDuration != null) __obj.updateDynamic("plannedDuration")(plannedDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes]
  }
}

