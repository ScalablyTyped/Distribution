package typings
package graphqlLib.utilitiesCoerceValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  val key: java.lang.String | scala.Double
  val prev: js.UndefOr[Path]
}

object Path {
  @scala.inline
  def apply(key: java.lang.String | scala.Double, prev: Path = null): Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Path]
  }
}

