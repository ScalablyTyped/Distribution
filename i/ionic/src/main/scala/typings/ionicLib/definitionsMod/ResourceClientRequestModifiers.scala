package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceClientRequestModifiers extends js.Object {
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ResourceClientRequestModifiers {
  @scala.inline
  def apply(fields: js.Array[java.lang.String] = null): ResourceClientRequestModifiers = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ResourceClientRequestModifiers]
  }
}

