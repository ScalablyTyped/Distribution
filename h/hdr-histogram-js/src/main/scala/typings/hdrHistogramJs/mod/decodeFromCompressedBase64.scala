package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
@js.native
object decodeFromCompressedBase64 extends js.Object {
  def apply(base64String: String): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(
    base64String: String,
    histogramConstr: js.UndefOr[scala.Nothing],
    minBarForHighestTrackableValue: Double
  ): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(base64String: String, histogramConstr: HistogramConstructor): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  def apply(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
}

