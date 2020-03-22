package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.CheckIndexOptions> */
trait PartialCheckIndexOptions extends js.Object {
  var randomSampling: js.UndefOr[Boolean] = js.undefined
  var randomSamplingFactor: js.UndefOr[Double] = js.undefined
  var repair: js.UndefOr[Boolean] = js.undefined
}

object PartialCheckIndexOptions {
  @scala.inline
  def apply(
    randomSampling: js.UndefOr[Boolean] = js.undefined,
    randomSamplingFactor: Int | Double = null,
    repair: js.UndefOr[Boolean] = js.undefined
  ): PartialCheckIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(randomSampling)) __obj.updateDynamic("randomSampling")(randomSampling.asInstanceOf[js.Any])
    if (randomSamplingFactor != null) __obj.updateDynamic("randomSamplingFactor")(randomSamplingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(repair)) __obj.updateDynamic("repair")(repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCheckIndexOptions]
  }
}

