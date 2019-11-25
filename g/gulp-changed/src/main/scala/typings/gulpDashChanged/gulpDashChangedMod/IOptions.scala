package typings.gulpDashChanged.gulpDashChangedMod

import typings.node.streamMod.Transform
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * The working directory the folder is relative to.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Extension of the destination files.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * Function that determines whether the source file is different from the destination file.
    * @default changed.compareLastModifiedTime
    */
  var hasChanged: js.UndefOr[IComparator] = js.undefined
  /**
    * Function to transform the path to the destination file. Should return the absolute path to the (renamed) destination file.
    */
  var transformPath: js.UndefOr[js.Function1[/* destPath */ String, String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    extension: String = null,
    hasChanged: (/* stream */ Transform, /* callback */ js.Function, /* sourceFile */ File, /* destPath */ String) => Unit = null,
    transformPath: /* destPath */ String => String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (hasChanged != null) __obj.updateDynamic("hasChanged")(js.Any.fromFunction4(hasChanged))
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction1(transformPath))
    __obj.asInstanceOf[IOptions]
  }
}

