package typings.hlsDashParser

import typings.hlsDashParser.hlsDashParserMod.types.Rendition
import typings.hlsDashParser.hlsDashParserStrings.AUDIO
import typings.hlsDashParser.hlsDashParserStrings.SUBTITLES
import typings.hlsDashParser.hlsDashParserStrings.VIDEO
import typings.hlsDashParser.hlsDashParserStrings.`CLOSED-CAPTIONS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIO extends js.Object {
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.undefined
  var averageBandwidth: js.UndefOr[Double] = js.undefined
  var bandwidth: Double
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.undefined
  var codecs: js.UndefOr[String] = js.undefined
  var currentRenditions: js.UndefOr[Anon_Audio] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var hdcpLevel: js.UndefOr[String] = js.undefined
  var isIFrameOnly: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Anon_Height] = js.undefined
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.undefined
  var uri: String
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.undefined
}

trait Anon_Audio extends js.Object {
  var audio: js.UndefOr[Double] = js.undefined
  var closedCaptions: js.UndefOr[Double] = js.undefined
  var subtitles: js.UndefOr[Double] = js.undefined
  var video: js.UndefOr[Double] = js.undefined
}

object Anon_AUDIO {
  @scala.inline
  def apply(
    bandwidth: Double,
    uri: String,
    audio: js.Array[Rendition[AUDIO]] = null,
    averageBandwidth: Int | Double = null,
    closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = null,
    codecs: String = null,
    currentRenditions: Anon_Audio = null,
    frameRate: Int | Double = null,
    hdcpLevel: String = null,
    isIFrameOnly: js.UndefOr[Boolean] = js.undefined,
    resolution: Anon_Height = null,
    subtitles: js.Array[Rendition[SUBTITLES]] = null,
    video: js.Array[Rendition[VIDEO]] = null
  ): Anon_AUDIO = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, uri = uri)
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (averageBandwidth != null) __obj.updateDynamic("averageBandwidth")(averageBandwidth.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions)
    if (codecs != null) __obj.updateDynamic("codecs")(codecs)
    if (currentRenditions != null) __obj.updateDynamic("currentRenditions")(currentRenditions)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (hdcpLevel != null) __obj.updateDynamic("hdcpLevel")(hdcpLevel)
    if (!js.isUndefined(isIFrameOnly)) __obj.updateDynamic("isIFrameOnly")(isIFrameOnly)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles)
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Anon_AUDIO]
  }
}

object Anon_Audio {
  @scala.inline
  def apply(
    audio: Int | Double = null,
    closedCaptions: Int | Double = null,
    subtitles: Int | Double = null,
    video: Int | Double = null
  ): Anon_Audio = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Audio]
  }
}

