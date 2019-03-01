package typings
package hardDashSourceDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directories extends js.Object {
  var directories: js.Array[java.lang.String]
  var files: js.Array[java.lang.String]
  var root: java.lang.String
}

object Anon_Directories {
  @scala.inline
  def apply(directories: js.Array[java.lang.String], files: js.Array[java.lang.String], root: java.lang.String): Anon_Directories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directories")(directories)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Anon_Directories]
  }
}

