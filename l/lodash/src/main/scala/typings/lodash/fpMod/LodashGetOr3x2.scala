package typings.lodash.fpMod

import typings.lodash.mod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr3x2[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] extends js.Object {
  def apply(defaultValue: __): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

