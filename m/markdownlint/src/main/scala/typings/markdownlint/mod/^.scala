package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("markdownlint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Lint specified Markdown files.
    *
    * @param {Options} options Configuration options.
    * @param {LintCallback} callback Callback (err, result) function.
    * @returns {void}
    */
  def apply(options: Options, callback: LintCallback): Unit = js.native
}
