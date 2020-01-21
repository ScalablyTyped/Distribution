package typings.linguiCore.mod

import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/core", "number")
@js.native
object number extends js.Object {
  def apply(language: String): js.Function1[/* value */ Double, String] = js.native
  def apply(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
}

