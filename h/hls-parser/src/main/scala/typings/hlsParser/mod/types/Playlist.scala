package typings.hlsParser.mod.types

import typings.hlsParser.AnonOffset
import typings.hlsParser.BasePlaylistConstructorPr
import typings.hlsParser.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Playlist")
@js.native
class Playlist protected () extends Data {
  def this(properties: BasePlaylistConstructorPr) = this()
  var independentSegments: Boolean = js.native
  var isMasterPlaylist: Boolean = js.native
  var source: js.UndefOr[String] = js.native
  var start: js.UndefOr[AnonOffset] = js.native
  var uri: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

