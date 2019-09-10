package typings.i18next.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithT extends js.Object {
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  var t_Original: TFunction = js.native
  // basic usage
  // Expose parameterized t in the i18next interface hierarchy
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult = js.native
}

