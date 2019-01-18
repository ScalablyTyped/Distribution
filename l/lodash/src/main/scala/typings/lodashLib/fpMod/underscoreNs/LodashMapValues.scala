package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues extends js.Object {
  def apply(iteratee: java.lang.String): LodashMapValues6x1 = js.native
  def apply(iteratee: js.Object): LodashMapValues3x1 = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`,
    obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashMapValues1x2[T] = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`,
    obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashMapValues1x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`, obj: T): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: java.lang.String, obj: T): lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[_] = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[_] = js.native
  def apply[T /* <: js.Object */](iteratee: js.Object, obj: T): lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean] = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean] = js.native
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
  ): lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T, TResult](
    callback: js.Function1[/* value */ T, TResult],
    obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[T, TResult](
    callback: js.Function1[/* value */ T, TResult],
    obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey): lodashLib.lodashMod.underscoreNs.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
}

