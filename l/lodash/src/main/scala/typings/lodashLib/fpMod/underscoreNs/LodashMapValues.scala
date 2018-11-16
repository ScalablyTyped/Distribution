package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues extends js.Object {
  def apply(callback: lodashLib.lodashMod.underscoreNs.`__`): LodashMapValues1x2 = js.native
  def apply(callback: lodashLib.lodashMod.underscoreNs.`__`, obj: java.lang.String): LodashMapValues1x2 = js.native
  def apply(iteratee: java.lang.String): LodashMapValues7x1 = js.native
  def apply(iteratee: js.Object): LodashMapValues4x1 = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`,
    obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashMapValues2x2[T] = js.native
  def apply[T](
    callbackOrIterateeOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`,
    obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashMapValues2x2[T] = js.native
  def apply[T /* <: js.Object */](callbackOrIterateeOrIteratee: lodashLib.lodashMod.underscoreNs.`__`, obj: T): LodashMapValues3x2[T] = js.native
  def apply[TResult](callback: js.Function1[/* value */ java.lang.String, TResult]): lodashLib.lodashMod.underscoreNs.NumericDictionary[TResult] = js.native
  def apply[TResult](callback: js.Function1[/* value */ java.lang.String, TResult], obj: java.lang.String): lodashLib.lodashMod.underscoreNs.NumericDictionary[TResult] = js.native
  def apply[T /* <: js.Object */](iteratee: java.lang.String, obj: T): lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[_] = js.native
  def apply[T](iteratee: java.lang.String, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[_] = js.native
  def apply[T /* <: js.Object */](iteratee: js.Object, obj: T): lodashLib.lodashLibStrings.LodashMapValues with js.Any = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean] = js.native
  def apply[T](iteratee: js.Object, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean] = js.native
  def apply[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
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
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey): lodashLib.lodashMod.underscoreNs.Dictionary[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.underscoreNs.Dictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
  def apply[T, TKey /* <: java.lang.String */](iteratee: TKey, obj: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): lodashLib.lodashMod.underscoreNs.Dictionary[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
}

