package typings.hlsParser

import typings.hlsParser.hlsParserStrings.EVENT
import typings.hlsParser.hlsParserStrings.VOD
import typings.hlsParser.mod.types.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  targetDuration  :number,   mediaSequenceBase ? :number,   discontinuitySequenceBase ? :number,   endlist ? :boolean,   playlistType ? :'EVENT' | 'VOD',   isIFrame ? :boolean,   segments ? :std.Array<hls-parser.hls-parser.types.Segment>,   source ? :string} */
trait BasePlaylistConstructorPrDiscontinuitySequenceBase extends js.Object {
  var discontinuitySequenceBase: js.UndefOr[Double] = js.undefined
  var endlist: js.UndefOr[Boolean] = js.undefined
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  var isIFrame: js.UndefOr[Boolean] = js.undefined
  var mediaSequenceBase: js.UndefOr[Double] = js.undefined
  var playlistType: js.UndefOr[EVENT | VOD] = js.undefined
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[AnonOffset] = js.undefined
  var targetDuration: Double
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object BasePlaylistConstructorPrDiscontinuitySequenceBase {
  @scala.inline
  def apply(
    targetDuration: Double,
    discontinuitySequenceBase: Int | Double = null,
    endlist: js.UndefOr[Boolean] = js.undefined,
    independentSegments: js.UndefOr[Boolean] = js.undefined,
    isIFrame: js.UndefOr[Boolean] = js.undefined,
    mediaSequenceBase: Int | Double = null,
    playlistType: EVENT | VOD = null,
    segments: js.Array[Segment] = null,
    source: String = null,
    start: AnonOffset = null,
    uri: String = null,
    version: Int | Double = null
  ): BasePlaylistConstructorPrDiscontinuitySequenceBase = {
    val __obj = js.Dynamic.literal(targetDuration = targetDuration.asInstanceOf[js.Any])
    if (discontinuitySequenceBase != null) __obj.updateDynamic("discontinuitySequenceBase")(discontinuitySequenceBase.asInstanceOf[js.Any])
    if (!js.isUndefined(endlist)) __obj.updateDynamic("endlist")(endlist.asInstanceOf[js.Any])
    if (!js.isUndefined(independentSegments)) __obj.updateDynamic("independentSegments")(independentSegments.asInstanceOf[js.Any])
    if (!js.isUndefined(isIFrame)) __obj.updateDynamic("isIFrame")(isIFrame.asInstanceOf[js.Any])
    if (mediaSequenceBase != null) __obj.updateDynamic("mediaSequenceBase")(mediaSequenceBase.asInstanceOf[js.Any])
    if (playlistType != null) __obj.updateDynamic("playlistType")(playlistType.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPrDiscontinuitySequenceBase]
  }
}

