package typings.hlsDashParser.hlsDashParserMod.types

import typings.hlsDashParser.Anon_DiscontinuitySequenceBase
import typings.hlsDashParser.hlsDashParserStrings.EVENT
import typings.hlsDashParser.hlsDashParserStrings.VOD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.MediaPlaylist")
@js.native
class MediaPlaylist protected () extends Playlist {
  def this(properties: BasePlaylistConstructorProperties with Anon_DiscontinuitySequenceBase) = this()
  var discontinuitySequenceBase: js.UndefOr[Double] = js.native
  var endlist: Boolean = js.native
  var isIFrame: Boolean = js.native
  var mediaSequenceBase: js.UndefOr[Double] = js.native
  var playlistType: js.UndefOr[EVENT | VOD] = js.native
  var segments: js.Array[Segment] = js.native
  var targetDuration: Double = js.native
}

