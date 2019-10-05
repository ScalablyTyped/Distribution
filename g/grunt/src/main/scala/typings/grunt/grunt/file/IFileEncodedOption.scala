package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file#grunt.file.defaultencoding}
  */
trait IFileEncodedOption extends js.Object {
  var encoding: java.lang.String
}

object IFileEncodedOption {
  @scala.inline
  def apply(encoding: java.lang.String): IFileEncodedOption = {
    val __obj = js.Dynamic.literal(encoding = encoding)
  
    __obj.asInstanceOf[IFileEncodedOption]
  }
}

