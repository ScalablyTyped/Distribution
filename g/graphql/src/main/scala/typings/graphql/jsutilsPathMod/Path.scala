package typings.graphql.jsutilsPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var key: String | Double
  var prev: Path | Unit
}

object Path {
  @scala.inline
  def apply(key: String | Double, prev: Path | Unit): Path = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Path]
  }
}

