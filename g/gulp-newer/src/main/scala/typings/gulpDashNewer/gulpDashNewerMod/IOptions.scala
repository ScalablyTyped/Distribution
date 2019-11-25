package typings.gulpDashNewer.gulpDashNewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Path to destination directory or file.
    */
  var dest: String
  /**
    * Source files will be matched to destination files with the provided extension.
    */
  var ext: js.UndefOr[String] = js.undefined
  /**
    * Map relative source paths to relative destination paths.
    */
  var map: js.UndefOr[js.Function1[/* relativePath */ String, String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(dest: String, ext: String = null, map: /* relativePath */ String => String = null): IOptions = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    __obj.asInstanceOf[IOptions]
  }
}

