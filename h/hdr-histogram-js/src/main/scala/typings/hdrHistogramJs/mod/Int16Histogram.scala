package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.int16HistogramMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "Int16Histogram")
@js.native
class Int16Histogram protected () extends default {
  def this(
    lowestDiscernibleValue: Double,
    highestTrackableValue: Double,
    numberOfSignificantValueDigits: Double
  ) = this()
}

