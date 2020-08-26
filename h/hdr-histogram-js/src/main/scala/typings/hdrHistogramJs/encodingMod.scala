package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/encoding", JSImport.Namespace)
@js.native
object encodingMod extends js.Object {
  def decodeFromCompressedBase64(base64String: String): AbstractHistogram = js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: js.UndefOr[scala.Nothing],
    minBarForHighestTrackableValue: Double
  ): AbstractHistogram = js.native
  def decodeFromCompressedBase64(base64String: String, histogramConstr: HistogramConstructor): AbstractHistogram = js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): AbstractHistogram = js.native
  def encodeIntoBase64String(histogram: AbstractHistogram): String = js.native
  def encodeIntoBase64String(histogram: AbstractHistogram, compressionLevel: Double): String = js.native
}

