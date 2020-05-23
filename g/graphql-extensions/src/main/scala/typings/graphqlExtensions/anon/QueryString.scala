package typings.graphqlExtensions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryString extends js.Object {
  var queryString: String
}

object QueryString {
  @scala.inline
  def apply(queryString: String): QueryString = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryString]
  }
}

