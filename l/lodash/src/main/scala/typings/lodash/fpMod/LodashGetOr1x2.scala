package typings.lodash.fpMod

import typings.lodash.lodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr1x2[TObject, TKey /* <: String */] extends js.Object {
  def apply(defaultValue: __): LodashGetOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

