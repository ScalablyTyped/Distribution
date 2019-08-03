package typings.atJsspecJsspec.JSSpecNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingContext extends js.Object {
  /**
    * Create a new context with the `title` and defined in `fn`.
    *
    * `fn` will not be run, but the context will be reported as pending.
    */
  def apply(title: String): Unit = js.native
  def apply(title: String, fn: Func): Unit = js.native
  /**
    * Create a new context with the `title` and defined in `fn`.
    *
    * `fn` will not be run, but the context will be reported as pending.
    * As the `fn` is not run, `options` has no effect.
    */
  def apply(title: String, options: ContextOptions, fn: Func): Unit = js.native
}

