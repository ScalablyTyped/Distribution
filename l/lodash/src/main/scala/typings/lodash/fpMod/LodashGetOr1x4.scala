package typings.lodash.fpMod

import typings.lodash.lodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr1x4[TObject] extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashGetOr1x5[TObject, TDefault] = js.native
  def apply[TKey /* <: String */](defaultValue: __, path: TKey): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TKey1 /* <: String */, TKey2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

