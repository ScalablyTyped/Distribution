package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var timing: js.UndefOr[String] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    properties: js.Array[String] = null,
    timing: String = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

