package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr extends js.Object {
  def apply(defaultValue: js.Any): LodashPropOr4x1 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath): LodashPropOr4x3 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPropOr4x5 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath): LodashPropOr3x2 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): LodashPropOr4x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__): LodashPropOr3x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: js.Any): LodashPropOr4x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, path: scala.Double): LodashPropOr2x2 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPropOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.PropertyPath): LodashPropOr3x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__): LodashPropOr3x5[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: scala.Double): LodashPropOr2x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: lodashLib.lodashMod.__, path: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr1x4[TObject] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr2x4[T] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.__,
    path: scala.Double,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr2x6[T] = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.NumericDictionary[T]
  ): LodashPropOr2x5[T, TDefault] = js.native
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
}

