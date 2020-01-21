package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyOptions extends js.Object {
  /**
    * If true the schema generator will only be called once and the result will be cached.
    */
  var once: js.UndefOr[Boolean] = js.undefined
}

object LazyOptions {
  @scala.inline
  def apply(once: js.UndefOr[Boolean] = js.undefined): LazyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyOptions]
  }
}

