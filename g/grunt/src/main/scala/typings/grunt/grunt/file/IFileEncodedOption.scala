package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file#grunt.file.defaultencoding}
  */
@js.native
trait IFileEncodedOption extends js.Object {
  var encoding: String = js.native
}

object IFileEncodedOption {
  @scala.inline
  def apply(encoding: String): IFileEncodedOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileEncodedOption]
  }
  @scala.inline
  implicit class IFileEncodedOptionOps[Self <: IFileEncodedOption] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
  }
  
}

