package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file#grunt.file.defaultencoding}
  */
trait IFileEncodedOption extends js.Object {
  var encoding: String
}

object IFileEncodedOption {
  @scala.inline
  def apply(encoding: String): IFileEncodedOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileEncodedOption]
  }
}

