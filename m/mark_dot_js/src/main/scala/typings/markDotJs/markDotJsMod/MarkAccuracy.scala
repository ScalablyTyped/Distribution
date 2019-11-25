package typings.markDotJs.markDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.markDotJs.markDotJsStrings.partially
  - typings.markDotJs.markDotJsStrings.complementary
  - typings.markDotJs.markDotJsStrings.exactly
*/
trait MarkAccuracy extends js.Object

object MarkAccuracy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complementary: typings.markDotJs.markDotJsStrings.complementary = this.cast("complementary")
  @scala.inline
  def exactly: typings.markDotJs.markDotJsStrings.exactly = this.cast("exactly")
  @scala.inline
  def partially: typings.markDotJs.markDotJsStrings.partially = this.cast("partially")
}

