package typings.hjson.hjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /**
    * keep white space and comments. This is useful if
    * you want to edit an hjson file and save it while preserving comments (default false)
    */
  var keepWsc: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(keepWsc: js.UndefOr[Boolean] = js.undefined): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepWsc)) __obj.updateDynamic("keepWsc")(keepWsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

