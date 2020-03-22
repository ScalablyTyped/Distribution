package typings.hdrHistogramJs.abstractHistogramEncodingMod

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typings.hdrHistogramJs.byteBufferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/AbstractHistogram.encoding", "doDecodeFromCompressedByteBuffer")
@js.native
object doDecodeFromCompressedByteBuffer extends js.Object {
  def apply(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = js.native
}

