package typings.gun

import typings.gun.mod.Gun.DisallowArray
import typings.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPut[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}

object AnonPut {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): AnonPut[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
  
    __obj.asInstanceOf[AnonPut[DataType]]
  }
}

