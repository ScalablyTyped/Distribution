package typings.highlightJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highlight.js", "COMMENT")
@js.native
object COMMENT extends js.Object {
  def apply(begin: String, end: String, inherits: IModeBase): IMode = js.native
  def apply(begin: String, end: RegExp, inherits: IModeBase): IMode = js.native
  def apply(begin: RegExp, end: String, inherits: IModeBase): IMode = js.native
  def apply(begin: RegExp, end: RegExp, inherits: IModeBase): IMode = js.native
}

