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
@js.native
trait ITaskOptions extends js.Object {
  // files?: grunt.file.IFilesArray
  // files?: grunt.file.IFilesMap
  var files: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Any] = js.native
}

object ITaskOptions {
  @scala.inline
  def apply(): ITaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITaskOptions]
  }
  @scala.inline
  implicit class ITaskOptionsOps[Self <: ITaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiles(value: js.Any): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

