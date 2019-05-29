package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGet extends js.Object {
  def apply(path: lodashLib.lodashMod.PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def apply(path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(path: lodashLib.lodashMod.__): LodashGet5x2 = js.native
  def apply(path: lodashLib.lodashMod.__, `object`: js.Any): LodashGet6x2 = js.native
  def apply(path: scala.Double): LodashGet3x1 = js.native
  def apply[TObject /* <: js.Object */](path: lodashLib.lodashMod.__, `object`: TObject): LodashGet2x2[TObject] = js.native
  def apply[T](path: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashGet4x2[T] = js.native
  def apply[T](path: scala.Double, `object`: lodashLib.lodashMod.NumericDictionary[T]): js.UndefOr[T] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
}

