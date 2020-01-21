package typings.koaJwt

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: js.Array[RegExp]
}

object AnonPath {
  @scala.inline
  def apply(path: js.Array[RegExp]): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

