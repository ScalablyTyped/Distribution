package typings.grommet

import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[small | medium | large | none | String] = js.undefined
  var row: js.UndefOr[small | medium | large | none | String] = js.undefined
}

object Anon_Column {
  @scala.inline
  def apply(
    column: small | medium | large | none | String = null,
    row: small | medium | large | none | String = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Column]
  }
}

