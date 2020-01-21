package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing temporal values of a variable.
  */
@js.native
trait SchemaIntegerGauge extends js.Object {
  /**
    * The time at which this value was measured. Measured as msecs from epoch.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The value of the variable represented by this gauge.
    */
  var value: js.UndefOr[SchemaSplitInt64] = js.native
}

object SchemaIntegerGauge {
  @scala.inline
  def apply(timestamp: String = null, value: SchemaSplitInt64 = null): SchemaIntegerGauge = {
    val __obj = js.Dynamic.literal()
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntegerGauge]
  }
}

