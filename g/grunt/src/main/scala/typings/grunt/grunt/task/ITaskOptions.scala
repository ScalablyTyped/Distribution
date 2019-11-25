package typings.grunt.grunt.task

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/configuring-tasks}
  *
  * A TaskConfig can be either be a full config or a compacted files config.
  * @see ITaskCompactOptions
  */
trait ITaskOptions extends js.Object {
  // files?: grunt.file.IFilesArray
  // files?: grunt.file.IFilesMap
  var files: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object ITaskOptions {
  @scala.inline
  def apply(files: js.Any = null, options: js.Any = null): ITaskOptions = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskOptions]
  }
}

