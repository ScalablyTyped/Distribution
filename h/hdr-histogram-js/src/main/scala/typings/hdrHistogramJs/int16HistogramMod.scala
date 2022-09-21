package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int16HistogramMod {
  
  @JSImport("hdr-histogram-js/dist/Int16Histogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.hdrHistogramJs.typedArrayHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  type Int16Histogram = typings.hdrHistogramJs.typedArrayHistogramMod.default
}
