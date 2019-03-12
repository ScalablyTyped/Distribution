package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends JoiObject

object Err {
  @scala.inline
  def apply(isJoi: scala.Boolean, toString: () => java.lang.String): Err = {
    val __obj = js.Dynamic.literal(isJoi = isJoi, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Err]
  }
}

