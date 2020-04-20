package typings.lodash.fpMod

import typings.lodash.mod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashShuffle extends js.Object {
  def apply[T](): js.Array[T] = js.native
  def apply[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](collection: List[T]): js.Array[T] = js.native
}

