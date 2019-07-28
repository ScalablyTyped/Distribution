package typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelmatchOptions extends js.Object {
  /** If true, disables detecting and ignoring anti-aliased pixels. false by default. */
  val includeAA: js.UndefOr[Boolean] = js.undefined
  /** Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive. 0.1 by default. */
  val threshold: js.UndefOr[Double] = js.undefined
}

object PixelmatchOptions {
  @scala.inline
  def apply(includeAA: js.UndefOr[Boolean] = js.undefined, threshold: Int | Double = null): PixelmatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAA)) __obj.updateDynamic("includeAA")(includeAA)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelmatchOptions]
  }
}

