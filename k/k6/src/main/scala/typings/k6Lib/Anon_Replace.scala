package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Replace extends js.Object {
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Replace {
  @scala.inline
  def apply(replace: js.UndefOr[scala.Boolean] = js.undefined, value: java.lang.String = null): Anon_Replace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Replace]
  }
}

