package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/Int8Histogram", JSImport.Namespace)
@js.native
object int8HistogramMod extends js.Object {
  @js.native
  trait Int8Histogram extends AbstractHistogram {
    var counts: Uint8Array = js.native
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Int8Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
}

