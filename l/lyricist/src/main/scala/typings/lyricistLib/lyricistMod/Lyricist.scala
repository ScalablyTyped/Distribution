package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyricist extends js.Object {
  def album(id: scala.Double): js.Promise[lyricistLib.lyricistMod.LyricistNs.Album] = js.native
  def album(id: scala.Double, opts: lyricistLib.Anon_FetchTracklist): js.Promise[lyricistLib.lyricistMod.LyricistNs.Album] = js.native
  def artist(id: scala.Double, opts: lyricistLib.Anon_TextFormat): js.Promise[lyricistLib.lyricistMod.LyricistNs.Artist] = js.native
  def artistByName(name: java.lang.String, opts: lyricistLib.Anon_TextFormat): js.Promise[lyricistLib.lyricistMod.LyricistNs.Artist] = js.native
  def search(query: java.lang.String): js.Promise[js.Array[lyricistLib.lyricistMod.LyricistNs.SearchResult]] = js.native
  def song(id: scala.Double): js.Promise[lyricistLib.lyricistMod.LyricistNs.Song] = js.native
  def song(id: scala.Double, opts: lyricistLib.Anon_FetchLyrics): js.Promise[lyricistLib.lyricistMod.LyricistNs.Song] = js.native
  def songsByArtist(id: scala.Double): js.Promise[js.Array[lyricistLib.lyricistMod.LyricistNs.SongByArtist]] = js.native
  def songsByArtist(id: scala.Double, opts: lyricistLib.Anon_Asc): js.Promise[js.Array[lyricistLib.lyricistMod.LyricistNs.SongByArtist]] = js.native
}

