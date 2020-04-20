package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofencode extends js.Object {
  val componentChars: String = js.native
  val defaultChars: String = js.native
  def apply(str: String): String = js.native
  def apply(str: String, exclude: String): String = js.native
  def apply(str: String, exclude: String, keepEscaped: Boolean): String = js.native
}

