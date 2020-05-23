package typings.gun.anon

import typings.gun.mod.Gun.DisallowArray
import typings.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Put[DataType] extends js.Object {
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}

object Put {
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): Put[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
    __obj.asInstanceOf[Put[DataType]]
  }
}

