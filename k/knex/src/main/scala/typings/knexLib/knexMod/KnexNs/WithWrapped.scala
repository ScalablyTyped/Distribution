package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWrapped extends js.Object {
  def apply(alias: java.lang.String, callback: js.Function1[/* queryBuilder */ QueryBuilder, _]): QueryBuilder = js.native
  def apply(alias: java.lang.String, queryBuilder: QueryBuilder): QueryBuilder = js.native
}

