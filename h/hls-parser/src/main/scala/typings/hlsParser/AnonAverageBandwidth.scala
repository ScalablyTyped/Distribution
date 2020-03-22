package typings.hlsParser

import typings.hlsParser.hlsParserStrings.AUDIO
import typings.hlsParser.hlsParserStrings.SUBTITLES
import typings.hlsParser.hlsParserStrings.VIDEO
import typings.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typings.hlsParser.mod.types.Rendition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAverageBandwidth extends js.Object {
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.undefined
  var averageBandwidth: js.UndefOr[Double] = js.undefined
  var bandwidth: Double
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.undefined
  var codecs: js.UndefOr[String] = js.undefined
  var currentRenditions: js.UndefOr[AnonAudio] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var hdcpLevel: js.UndefOr[String] = js.undefined
  var isIFrameOnly: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[AnonHeight] = js.undefined
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.undefined
  var uri: String
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.undefined
}

object AnonAverageBandwidth {
  @scala.inline
  def apply(
    bandwidth: Double,
    uri: String,
    audio: js.Array[Rendition[AUDIO]] = null,
    averageBandwidth: Int | Double = null,
    closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = null,
    codecs: String = null,
    currentRenditions: AnonAudio = null,
    frameRate: Int | Double = null,
    hdcpLevel: String = null,
    isIFrameOnly: js.UndefOr[Boolean] = js.undefined,
    resolution: AnonHeight = null,
    subtitles: js.Array[Rendition[SUBTITLES]] = null,
    video: js.Array[Rendition[VIDEO]] = null
  ): AnonAverageBandwidth = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (averageBandwidth != null) __obj.updateDynamic("averageBandwidth")(averageBandwidth.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions.asInstanceOf[js.Any])
    if (codecs != null) __obj.updateDynamic("codecs")(codecs.asInstanceOf[js.Any])
    if (currentRenditions != null) __obj.updateDynamic("currentRenditions")(currentRenditions.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (hdcpLevel != null) __obj.updateDynamic("hdcpLevel")(hdcpLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(isIFrameOnly)) __obj.updateDynamic("isIFrameOnly")(isIFrameOnly.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAverageBandwidth]
  }
}

