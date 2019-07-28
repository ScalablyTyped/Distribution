package typings.gulpDashRename.gulpDashRenameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var dirname: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
}

object ParsedPath {
  @scala.inline
  def apply(basename: String = null, dirname: String = null, extname: String = null): ParsedPath = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    __obj.asInstanceOf[ParsedPath]
  }
}

