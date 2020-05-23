package typings.hlsParser.mod.types

import typings.hlsParser.anon.Audio
import typings.hlsParser.anon.AverageBandwidth
import typings.hlsParser.anon.Height
import typings.hlsParser.hlsParserStrings.AUDIO
import typings.hlsParser.hlsParserStrings.SUBTITLES
import typings.hlsParser.hlsParserStrings.VIDEO
import typings.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Variant")
@js.native
class Variant protected () extends js.Object {
  def this(properties: AverageBandwidth) = this()
  var audio: js.Array[Rendition[AUDIO]] = js.native
  var averageBandwidth: js.UndefOr[Double] = js.native
  var bandwidth: Double = js.native
  var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
  var codecs: js.UndefOr[String] = js.native
  var currentRenditions: Audio = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hdcpLevel: js.UndefOr[String] = js.native
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Height] = js.native
  var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
  var uri: String = js.native
  var video: js.Array[Rendition[VIDEO]] = js.native
}

