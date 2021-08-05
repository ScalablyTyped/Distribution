package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("hdr-histogram-js/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeFromCompressedBase64(base64String: String): AbstractHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any]).asInstanceOf[AbstractHistogram]
  inline def decodeFromCompressedBase64(base64String: String, histogramConstr: Unit, minBarForHighestTrackableValue: Double): AbstractHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], histogramConstr.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[AbstractHistogram]
  inline def decodeFromCompressedBase64(base64String: String, histogramConstr: HistogramConstructor): AbstractHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], histogramConstr.asInstanceOf[js.Any])).asInstanceOf[AbstractHistogram]
  inline def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): AbstractHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], histogramConstr.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[AbstractHistogram]
  
  inline def encodeIntoBase64String(histogram: AbstractHistogram): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoBase64String")(histogram.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeIntoBase64String(histogram: AbstractHistogram, compressionLevel: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoBase64String")(histogram.asInstanceOf[js.Any], compressionLevel.asInstanceOf[js.Any])).asInstanceOf[String]
}
