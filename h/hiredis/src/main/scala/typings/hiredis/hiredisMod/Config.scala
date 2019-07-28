package typings.hiredis.hiredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var return_buffers: Boolean
}

object Config {
  @scala.inline
  def apply(return_buffers: Boolean): Config = {
    val __obj = js.Dynamic.literal(return_buffers = return_buffers)
  
    __obj.asInstanceOf[Config]
  }
}

