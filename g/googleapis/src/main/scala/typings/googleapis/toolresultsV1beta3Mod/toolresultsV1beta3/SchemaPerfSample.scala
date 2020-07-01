package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a single performance measure or data point
  */
@js.native
trait SchemaPerfSample extends js.Object {
  /**
    * Timestamp of collection
    */
  var sampleTime: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * Value observed
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaPerfSample {
  @scala.inline
  def apply(sampleTime: SchemaTimestamp = null, value: js.UndefOr[Double] = js.undefined): SchemaPerfSample = {
    val __obj = js.Dynamic.literal()
    if (sampleTime != null) __obj.updateDynamic("sampleTime")(sampleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerfSample]
  }
}

