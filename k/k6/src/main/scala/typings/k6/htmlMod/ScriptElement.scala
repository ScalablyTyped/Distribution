package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "ScriptElement")
@js.native
abstract class ScriptElement () extends Element {
  /** Source code. */
  def text(): String = js.native
}

