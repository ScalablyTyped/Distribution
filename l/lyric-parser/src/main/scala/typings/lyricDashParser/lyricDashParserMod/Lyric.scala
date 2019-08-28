package typings.lyricDashParser.lyricDashParserMod

import typings.lyricDashParser.Anon_Album
import typings.lyricDashParser.Anon_LineNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyric extends js.Object {
  var curLine: Double = js.native
  var lines: js.Array[String] = js.native
  var lrc: String = js.native
  var state: Double = js.native
  var tags: Anon_Album = js.native
  def handler(params: Anon_LineNum): Unit = js.native
  def play(startTime: Double): Unit = js.native
  def play(startTime: Double, skipLast: Boolean): Unit = js.native
  def seek(offset: Double): Unit = js.native
  def stop(): Unit = js.native
  def togglePlay(): Unit = js.native
}

