package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseArrayHistogramMod {
  
  @JSImport("hdr-histogram-js/SparseArrayHistogram", JSImport.Default)
  @js.native
  class default protected () extends SparseArrayHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait SparseArrayHistogram extends AbstractHistogram {
    
    var counts: js.Array[Double] = js.native
    
    var totalCount: Double = js.native
  }
}
