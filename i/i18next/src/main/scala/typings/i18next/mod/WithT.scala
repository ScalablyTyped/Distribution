package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithT extends StObject {
  
  // basic usage
  // Expose parameterized t in the i18next interface hierarchy
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: TOptions[TInterpolationMap]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult
  def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: TOptions[TInterpolationMap]): TResult
  // Expose parameterized t in the i18next interface hierarchy
  @JSName("t")
  var t_Original: TFunction
}
object WithT {
  
  @scala.inline
  def apply(t: TFunction): WithT = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithT]
  }
  
  @scala.inline
  implicit class WithTMutableBuilder[Self <: WithT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setT(value: TFunction): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
