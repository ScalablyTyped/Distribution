package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr extends js.Object {
  def apply(defaultValue: js.Any): LodashPropOr7x1 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath): LodashPropOr7x3 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPropOr7x5 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath): LodashPropOr6x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): LodashPropOr7x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__): LodashPropOr6x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPropOr7x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: scala.Double): LodashPropOr5x2 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPropOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.PropertyPath): LodashPropOr6x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__): LodashPropOr6x5[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: scala.Double): LodashPropOr5x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr1x4[TObject] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr5x4[T] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: scala.Double,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr5x6[T] = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr5x5[T, TDefault] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: scala.Double, `object`: lodashLib.lodashMod.NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey]): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey], `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPropOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: lodashLib.lodashMod.__, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](
    defaultValue: lodashLib.lodashMod.__,
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4],
    `object`: TObject
  ): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

