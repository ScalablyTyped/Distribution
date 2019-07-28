package typings.graphql.utilitiesCoerceValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  val key: String | Double
  val prev: js.UndefOr[Path] = js.undefined
}

object Path {
  @scala.inline
  def apply(key: String | Double, prev: Path = null): Path = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Path]
  }
}

