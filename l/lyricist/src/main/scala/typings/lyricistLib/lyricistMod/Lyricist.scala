package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyricist extends js.Object {
  def album(id: scala.Double): js.Promise[Album] = js.native
  def album(id: scala.Double, opts: lyricistLib.Anon_FetchTracklist): js.Promise[Album] = js.native
  def artist(id: scala.Double, opts: lyricistLib.Anon_TextFormat): js.Promise[Artist] = js.native
  def artistByName(name: java.lang.String, opts: lyricistLib.Anon_TextFormat): js.Promise[Artist] = js.native
  def search(query: java.lang.String): js.Promise[js.Array[SearchResult]] = js.native
  def song(id: scala.Double): js.Promise[Song] = js.native
  def song(id: scala.Double, opts: lyricistLib.Anon_FetchLyrics): js.Promise[Song] = js.native
  def songsByArtist(id: scala.Double): js.Promise[js.Array[SongByArtist]] = js.native
  def songsByArtist(id: scala.Double, opts: lyricistLib.Anon_Asc): js.Promise[js.Array[SongByArtist]] = js.native
}

