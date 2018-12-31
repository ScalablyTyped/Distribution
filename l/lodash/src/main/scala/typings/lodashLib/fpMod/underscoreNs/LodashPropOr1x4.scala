package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr1x4[TObject] extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: TKey): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: java.lang.String */](defaultValue: lodashLib.lodashMod.underscoreNs.`__`, path: js.Array[TKey]): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
  def apply[TKey /* <: java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (/* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any) | TDefault = js.native
}

