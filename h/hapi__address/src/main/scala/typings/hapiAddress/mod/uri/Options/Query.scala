package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /**
    * Allow the use of [] in query parameters.
    * 
    * @default false
    */
  val allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined
}

object Query {
  @scala.inline
  def apply(allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined): Query = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowQuerySquareBrackets)) __obj.updateDynamic("allowQuerySquareBrackets")(allowQuerySquareBrackets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

