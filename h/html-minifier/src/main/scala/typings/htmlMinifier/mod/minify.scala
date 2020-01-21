package typings.htmlMinifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-minifier", "minify")
@js.native
object minify extends js.Object {
  def apply(text: String): String = js.native
  def apply(text: String, options: Options): String = js.native
}

