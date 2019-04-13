package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr extends js.Object {
  def apply(defaultValue: js.Any): LodashPathOr4x1 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath): LodashPathOr4x3 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPathOr4x5 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath): LodashPathOr3x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): LodashPathOr4x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__): LodashPathOr3x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPathOr4x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: scala.Double): LodashPathOr2x2 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPathOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.PropertyPath): TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__): LodashPathOr3x5[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: scala.Double): LodashPathOr2x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: TObject): LodashPathOr1x4[TObject] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPathOr2x4[T] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: scala.Double,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPathOr2x6[T] = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__, `object`: TObject): LodashPathOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPathOr2x5[T, TDefault] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: scala.Double, `object`: lodashLib.lodashMod.NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey): LodashPathOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: TKey, `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey]): LodashPathOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.__, path: js.Array[TKey], `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

