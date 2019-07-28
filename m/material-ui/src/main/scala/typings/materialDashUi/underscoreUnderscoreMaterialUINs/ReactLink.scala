package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactLink is from "react/addons"
trait ReactLink[T] extends js.Object {
  var value: T
  def requestChange(newValue: T): Unit
}

object ReactLink {
  @scala.inline
  def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactLink[T]]
  }
}

