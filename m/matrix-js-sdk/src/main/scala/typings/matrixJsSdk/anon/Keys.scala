package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keys extends js.Object {
  // The text to query.
  var keys: String
  var query: String
}

object Keys {
  @scala.inline
  def apply(keys: String, query: String): Keys = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keys]
  }
}

