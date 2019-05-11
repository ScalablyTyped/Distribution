package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues extends js.Object {
  def apply(iteratee: java.lang.String): LodashMapValues6x1 = js.native
  def apply(iteratee: js.Object): LodashMapValues3x1 = js.native
  def apply[T](callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.__): LodashMapValues1x2[T] = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.__,
    obj: lodashLib.lodashMod.Dictionary[T]
  ): LodashMapValues1x2[T] = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.__,
    obj: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashMapValues1x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: lodashLib.lodashMod.__, obj: T): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: java.lang.String, obj: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[_] = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.NumericDictionary[T]): lodashLib.lodashMod.Dictionary[_] = js.native
  def apply[T /* <: js.Object */](iteratee: js.Object, obj: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[scala.Boolean] = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.NumericDictionary[T]): lodashLib.lodashMod.Dictionary[scala.Boolean] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMapValues2x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    obj: T
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: lodashLib.lodashMod.NumericDictionary[T]): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey): LodashMapValues5x1[T, TKey] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.NumericDictionary[T]): lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
}

