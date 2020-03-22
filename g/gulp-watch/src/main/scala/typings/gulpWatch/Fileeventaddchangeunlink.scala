package typings.gulpWatch

import typings.gulpWatch.gulpWatchStrings.add
import typings.gulpWatch.gulpWatchStrings.change
import typings.gulpWatch.gulpWatchStrings.unlink
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.File & {  event  :'add' | 'change' | 'unlink'} */
@js.native
trait Fileeventaddchangeunlink extends js.Object {
  var event: add | change | unlink = js.native
  val lastModified: Double = js.native
  val name: String = js.native
  val size: Double = js.native
  val `type`: String = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  def stream(): ReadableStream[_] = js.native
  def text(): js.Promise[String] = js.native
}

