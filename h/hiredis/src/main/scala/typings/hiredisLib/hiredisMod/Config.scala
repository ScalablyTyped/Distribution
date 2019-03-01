package typings
package hiredisLib.hiredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var return_buffers: scala.Boolean
}

object Config {
  @scala.inline
  def apply(return_buffers: scala.Boolean): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("return_buffers")(return_buffers)
    __obj.asInstanceOf[Config]
  }
}

