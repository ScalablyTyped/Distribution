package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsCompression extends js.Object {
  var minBytes: Double
}

object ServerOptionsCompression {
  @scala.inline
  def apply(minBytes: Double): ServerOptionsCompression = {
    val __obj = js.Dynamic.literal(minBytes = minBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerOptionsCompression]
  }
}

