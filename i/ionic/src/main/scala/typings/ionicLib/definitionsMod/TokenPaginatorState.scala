package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPaginatorState extends PaginatorState {
  var page_token: js.UndefOr[java.lang.String] = js.undefined
}

object TokenPaginatorState {
  @scala.inline
  def apply(done: scala.Boolean, loaded: scala.Double, page_token: java.lang.String = null): TokenPaginatorState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("loaded")(loaded)
    if (page_token != null) __obj.updateDynamic("page_token")(page_token)
    __obj.asInstanceOf[TokenPaginatorState]
  }
}

