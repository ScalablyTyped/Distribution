package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSchedulingConfig extends js.Object {
  var preemptible: js.UndefOr[Boolean] = js.native
}

object SchemaSchedulingConfig {
  @scala.inline
  def apply(preemptible: js.UndefOr[Boolean] = js.undefined): SchemaSchedulingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSchedulingConfig]
  }
}

