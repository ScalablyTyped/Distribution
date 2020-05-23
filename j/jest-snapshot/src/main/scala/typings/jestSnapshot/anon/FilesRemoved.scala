package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesRemoved extends js.Object {
  var filesRemoved: Double
  var filesRemovedList: js.Array[String]
}

object FilesRemoved {
  @scala.inline
  def apply(filesRemoved: Double, filesRemovedList: js.Array[String]): FilesRemoved = {
    val __obj = js.Dynamic.literal(filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesRemoved]
  }
}

