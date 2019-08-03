package typings.atJsspecJsspec.JSSpecNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  /**
    * Provide a hook, executing `fn`.
    *
    * An `async` function will be awaited.
    */
  def apply(fn: AsyncFunc | Func): Unit = js.native
  /**
    * Provide a named hook, executing `fn`.
    *
    * An `async` function will be awaited.
    */
  def apply(name: String, fn: AsyncFunc | Func): Unit = js.native
  /**
    * Provide a named hook, executing `fn`.
    *
    * An `async` function will be awaited.
    *
    * Use `options` to specify settings for running this hook
    */
  def apply(name: String, options: ExampleOptions, fn: AsyncFunc | Func): Unit = js.native
}

