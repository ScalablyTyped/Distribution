package typings
package gulpDashChangedLib.gulpDashChangedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * The working directory the folder is relative to.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extension of the destination files.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function that determines whether the source file is different from the destination file.
    * @default changed.compareLastModifiedTime
    */
  var hasChanged: js.UndefOr[IComparator] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, extension: java.lang.String = null, hasChanged: IComparator = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (hasChanged != null) __obj.updateDynamic("hasChanged")(hasChanged)
    __obj.asInstanceOf[IOptions]
  }
}

