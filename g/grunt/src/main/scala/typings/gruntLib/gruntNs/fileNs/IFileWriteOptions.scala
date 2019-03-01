package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file#grunt.file.copy}
  *
  * @see IFileWriteBufferOption
  * @see IFileWriteStringOption
  */
trait IFileWriteOptions extends js.Object {
  /**
    * These optional globbing patterns will be matched against the filepath
    * (not the filename) using grunt.file.isMatch. If any specified globbing
    * pattern matches, the file won't be processed via the `process` function.
    * If `true` is specified, processing will be prevented.
    */
  // noProcess?: string[]
  // noProcess?: boolean
  var noProcess: js.UndefOr[js.Any] = js.undefined
}

object IFileWriteOptions {
  @scala.inline
  def apply(noProcess: js.Any = null): IFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (noProcess != null) __obj.updateDynamic("noProcess")(noProcess)
    __obj.asInstanceOf[IFileWriteOptions]
  }
}

