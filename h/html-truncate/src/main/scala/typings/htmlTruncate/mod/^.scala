package typings.htmlTruncate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-truncate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Truncate HTML text and also keep tag safe.
    */
  def apply(input: String, maxLength: Double): String = js.native
  def apply(input: String, maxLength: Double, options: TruncateOptions): String = js.native
}

