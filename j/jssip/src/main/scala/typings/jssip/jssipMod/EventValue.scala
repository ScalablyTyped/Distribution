package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventValue[T] extends js.Object {
  var data: T
}

object EventValue {
  @scala.inline
  def apply[T](data: T): EventValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventValue[T]]
  }
}

