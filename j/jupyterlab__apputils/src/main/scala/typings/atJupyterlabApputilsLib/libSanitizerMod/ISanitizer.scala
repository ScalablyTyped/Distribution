package typings
package atJupyterlabApputilsLib.libSanitizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISanitizer extends js.Object {
  /**
    * Sanitize an HTML string.
    *
    * @param dirty - The dirty text.
    *
    * @param options - The optional sanitization options.
    *
    * @returns The sanitized string.
    */
  def sanitize(dirty: java.lang.String): java.lang.String = js.native
  def sanitize(dirty: java.lang.String, options: atJupyterlabApputilsLib.libSanitizerMod.ISanitizerNs.IOptions): java.lang.String = js.native
}

