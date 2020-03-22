package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/Int32Histogram", JSImport.Namespace)
@js.native
object int32HistogramMod extends js.Object {
  @js.native
  trait Int32Histogram extends AbstractHistogram {
    var counts: Uint32Array = js.native
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Int32Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
}

