package typings.linq.linqMod

import typings.linq.Anon_Key
import typings.linq.Anon_Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "from")
@js.native
object from extends js.Object {
  def apply(): IEnumerable[_] = js.native
  def apply(obj: String): IEnumerable[String] = js.native
  def apply(obj: js.Any): IEnumerable[Anon_Key] = js.native
  def apply(obj: Boolean): IEnumerable[Boolean] = js.native
  def apply(obj: Double): IEnumerable[Double] = js.native
  def apply[T](obj: js.Array[T]): IEnumerable[T] = js.native
  def apply[T](obj: Anon_Length[T]): IEnumerable[T] = js.native
  def apply[T](obj: IEnumerable[T]): IEnumerable[T] = js.native
}

