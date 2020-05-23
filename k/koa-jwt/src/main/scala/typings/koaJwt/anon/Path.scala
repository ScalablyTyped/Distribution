package typings.koaJwt.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: js.Array[RegExp]
}

object Path {
  @scala.inline
  def apply(path: js.Array[RegExp]): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

