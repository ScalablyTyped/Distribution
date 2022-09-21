package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int8HistogramMod {
  
  @JSImport("hdr-histogram-js/dist/Int8Histogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.hdrHistogramJs.typedArrayHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  type Int8Histogram = typings.hdrHistogramJs.typedArrayHistogramMod.default
}
