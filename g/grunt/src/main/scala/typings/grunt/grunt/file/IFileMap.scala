package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link http://gruntjs.com/configuring-tasks#files-array-format}
  */
trait IFileMap extends js.Object {
  /**
    * destination filename.
    */
  var dest: String
  /**
    * source filenames.
    */
  var src: js.Array[String]
}

object IFileMap {
  @scala.inline
  def apply(dest: String, src: js.Array[String]): IFileMap = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileMap]
  }
}

