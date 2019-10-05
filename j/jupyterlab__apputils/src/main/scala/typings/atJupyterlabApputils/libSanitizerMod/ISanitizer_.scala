package typings.atJupyterlabApputils.libSanitizerMod

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ISanitizer")
@js.native
trait ISanitizer_ extends js.Object {
  /**
    * Sanitize an HTML string.
    *
    * @param dirty - The dirty text.
    *
    * @param options - The optional sanitization options.
    *
    * @returns The sanitized string.
    */
  def sanitize(dirty: String): String = js.native
  def sanitize(dirty: String, options: IOptions): String = js.native
}

