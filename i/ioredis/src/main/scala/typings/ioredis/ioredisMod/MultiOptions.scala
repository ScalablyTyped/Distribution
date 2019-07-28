package typings.ioredis.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiOptions extends js.Object {
  var pipeline: Boolean
}

object MultiOptions {
  @scala.inline
  def apply(pipeline: Boolean): MultiOptions = {
    val __obj = js.Dynamic.literal(pipeline = pipeline)
  
    __obj.asInstanceOf[MultiOptions]
  }
}

