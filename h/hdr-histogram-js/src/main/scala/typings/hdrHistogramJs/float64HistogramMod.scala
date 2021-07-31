package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Float64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object float64HistogramMod {
  
  @JSImport("hdr-histogram-js/Float64Histogram", JSImport.Default)
  @js.native
  class default protected () extends Float64Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait Float64Histogram extends AbstractHistogram {
    
    var counts: Float64Array = js.native
    
    var totalCount: Double = js.native
  }
}
