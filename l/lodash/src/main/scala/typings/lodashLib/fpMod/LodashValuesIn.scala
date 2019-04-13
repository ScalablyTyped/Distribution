package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashValuesIn extends js.Object {
  def apply[T](): js.Array[T] = js.native
  def apply[T /* <: js.Object */](`object`: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](`object`: lodashLib.lodashMod.Dictionary[T]): js.Array[T] = js.native
  def apply[T](`object`: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
  def apply[T](`object`: lodashLib.lodashMod.NumericDictionary[T]): js.Array[T] = js.native
}

