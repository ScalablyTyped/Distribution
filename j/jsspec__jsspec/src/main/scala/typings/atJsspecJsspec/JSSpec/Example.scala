package typings.atJsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Example extends js.Object {
  /**
    * Provide a test case with the given `title`, executing `fn`.
    *
    * An `async` function will be awaited.
    */
  def apply(title: String, fn: AsyncFunc | Func): Unit = js.native
  /**
    * Provide a test case with the given `title`, executing `fn`.
    *
    * Use `options` to specify settings for running this example
    *
    * An `async` function will be awaited.
    */
  def apply(title: String, option: ExampleOptions): Unit = js.native
  def apply(title: String, option: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
}

