package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ReactLink is from "react/addons"
trait ReactLink[T] extends js.Object {
  var value: T
  def requestChange(newValue: T): scala.Unit
}

object ReactLink {
  @scala.inline
  def apply[T](requestChange: js.Function1[T, scala.Unit], value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = requestChange, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactLink[T]]
  }
}

