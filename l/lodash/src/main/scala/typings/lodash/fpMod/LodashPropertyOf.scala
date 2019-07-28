package typings.lodash.fpMod

import typings.lodash.lodashMod.NumericDictionary
import typings.lodash.lodashMod.PropertyPath
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropertyOf extends js.Object {
  def apply(path: Double): LodashPropertyOf6x1 = js.native
  def apply(path: PropertyPath): LodashPropertyOf8x1 = js.native
  def apply(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(path: __): LodashPropertyOf8x2 = js.native
  def apply(path: __, `object`: js.Any): LodashPropertyOf9x2 = js.native
  def apply[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def apply[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropertyOf1x2[TObject] = js.native
  def apply[T](path: __, `object`: NumericDictionary[T]): LodashPropertyOf7x2[T] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: TKey): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashPropertyOf3x1[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
}

