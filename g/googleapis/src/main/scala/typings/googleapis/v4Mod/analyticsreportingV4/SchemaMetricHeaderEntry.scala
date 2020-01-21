package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Header for the metrics.
  */
@js.native
trait SchemaMetricHeaderEntry extends js.Object {
  /**
    * The name of the header.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the metric, for example `INTEGER`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMetricHeaderEntry {
  @scala.inline
  def apply(name: String = null, `type`: String = null): SchemaMetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricHeaderEntry]
  }
}

