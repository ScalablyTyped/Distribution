package typings.i18nJs.mod

import typings.i18nJs.i18nJsStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-js", "localize")
@js.native
object localize_currency extends js.Object {
  def apply(scope: currency, value: Double): String = js.native
  def apply(scope: currency, value: Double, options: InterpolateOptions): String = js.native
}

