package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/Int16Histogram", JSImport.Namespace)
@js.native
object int16HistogramMod extends js.Object {
  @js.native
  trait Int16Histogram extends AbstractHistogram {
    var counts: Uint16Array = js.native
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends Int16Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
}

