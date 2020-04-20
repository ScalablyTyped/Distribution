package typings.jestWatcher.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOptions extends js.Object {
  var max: Double
  var offset: Double
}

object ScrollOptions {
  @scala.inline
  def apply(max: Double, offset: Double): ScrollOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
}

