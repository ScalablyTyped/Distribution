package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * Create a new context with the `title` and defined in `fn`.
    */
  def apply(title: String, fn: Func): Unit = js.native
  /**
    * Create a new context with the `title` and defined in `fn`.
    * Use `options` to specify settings for running Examples in this context.
    */
  def apply(title: String, options: ContextOptions, fn: Func): Unit = js.native
}
