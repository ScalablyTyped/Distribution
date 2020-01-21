package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message containing the custome metric.
  */
@js.native
trait SchemaCustomMetric extends js.Object {
  /**
    * Custom metric name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Custom metric numeric value.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaCustomMetric {
  @scala.inline
  def apply(name: String = null, value: Int | Double = null): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomMetric]
  }
}

