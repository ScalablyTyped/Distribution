package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see IFileWriteOptions
  */
trait IFileWriteStringOption extends IFileWriteOptions {
  /**
    * The source file contents and file path are passed into this function,
    * whose return value will be used as the destination file's contents. If
    * this function returns `false`, the file copy will be aborted.
    */
  var process: js.UndefOr[js.Function1[/* file */ java.lang.String, scala.Boolean]] = js.undefined
}

object IFileWriteStringOption {
  @scala.inline
  def apply(noProcess: js.Any = null, process: /* file */ java.lang.String => scala.Boolean = null): IFileWriteStringOption = {
    val __obj = js.Dynamic.literal()
    if (noProcess != null) __obj.updateDynamic("noProcess")(noProcess)
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction1(process))
    __obj.asInstanceOf[IFileWriteStringOption]
  }
}

