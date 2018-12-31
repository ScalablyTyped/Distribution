package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr extends js.Object {
  def apply(defaultValue: js.Any): LodashGetOr4x1 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.underscoreNs.PropertyPath): LodashGetOr4x3 = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.underscoreNs.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: lodashLib.lodashMod.underscoreNs.`__`, `object`: js.Any): LodashGetOr4x5 = js.native
  def apply(
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: lodashLib.lodashMod.underscoreNs.PropertyPath
  ): LodashGetOr3x6 = js.native
  def apply(
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: lodashLib.lodashMod.underscoreNs.PropertyPath,
    `object`: js.Any
  ): LodashGetOr4x6 = js.native
  def apply(defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: lodashLib.lodashMod.underscoreNs.`__`): LodashGetOr3x4 = js.native
  def apply(
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: js.Any
  ): LodashGetOr4x4 = js.native
  def apply(defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: scala.Double): LodashGetOr2x2 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.underscoreNs.PropertyPath): LodashGetOr3x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.underscoreNs.`__`): LodashGetOr3x5[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: scala.Double): LodashGetOr2x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: TObject
  ): LodashGetOr1x4[TObject] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashGetOr2x4[T] = js.native
  def apply[T](
    defaultValue: lodashLib.lodashMod.underscoreNs.`__`,
    path: scala.Double,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashGetOr2x6[T] = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject): LodashGetOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashGetOr2x5[T, TDefault] = js.native
  def apply[T, TDefault](
    defaultValue: TDefault,
    path: scala.Double,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: TKey): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: TKey, `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: js.Array[TKey], `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
}

