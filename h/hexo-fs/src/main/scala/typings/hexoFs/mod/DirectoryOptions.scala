package typings.hexoFs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryOptions extends js.Object {
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  var ignorePattern: js.UndefOr[RegExp] = js.undefined
}

object DirectoryOptions {
  @scala.inline
  def apply(ignoreHidden: js.UndefOr[Boolean] = js.undefined, ignorePattern: RegExp = null): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreHidden)) __obj.updateDynamic("ignoreHidden")(ignoreHidden.get.asInstanceOf[js.Any])
    if (ignorePattern != null) __obj.updateDynamic("ignorePattern")(ignorePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptions]
  }
}

