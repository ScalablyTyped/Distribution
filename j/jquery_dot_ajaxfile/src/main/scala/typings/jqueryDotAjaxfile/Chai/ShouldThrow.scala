package typings.jqueryDotAjaxfile.Chai

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldThrow extends js.Object {
  def apply(actual: js.Function): Unit = js.native
  def apply(actual: js.Function, constructor: js.Function): Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
  def apply(actual: js.Function, constructor: Error): Unit = js.native
  def apply(actual: js.Function, constructor: Error, expected: String): Unit = js.native
  def apply(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
  def apply(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
  def apply(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
  def apply(actual: js.Function, expected: String): Unit = js.native
  def apply(actual: js.Function, expected: String, message: String): Unit = js.native
  def apply(actual: js.Function, expected: RegExp): Unit = js.native
  def apply(actual: js.Function, expected: RegExp, message: String): Unit = js.native
}

