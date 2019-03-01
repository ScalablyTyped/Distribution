package typings
package hjsonLib.hjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /**
    * keep white space and comments. This is useful if
    * you want to edit an hjson file and save it while preserving comments (default false)
    */
  var keepWsc: js.UndefOr[scala.Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(keepWsc: js.UndefOr[scala.Boolean] = js.undefined): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepWsc)) __obj.updateDynamic("keepWsc")(keepWsc)
    __obj.asInstanceOf[DeserializeOptions]
  }
}

