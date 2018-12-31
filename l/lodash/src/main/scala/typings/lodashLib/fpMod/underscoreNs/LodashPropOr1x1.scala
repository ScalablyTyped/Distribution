package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr1x1[TDefault] extends js.Object {
  def apply(path: lodashLib.lodashMod.underscoreNs.PropertyPath): TDefault = js.native
  def apply(path: lodashLib.lodashMod.underscoreNs.`__`): LodashPropOr3x5[TDefault] = js.native
  def apply(path: scala.Double): LodashPropOr2x3[TDefault] = js.native
  def apply[TObject /* <: js.Object */](path: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[T](
    path: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashPropOr2x5[T, TDefault] = js.native
  def apply[T](path: scala.Double, `object`: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: TKey, `object`: TObject): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey]): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: java.lang.String */](path: js.Array[TKey], `object`: TObject): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
}

