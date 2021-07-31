package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.std.Uint16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int16HistogramMod {
  
  @JSImport("hdr-histogram-js/Int16Histogram", JSImport.Default)
  @js.native
  class default protected () extends Int16Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @js.native
  trait Int16Histogram extends AbstractHistogram {
    
    var counts: Uint16Array = js.native
    
    var totalCount: Double = js.native
  }
}
