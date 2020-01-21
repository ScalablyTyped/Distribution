package typings.hlsParser.mod.types

import typings.hlsParser.AnonCurrentVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.MasterPlaylist")
@js.native
class MasterPlaylist protected () extends Playlist {
  def this(properties: BasePlaylistConstructorProperties with AnonCurrentVariant) = this()
  var currentVariant: js.UndefOr[Double] = js.native
  var sessionDataList: js.Array[SessionData] = js.native
  var sessionKeyList: js.Array[Key] = js.native
  var variants: js.Array[Variant] = js.native
}

