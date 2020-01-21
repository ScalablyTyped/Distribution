package typings.keystonejsFileAdapters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var originalFilename: String
}

object AnonId {
  @scala.inline
  def apply(id: String, originalFilename: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

