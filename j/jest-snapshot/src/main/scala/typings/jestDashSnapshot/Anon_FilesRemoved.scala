package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilesRemoved extends js.Object {
  var filesRemoved: Double
  var filesRemovedList: js.Array[String]
}

object Anon_FilesRemoved {
  @scala.inline
  def apply(filesRemoved: Double, filesRemovedList: js.Array[String]): Anon_FilesRemoved = {
    val __obj = js.Dynamic.literal(filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FilesRemoved]
  }
}

