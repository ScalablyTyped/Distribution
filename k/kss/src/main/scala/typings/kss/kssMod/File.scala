package typings.kss.kssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** bath to source directory */
  var base: String
  /** file contents */
  var contents: String
  /** full path to file */
  var path: String
}

object File {
  @scala.inline
  def apply(base: String, contents: String, path: String): File = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[File]
  }
}

