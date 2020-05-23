package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PgTableOptions extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
}

object PgTableOptions {
  @scala.inline
  def apply(only: js.UndefOr[Boolean] = js.undefined): PgTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PgTableOptions]
  }
}

