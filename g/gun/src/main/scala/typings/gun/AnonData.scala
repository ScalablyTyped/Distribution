package typings.gun

import typings.gun.mod.Gun.DisallowArray
import typings.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}

object AnonData {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): AnonData[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
  
    __obj.asInstanceOf[AnonData[DataType]]
  }
}

