package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  def apply(callback: js.Function): QueryBuilder = js.native
  def apply(raw: Raw): QueryBuilder = js.native
  def apply(tableName: knexLib.Identifier): QueryBuilder = js.native
  def apply(tableName: knexLib.TableName): QueryBuilder = js.native
}

