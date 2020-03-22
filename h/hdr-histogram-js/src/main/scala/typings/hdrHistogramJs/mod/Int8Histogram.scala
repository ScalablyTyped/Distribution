package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.int8HistogramMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "Int8Histogram")
@js.native
class Int8Histogram protected () extends default {
  def this(
    lowestDiscernibleValue: Double,
    highestTrackableValue: Double,
    numberOfSignificantValueDigits: Double
  ) = this()
}

