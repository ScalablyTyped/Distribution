package typings.knexDashPostgis

import typings.knex.knexMod.QueryBuilder
import typings.knex.knexMod.Raw
import typings.knex.knexMod.SafePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexDashPostgisMod {
  // Same as in Knex but not exported
  type ColumnName = String | Raw[js.Any] | (QueryBuilder[js.Any, js.Array[SafePartial[js.Any]]])
}
