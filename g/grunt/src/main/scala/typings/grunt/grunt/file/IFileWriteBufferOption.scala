package typings.grunt.grunt.file

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see IFileWriteOptions
  */
trait IFileWriteBufferOption extends IFileWriteOptions {
  /**
    * The source file contents and file path are passed into this function,
    * whose return value will be used as the destination file's contents. If
    * this function returns `false`, the file copy will be aborted.
    */
  var process: js.UndefOr[js.Function1[/* buffer */ Buffer, Boolean]] = js.undefined
}

object IFileWriteBufferOption {
  @scala.inline
  def apply(encoding: String, noProcess: js.Any = null, process: /* buffer */ Buffer => Boolean = null): IFileWriteBufferOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (noProcess != null) __obj.updateDynamic("noProcess")(noProcess.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction1(process))
    __obj.asInstanceOf[IFileWriteBufferOption]
  }
}

