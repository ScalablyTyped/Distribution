package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr4x2[TObject, TKey1 /* <: java.lang.String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] extends js.Object {
  def apply(defaultValue: lodashLib.lodashMod.__): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPropOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

