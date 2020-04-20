package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiOptions extends js.Object {
  var pipeline: Boolean
}

object MultiOptions {
  @scala.inline
  def apply(pipeline: Boolean): MultiOptions = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiOptions]
  }
}

