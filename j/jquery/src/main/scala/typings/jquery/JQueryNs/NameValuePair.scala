package typings.jquery.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// #endregion
trait NameValuePair extends js.Object {
  var name: String
  var value: String
}

object NameValuePair {
  @scala.inline
  def apply(name: String, value: String): NameValuePair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[NameValuePair]
  }
}

