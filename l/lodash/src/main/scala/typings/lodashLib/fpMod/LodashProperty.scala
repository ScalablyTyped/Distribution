package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashProperty extends js.Object {
  def apply(path: lodashLib.lodashMod.PropertyPath): LodashProperty5x1 = js.native
  def apply(path: lodashLib.lodashMod.PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(path: lodashLib.lodashMod.__): LodashProperty5x2 = js.native
  def apply(path: lodashLib.lodashMod.__, `object`: js.Any): LodashProperty6x2 = js.native
  def apply(path: scala.Double): LodashProperty3x1 = js.native
  def apply[TObject /* <: js.Object */](path: lodashLib.lodashMod.__, `object`: TObject): LodashProperty1x2[TObject] = js.native
  def apply[T](path: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.NumericDictionary[T]): LodashProperty4x2[T] = js.native
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

