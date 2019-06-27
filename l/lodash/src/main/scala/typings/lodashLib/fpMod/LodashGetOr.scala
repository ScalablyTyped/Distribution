package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr extends js.Object {
  def apply(defaultValue: js.Any): LodashGetOr7x1 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath): LodashGetOr7x3 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.__, `object`: js.Any): LodashGetOr7x5 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath): LodashGetOr6x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): LodashGetOr7x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__): LodashGetOr6x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: js.Any): LodashGetOr7x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: scala.Double): LodashGetOr5x2 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.PropertyPath): TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__): LodashGetOr6x5[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: scala.Double): LodashGetOr5x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: TObject): LodashGetOr1x4[TObject] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashGetOr5x4[T] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: scala.Double,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashGetOr5x6[T] = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__, `object`: TObject): LodashGetOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashGetOr5x5[T, TDefault] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: scala.Double, `object`: lodashLib.lodashMod.NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey, `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey], `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x2[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](
    defaultValue: lodashLib.lodashMod.__,
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4],
    `object`: TObject
  ): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

