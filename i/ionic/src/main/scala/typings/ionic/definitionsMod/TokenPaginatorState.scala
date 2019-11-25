package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPaginatorState extends PaginatorState {
  var page_token: js.UndefOr[String] = js.undefined
}

object TokenPaginatorState {
  @scala.inline
  def apply(done: Boolean, loaded: Double, page_token: String = null): TokenPaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    if (page_token != null) __obj.updateDynamic("page_token")(page_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPaginatorState]
  }
}

