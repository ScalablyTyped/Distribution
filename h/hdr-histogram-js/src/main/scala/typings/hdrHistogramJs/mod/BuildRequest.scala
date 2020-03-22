package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.hdrHistogramJsNumbers.`16`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`1`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`2`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`32`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`3`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`4`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`5`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`64`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`8`
import typings.hdrHistogramJs.hdrHistogramJsStrings.packed
import typings.hdrHistogramJs.hdrHistogramJsStrings.sparse_array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRequest extends js.Object {
  /**
    * Control whether or not the histogram can auto-resize and auto-adjust it's
    * highestTrackableValue
    * Default value is true
    */
  var autoResize: js.UndefOr[Boolean] = js.undefined
  /**
    * The size in bit of each count bucket
    * Default value is 32
    */
  var bitBucketSize: js.UndefOr[`8` | `16` | `32` | `64` | packed | sparse_array] = js.undefined
  /**
    * The highest value to be tracked by the histogram. Must be a positive
    * integer that is {@literal >=} (2 * lowestDiscernibleValue).
    * Default value is Number.MAX_SAFE_INTEGER
    */
  var highestTrackableValue: js.UndefOr[Double] = js.undefined
  /**
    * The lowest value that can be discerned (distinguished from 0) by the histogram.
    * Must be a positive integer that is {@literal >=} 1. May be internally rounded
    * down to nearest power of 2.
    * Default value is 1
    */
  var lowestDiscernibleValue: js.UndefOr[Double] = js.undefined
  /**
    * The number of significant decimal digits to which the histogram will
    * maintain value resolution and separation. Must be a non-negative
    * integer between 0 and 5.
    * Default value is 3
    */
  var numberOfSignificantValueDigits: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
}

object BuildRequest {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[Boolean] = js.undefined,
    bitBucketSize: `8` | `16` | `32` | `64` | packed | sparse_array = null,
    highestTrackableValue: Int | Double = null,
    lowestDiscernibleValue: Int | Double = null,
    numberOfSignificantValueDigits: `1` | `2` | `3` | `4` | `5` = null
  ): BuildRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (bitBucketSize != null) __obj.updateDynamic("bitBucketSize")(bitBucketSize.asInstanceOf[js.Any])
    if (highestTrackableValue != null) __obj.updateDynamic("highestTrackableValue")(highestTrackableValue.asInstanceOf[js.Any])
    if (lowestDiscernibleValue != null) __obj.updateDynamic("lowestDiscernibleValue")(lowestDiscernibleValue.asInstanceOf[js.Any])
    if (numberOfSignificantValueDigits != null) __obj.updateDynamic("numberOfSignificantValueDigits")(numberOfSignificantValueDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRequest]
  }
}

