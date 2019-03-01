package typings
package gulpDashRenameLib.gulpDashRenameMod.renameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ParsedPath {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    dirname: java.lang.String = null,
    extname: java.lang.String = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Options]
  }
}

