package typings.i18nDashJs.i18nDashJsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-js", "l")
@js.native
object l extends js.Object {
  def apply(scope: Scope, value: String): String = js.native
  def apply(scope: Scope, value: String, options: InterpolateOptions): String = js.native
  def apply(scope: Scope, value: Double): String = js.native
  def apply(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
  def apply(scope: Scope, value: Date): String = js.native
  def apply(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
}

