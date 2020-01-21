package typings.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.markJs.markJsStrings.partially
  - typings.markJs.markJsStrings.complementary
  - typings.markJs.markJsStrings.exactly
*/
trait MarkAccuracy extends js.Object

object MarkAccuracy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complementary: typings.markJs.markJsStrings.complementary = this.cast("complementary")
  @scala.inline
  def exactly: typings.markJs.markJsStrings.exactly = this.cast("exactly")
  @scala.inline
  def partially: typings.markJs.markJsStrings.partially = this.cast("partially")
}

