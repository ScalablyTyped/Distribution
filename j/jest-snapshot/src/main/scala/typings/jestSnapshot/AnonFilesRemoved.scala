package typings.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilesRemoved extends js.Object {
  var filesRemoved: Double
  var filesRemovedList: js.Array[String]
}

object AnonFilesRemoved {
  @scala.inline
  def apply(filesRemoved: Double, filesRemovedList: js.Array[String]): AnonFilesRemoved = {
    val __obj = js.Dynamic.literal(filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilesRemoved]
  }
}

