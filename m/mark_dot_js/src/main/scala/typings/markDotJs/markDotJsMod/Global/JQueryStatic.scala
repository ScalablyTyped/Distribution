package typings.markDotJs.markDotJsMod.Global

import typings.markDotJs.markDotJsMod.MarkOptions
import typings.markDotJs.markDotJsMod.UnmarkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def mark(term: String): Unit = js.native
  def mark(term: String, options: MarkOptions): Unit = js.native
  def mark(term: js.Array[String]): Unit = js.native
  def mark(term: js.Array[String], options: MarkOptions): Unit = js.native
  def unmark(): Unit = js.native
  def unmark(options: UnmarkOptions): Unit = js.native
}

