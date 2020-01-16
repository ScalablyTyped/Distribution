package typings.hlsDashParser.hlsDashParserMod.types

import typings.hlsDashParser.Anon_AUDIO
import typings.hlsDashParser.Anon_Audio
import typings.hlsDashParser.Anon_Height
import typings.hlsDashParser.hlsDashParserStrings.AUDIO
import typings.hlsDashParser.hlsDashParserStrings.SUBTITLES
import typings.hlsDashParser.hlsDashParserStrings.VIDEO
import typings.hlsDashParser.hlsDashParserStrings.`CLOSED-CAPTIONS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Variant")
@js.native
class Variant protected () extends js.Object {
  def this(properties: Anon_AUDIO) = this()
  var audio: js.Array[Rendition[AUDIO]] = js.native
  var averageBandwidth: js.UndefOr[Double] = js.native
  var bandwidth: Double = js.native
  var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
  var codecs: js.UndefOr[String] = js.native
  var currentRenditions: Anon_Audio = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hdcpLevel: js.UndefOr[String] = js.native
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Anon_Height] = js.native
  var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
  var uri: String = js.native
  var video: js.Array[Rendition[VIDEO]] = js.native
}

