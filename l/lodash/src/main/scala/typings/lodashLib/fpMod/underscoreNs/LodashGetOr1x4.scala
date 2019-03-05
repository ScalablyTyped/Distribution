package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGetOr1x4[TObject] extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashGetOr1x5[TObject, TDefault] = js.native
  def apply[TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.__, path: TKey): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.__, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

