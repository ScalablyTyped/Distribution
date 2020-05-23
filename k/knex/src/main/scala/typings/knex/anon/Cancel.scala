package typings.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
}

object Cancel {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined): Cancel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

