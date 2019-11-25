package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

