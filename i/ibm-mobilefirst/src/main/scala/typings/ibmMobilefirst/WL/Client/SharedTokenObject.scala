package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedTokenObject extends js.Object {
  var key: String
}

object SharedTokenObject {
  @scala.inline
  def apply(key: String): SharedTokenObject = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedTokenObject]
  }
}

