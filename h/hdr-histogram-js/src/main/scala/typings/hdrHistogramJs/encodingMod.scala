package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("hdr-histogram-js/encoding", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(base64String: String): AbstractHistogram = js.native
  @JSImport("hdr-histogram-js/encoding", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: js.UndefOr[scala.Nothing],
    minBarForHighestTrackableValue: Double
  ): AbstractHistogram = js.native
  @JSImport("hdr-histogram-js/encoding", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(base64String: String, histogramConstr: HistogramConstructor): AbstractHistogram = js.native
  @JSImport("hdr-histogram-js/encoding", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): AbstractHistogram = js.native
  
  @JSImport("hdr-histogram-js/encoding", "encodeIntoBase64String")
  @js.native
  def encodeIntoBase64String(histogram: AbstractHistogram): String = js.native
  @JSImport("hdr-histogram-js/encoding", "encodeIntoBase64String")
  @js.native
  def encodeIntoBase64String(histogram: AbstractHistogram, compressionLevel: Double): String = js.native
}
