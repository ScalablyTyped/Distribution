package typings.jestImageSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelmatchOptions extends js.Object {
  /**
    * If true, disables detecting and ignoring anti-aliased pixels.
    * @default false
    */
  val includeAA: js.UndefOr[Boolean] = js.undefined
  /**
    * Matching threshold, ranges from 0 to 1.
    * Smaller values make the comparison more sensitive.
    * @default 0.1
    */
  val threshold: js.UndefOr[Double] = js.undefined
}

object PixelmatchOptions {
  @scala.inline
  def apply(includeAA: js.UndefOr[Boolean] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): PixelmatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelmatchOptions]
  }
}

