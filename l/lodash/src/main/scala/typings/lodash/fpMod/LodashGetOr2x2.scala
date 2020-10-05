package typings.lodash.fpMod

import typings.lodash.mod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashGetOr2x2[TObject, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] extends js.Object {
  def apply(defaultValue: __): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashGetOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

