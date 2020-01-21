package typings.graphql.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var key: String | Double
  var prev: js.UndefOr[Path] = js.undefined
}

object Path {
  @scala.inline
  def apply(key: String | Double, prev: Path = null): Path = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

