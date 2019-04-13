package typings
package gulpDashRenameLib.gulpDashRenameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var extname: js.UndefOr[java.lang.String] = js.undefined
}

object ParsedPath {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    dirname: java.lang.String = null,
    extname: java.lang.String = null
  ): ParsedPath = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    __obj.asInstanceOf[ParsedPath]
  }
}

