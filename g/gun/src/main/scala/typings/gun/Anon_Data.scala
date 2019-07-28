package typings.gun

import typings.gun.gunMod.GunNs.DisallowArray
import typings.gun.gunMod.GunNs.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}

object Anon_Data {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): Anon_Data[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
  
    __obj.asInstanceOf[Anon_Data[DataType]]
  }
}

