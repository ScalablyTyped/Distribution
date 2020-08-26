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

@js.native
trait BuildRequest extends js.Object {
  /**
    * Control whether or not the histogram can auto-resize and auto-adjust it's
    * highestTrackableValue
    * Default value is true
    */
  var autoResize: js.UndefOr[Boolean] = js.native
  /**
    * The size in bit of each count bucket
    * Default value is 32
    */
  var bitBucketSize: js.UndefOr[`8` | `16` | `32` | `64` | packed | sparse_array] = js.native
  /**
    * The highest value to be tracked by the histogram. Must be a positive
    * integer that is {@literal >=} (2 * lowestDiscernibleValue).
    * Default value is Number.MAX_SAFE_INTEGER
    */
  var highestTrackableValue: js.UndefOr[Double] = js.native
  /**
    * The lowest value that can be discerned (distinguished from 0) by the histogram.
    * Must be a positive integer that is {@literal >=} 1. May be internally rounded
    * down to nearest power of 2.
    * Default value is 1
    */
  var lowestDiscernibleValue: js.UndefOr[Double] = js.native
  /**
    * The number of significant decimal digits to which the histogram will
    * maintain value resolution and separation. Must be a non-negative
    * integer between 0 and 5.
    * Default value is 3
    */
  var numberOfSignificantValueDigits: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
}

object BuildRequest {
  @scala.inline
  def apply(): BuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildRequest]
  }
  @scala.inline
  implicit class BuildRequestOps[Self <: BuildRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    @scala.inline
    def setBitBucketSize(value: `8` | `16` | `32` | `64` | packed | sparse_array): Self = this.set("bitBucketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitBucketSize: Self = this.set("bitBucketSize", js.undefined)
    @scala.inline
    def setHighestTrackableValue(value: Double): Self = this.set("highestTrackableValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighestTrackableValue: Self = this.set("highestTrackableValue", js.undefined)
    @scala.inline
    def setLowestDiscernibleValue(value: Double): Self = this.set("lowestDiscernibleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowestDiscernibleValue: Self = this.set("lowestDiscernibleValue", js.undefined)
    @scala.inline
    def setNumberOfSignificantValueDigits(value: `1` | `2` | `3` | `4` | `5`): Self = this.set("numberOfSignificantValueDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfSignificantValueDigits: Self = this.set("numberOfSignificantValueDigits", js.undefined)
  }
  
}

