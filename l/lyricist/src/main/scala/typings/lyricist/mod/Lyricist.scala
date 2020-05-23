package typings.lyricist.mod

import typings.lyricist.anon.FetchLyrics
import typings.lyricist.anon.FetchTracklist
import typings.lyricist.anon.Page
import typings.lyricist.anon.TextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyricist extends js.Object {
  def album(id: Double): js.Promise[Album] = js.native
  def album(id: Double, opts: FetchTracklist): js.Promise[Album] = js.native
  def artist(id: Double, opts: TextFormat): js.Promise[Artist] = js.native
  def artistByName(name: String, opts: TextFormat): js.Promise[Artist] = js.native
  def search(query: String): js.Promise[js.Array[SearchResult]] = js.native
  def song(id: Double): js.Promise[Song] = js.native
  def song(id: Double, opts: FetchLyrics): js.Promise[Song] = js.native
  def songsByArtist(id: Double): js.Promise[js.Array[SongByArtist]] = js.native
  def songsByArtist(id: Double, opts: Page): js.Promise[js.Array[SongByArtist]] = js.native
}

