package typings.hlsDashParser.hlsDashParserMod.types

import typings.hlsDashParser.Anon_IsMasterPlaylist
import typings.hlsDashParser.Anon_Offset
import typings.hlsDashParser.hlsDashParserMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Playlist")
@js.native
class Playlist protected () extends Data {
  def this(properties: BasePlaylistConstructorProperties with Anon_IsMasterPlaylist) = this()
  var independentSegments: Boolean = js.native
  var isMasterPlaylist: Boolean = js.native
  var source: js.UndefOr[String] = js.native
  var start: js.UndefOr[Anon_Offset] = js.native
  var uri: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

