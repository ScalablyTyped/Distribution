package typings.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptionsQuery extends js.Object {
  var query: js.Object | String
}

object UrlOptionsQuery {
  @scala.inline
  def apply(query: js.Object | String): UrlOptionsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptionsQuery]
  }
}

