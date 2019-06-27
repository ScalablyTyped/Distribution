package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr2x2[TObject, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] extends js.Object {
  def apply(defaultValue: lodashLib.lodashMod.__): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, `object`: TObject): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPathOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

