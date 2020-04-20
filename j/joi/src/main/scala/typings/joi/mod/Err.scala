package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends JoiObject

object Err {
  @scala.inline
  def apply(isJoi: Boolean): Err = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

