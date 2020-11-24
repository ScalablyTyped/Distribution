package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("markdownlint", "sync")
@js.native
object sync extends js.Object {
  
  /**
    * Lint specified Markdown files synchronously.
    *
    * @param {Options} options Configuration options.
    * @returns {LintResults} Results object.
    */
  def apply(options: Options): LintResults = js.native
}
