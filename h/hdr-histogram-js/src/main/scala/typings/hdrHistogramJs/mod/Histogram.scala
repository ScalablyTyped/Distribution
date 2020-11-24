package typings.hdrHistogramJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js", "Histogram")
@js.native
abstract class Histogram protected ()
  extends typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram {
  def this(
    lowestDiscernibleValue: Double,
    highestTrackableValue: Double,
    numberOfSignificantValueDigits: Double
  ) = this()
}
@JSImport("hdr-histogram-js", "Histogram")
@js.native
object Histogram extends js.Object {
  
  var decodeFromByteBuffer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any = js.native
  
  var decodeFromCompressedByteBuffer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any = js.native
}
