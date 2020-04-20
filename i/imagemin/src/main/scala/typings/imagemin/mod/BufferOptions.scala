package typings.imagemin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  var plugins: js.Array[Plugin]
}

object BufferOptions {
  @scala.inline
  def apply(plugins: js.Array[Plugin]): BufferOptions = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}

