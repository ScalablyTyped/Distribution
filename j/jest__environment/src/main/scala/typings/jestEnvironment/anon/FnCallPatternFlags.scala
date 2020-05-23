package typings.jestEnvironment.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPatternFlags extends js.Object {
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, flags: String): RegExp = js.native
  def apply(pattern: RegExp): RegExp = js.native
  def apply(pattern: RegExp, flags: String): RegExp = js.native
}

