package typings.i18nextDashExpressDashMiddleware.Global.ExpressNs

import typings.i18next.i18nextMod.TFunction
import typings.i18next.i18nextMod.TOptions
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var i18n: typings.i18next.i18nextMod.i18n = js.native
  var language: String = js.native
  var languages: js.Array[String] = js.native
  @JSName("t")
  var t_Original: TFunction = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
}

