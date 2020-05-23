package typings.jsfl.global

import typings.jsfl.ElementCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("$")
@js.native
object _empty extends js.Object {
  // http://www.xjsfl.com/support/guides/working-with-flash/introduction-to-selectors
  // http://www.xjsfl.com/support/api/elements/ElementSelector
  def apply(selector: String): ElementCollection = js.native
}

