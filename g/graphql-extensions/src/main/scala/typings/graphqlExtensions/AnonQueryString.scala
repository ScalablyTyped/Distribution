package typings.graphqlExtensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryString extends js.Object {
  var queryString: String
}

object AnonQueryString {
  @scala.inline
  def apply(queryString: String): AnonQueryString = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryString]
  }
}

