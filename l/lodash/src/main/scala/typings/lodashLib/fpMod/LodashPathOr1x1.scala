package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr1x1[TDefault] extends js.Object {
  def apply(path: lodashLib.lodashMod.PropertyPath): LodashPathOr3x3[TDefault] = js.native
  def apply(path: lodashLib.lodashMod.__): LodashPathOr3x5[TDefault] = js.native
  def apply(path: scala.Double): LodashPathOr2x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](path: lodashLib.lodashMod.__, `object`: TObject): LodashPathOr1x5[TObject, TDefault] = js.native
  def apply[T](path: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashPathOr2x5[T, TDefault] = js.native
  def apply[T](path: scala.Double, `object`: lodashLib.lodashMod.NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey], `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

