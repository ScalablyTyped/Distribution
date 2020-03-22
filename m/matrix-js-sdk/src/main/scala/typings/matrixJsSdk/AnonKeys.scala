package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeys extends js.Object {
  // The text to query.
  var keys: String
  var query: String
}

object AnonKeys {
  @scala.inline
  def apply(keys: String, query: String): AnonKeys = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeys]
  }
}

