package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js/SparseArrayHistogram", JSImport.Namespace)
@js.native
object sparseArrayHistogramMod extends js.Object {
  
  @js.native
  trait SparseArrayHistogram extends AbstractHistogram {
    
    var counts: js.Array[Double] = js.native
    
    var totalCount: Double = js.native
  }
  
  @js.native
  class default protected () extends SparseArrayHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
}
