package typings.i18next.i18nextMod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithT extends js.Object {
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  var t_Original: TFunction = js.native
  // Expose parameterized t in the i18next interface hierarchy
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
  def t[TResult /* <: js.UndefOr[String | js.Object | (js.Array[String | js.Object]) | Null] */, TKeys /* <: String | TemplateStringsArray */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
}

