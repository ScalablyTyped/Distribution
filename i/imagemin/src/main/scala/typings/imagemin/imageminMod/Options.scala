package typings.imagemin.imageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var plugins: js.Array[Plugin]
}

object Options {
  @scala.inline
  def apply(plugins: js.Array[Plugin]): Options = {
    val __obj = js.Dynamic.literal(plugins = plugins)
  
    __obj.asInstanceOf[Options]
  }
}

