package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInt8HistogramMod {
  
  @JSImport("hdr-histogram-js/dist/Int8Histogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.hdrHistogramJs.distTypedArrayHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  type Int8Histogram = typings.hdrHistogramJs.distTypedArrayHistogramMod.default
}
