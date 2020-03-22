package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/Float64Histogram", JSImport.Namespace)
@js.native
object float64HistogramMod extends js.Object {
  @js.native
  trait Float64Histogram extends AbstractHistogram {
    var counts: Float64Array = js.native
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Float64Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
}

