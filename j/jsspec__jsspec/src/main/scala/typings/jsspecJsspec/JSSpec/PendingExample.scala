package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingExample extends js.Object {
  /**
    * Provide a pending test case with the given `title`. `fn` will not be executed.
    */
  def apply(title: String, fn: AsyncFunc | Func): Unit = js.native
  /**
    * Provide a pending test case with the given `title`. `fn` will note be executed.
    *
    * `options` will be ignored.
    */
  def apply(title: String, option: ExampleOptions): Unit = js.native
  def apply(title: String, option: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
}

