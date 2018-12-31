package typings
package gulpDashNewerLib.gulpDashNewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Path to destination directory or file.
    */
  var dest: java.lang.String
  /**
    * Source files will be matched to destination files with the provided extension.
    */
  var ext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Map relative source paths to relative destination paths.
    */
  var map: js.UndefOr[js.Function1[/* relativePath */ java.lang.String, java.lang.String]] = js.undefined
}

