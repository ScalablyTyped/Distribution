package typings.lyricParser.mod

import typings.lyricParser.anon.Album
import typings.lyricParser.anon.LineNum
import typings.lyricParser.anon.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyric extends js.Object {
  var curLine: Double = js.native
  var lines: js.Array[Time] = js.native
  var lrc: String = js.native
  var state: Double = js.native
  var tags: Album = js.native
  def handler(params: LineNum): Unit = js.native
  def play(startTime: Double): Unit = js.native
  def play(startTime: Double, skipLast: Boolean): Unit = js.native
  def seek(offset: Double): Unit = js.native
  def stop(): Unit = js.native
  def togglePlay(): Unit = js.native
}

