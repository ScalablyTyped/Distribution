package typings
package atHapiJoiLib.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoiObject extends js.Object {
  var isJoi: scala.Boolean
}

object JoiObject {
  @scala.inline
  def apply(isJoi: scala.Boolean): JoiObject = {
    val __obj = js.Dynamic.literal(isJoi = isJoi)
  
    __obj.asInstanceOf[JoiObject]
  }
}

