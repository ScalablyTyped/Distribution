package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int32HistogramMod {
  
  @JSImport("hdr-histogram-js/Int32Histogram", JSImport.Default)
  @js.native
  class default protected () extends Int32Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait Int32Histogram extends AbstractHistogram {
    
    var counts: Uint32Array = js.native
    
    var totalCount: Double = js.native
  }
}
